package com.example.Hospital_Management;

import org.springframework.web.bind.annotation.*;

@RestController //this annotation means all the apis are being written here
public class Dummy_Controller {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Siba, you are in a right path.!:)";
    }

    @GetMapping("/getMyName") //this annotation used to perform GET API operation and response we are getting a string
    public String getName(){
        return "Hi Siba Prasad";
    }

    @GetMapping("/addtwoNo") //this is query parameter req
    public String sum(@RequestParam("no1") Integer n1, @RequestParam("no2") Integer n2){
        //url would be http://localhost:8080/addtwoNo?no1=3&no2=4
        int sum = n1+n2; //here whatever value hit in no1 and no2 those will be assigned to n1 and n2
        return "Sum of "+n1+" and "+n2+" is: "+sum;
    }

}
