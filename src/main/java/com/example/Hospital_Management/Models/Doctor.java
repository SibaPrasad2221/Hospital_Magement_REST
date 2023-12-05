package com.example.Hospital_Management.Models;

import java.util.PrimitiveIterator;

public class Doctor {
    private int docid;
    private String name;
    private int age;
    private String degree;
    private String specialized;
    private String location;
    private int experience;

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Doctor(int docid,String name, int age, String degree, String specialized, String location, int experience) {
        this.docid = docid;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.specialized = specialized;
        this.location = location;
        this.experience = experience;
    }

    public Doctor(){//if we are dealing with JSON data then we must need a default constructor

    }
}
