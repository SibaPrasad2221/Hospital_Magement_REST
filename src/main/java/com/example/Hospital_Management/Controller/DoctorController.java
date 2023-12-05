package com.example.Hospital_Management.Controller;

import com.example.Hospital_Management.Models.Doctor;
import com.example.Hospital_Management.Services.DoctorServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //API endpoints are wirtten here
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorServiceLayer slObj;

    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody Doctor doctor){
        String res = slObj.addDoctor(doctor);
        return res;
    }

    @GetMapping("/getDocMaxExp")
    public String getDocWithMaxExp(){
        String ans =  slObj.doctorWithMaxExp();
        return ans;
    }

    @GetMapping("/getNameHavingDegreeMBBS")
    public String doctorwithMBBS(){
        return slObj.docotorHavingMBBS();
    }

    @GetMapping("/getListOfDocwithDegree")
    public List<Doctor> getDoctorWithDegree(@RequestParam("degree") String degree){
        return slObj.getListofDoctor(degree);
    }
}
