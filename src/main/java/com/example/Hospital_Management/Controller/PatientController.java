package com.example.Hospital_Management.Controller;

import com.example.Hospital_Management.Models.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient") //so this request mapping help to map web requests onto specific handler classes and/or handler methods
//eg; whatever patient api is there you can always access those using localhost:8080/patient/that_api
public class PatientController {
    @PostMapping
    public String addPatient(@RequestBody Patient patient){
        return "";
    }

    @GetMapping
    public String getPatient(@RequestParam("patient_id") int patient_id){
        return "";
    }
}
