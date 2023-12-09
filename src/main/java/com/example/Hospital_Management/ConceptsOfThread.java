package com.example.Hospital_Management;


class myThread extends Thread{
    //all the properties of thread will be used in mythread
    public void run(){
        //this run method actually written in thread class to execute main method but here we override for our purpose
        //this run method now acting like a main method
        //now we have two main method to perform operation and parallel execution will happen

        while(1>0){
            System.out.println("I am inside my thread execution");
        }
    }
}
public class ConceptsOfThread {
    public static void main(String[] args){
        //main class itself is a thread
        //Java provides builtin thread class (like we do in exception)
        System.out.println("I am inside main thread class");
    }
}
