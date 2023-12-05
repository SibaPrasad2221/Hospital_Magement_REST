package com.example.Hospital_Management.Repository;

import com.example.Hospital_Management.Models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository //it tells spring that here all the data is stored
public class DoctorRepository {
    HashMap<Integer, Doctor> doctorDB = new HashMap<>();

    public String addDoctortoDB(Doctor doctor){
        doctorDB.put(doctor.getDocid(), doctor);
        return "Doctor has been added with doctor id: "+doctor.getDocid();
    }

    public List<Doctor> getAllDoctors(){
        return doctorDB.values().stream().toList();
    }
}
