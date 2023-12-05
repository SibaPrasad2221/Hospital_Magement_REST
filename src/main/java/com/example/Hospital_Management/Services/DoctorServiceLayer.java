package com.example.Hospital_Management.Services;

import com.example.Hospital_Management.Models.Doctor;
import com.example.Hospital_Management.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //it tells spring it's a service layer and logics are implemented here
public class DoctorServiceLayer {

    @Autowired
    private DoctorRepository rl;

    //RepositoryLayer rl = new RepositoryLayer(); //instead of this @Autowired annotations helps to access methods of repo class and we don't need to create object multiple time
    //String ans = rl.addDoctortoDB(doctor);

    public String addDoctor(Doctor doctor){
        //this is where some data processing usually happens

        String ans = rl.addDoctortoDB(doctor);
        return ans;
    }

    public String doctorWithMaxExp(){
        int max_exp =0;
        String doc_name="";
//        HashMap<Integer, Doctor> map= rl.doctorDB;
//        for(int key: map.keySet()){
//            if(map.get(key).getExperience() > max_exp){
//                max_exp = map.get(key).getExperience();
//                doc_name = map.get(key).getName();
//            }
//        }

        //or we can return list of doctors from repolayer
        List<Doctor> doctorList= rl.getAllDoctors();
        for(Doctor doctor: doctorList){

            if(doctor.getExperience() == max_exp){
                if(doctor.getName().compareTo(doc_name) < 0){ //if both doctor having same experience take the docotr which is lexicographically less
                    //eg : jagan and mohan having same experience then jagan would be considered
                    doc_name = doctor.getName();
                }
            }

            if(doctor.getExperience()>max_exp){
                max_exp = doctor.getExperience();
                doc_name= doctor.getName();
            }
        }

        return doc_name;
    }

    public String docotorHavingMBBS(){

        List<Doctor> doctorList= rl.getAllDoctors();

        String name= "xyz";
        for(Doctor doctor: doctorList){
            if(doctor.getDegree()=="MBBS"){
                name = doctor.getName();
            }
        }
        return name;
    }

    public List<Doctor> getListofDoctor(String degree){
        List<Doctor> doctorList= rl.getAllDoctors();

        List<Doctor> ans = new ArrayList<>();
        for(Doctor doctor: doctorList){
            if(doctor.getDegree().equals(degree)){
                ans.add(doctor);
            }
        }
        return ans;

    }
}
