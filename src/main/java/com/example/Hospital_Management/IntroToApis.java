package com.example.Hospital_Management;

import com.example.Hospital_Management.Models.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class IntroToApis {

    //for this dummy project we will use hashamp as our temporary data
    HashMap<Integer, User> userDb = new HashMap<>();

    //request using req/query params
    @PostMapping("/addUser")
    public String addUser(@RequestParam("userid") Integer uid,
                          @RequestParam("name") String name,
                          @RequestParam("age") Integer age){

        User user = new User(uid,name, age);

        userDb.put(uid, user);
        return "User with user id "+uid+" is added to DB";

        //hit api would be http://localhost:8080/addUser?userid=11&name=SibaPrasad&age=23
    }


    @GetMapping("/getUser")
    public String getUser(@RequestParam("userid") Integer uid){
        User user = userDb.get(uid);
        return "Name: "+user.getName()+"\nUser id: "+user.getUserId()+"\nAge: "+user.getAge();
        //accessing memebers of calling using getter is a tostring method, and always a very good practice to use this instead of calling members directly

        //hit api would be http://localhost:8080/getUser?userid=11
    }

    //request using req. body
    @PostMapping("/addUserViaReqBody")
    public String addUser(@RequestBody User user){ //when we are adding request body as param we should definitely should have default constructor
        //whatever data would be sent in request body params from frontend those would be treated as JSON object format

        System.out.println("User object entered : "+user);
//        System.out.println("Attributes entered "+ user.getUserId()+"-"+user.getName()+"-"+user.getAge());
        System.out.println(user.toString()); //tostring method: used to print all the attributes of an object in string format

        int key = user.getUserId();
        userDb.put(key, user);
        return "User added";
    }

    @GetMapping("/getuserViaReqBody")
    public String getUserInfo(@RequestParam("userId") Integer userId){
        try{
            User user = userDb.get(userId);
            return user.getName();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //request using path_params
    @GetMapping("/getInfoByPathParam/{userId}") //eg; linkedin and leetcode url are exmaple of request using path param
    public User getUserInfoViaPath(@PathVariable("userId") Integer userId){
        User user = userDb.get((userId));
        return user;
    }
}
