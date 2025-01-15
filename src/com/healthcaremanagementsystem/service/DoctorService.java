package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.User;
import com.healthcaremanagementsystem.model.Doctor;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoctorService {

   private static Scanner scanner = new Scanner(System.in);

   private static HashMap<String, Doctor> doctors = new HashMap<>();

   void printDoctor(Doctor doctor){
       System.out.println(doctor);
   }

   public Doctor createDoctor(){

       System.out.println("please enter id");
       int doctorId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter first name ");
       String firstName = scanner.nextLine();

       System.out.println("please enter last name");
       String lastName = scanner.nextLine();

       System.out.println("please enter age ");
       int age = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter gender");
       String gender = scanner.nextLine();

       System.out.println("please enter contact number");
       String contactNo = scanner.nextLine();

       System.out.println("please enter speciality");
       String speciality = scanner.nextLine().toUpperCase();

       System.out.println("please enter experience");
       int experience = Integer.parseInt(scanner.nextLine());

       Doctor doctor = new Doctor();
       doctor.setDoctorId(doctorId);
       doctor.setFirstName(firstName);
       doctor.setLastName(lastName);
       doctor.setAge(age);
       doctor.setGender(gender);
       doctor.setContactNo(contactNo);
       doctor.setSpeciality(User.DOCTOR);
       doctor.setExperience(experience);


       doctors.put(String.valueOf(1),doctor);
       return doctor;
   }
   public void displayDoctor(){
       Set<Map.Entry<String ,Doctor>> entrySet = doctors.entrySet();
       for(Map.Entry<String,Doctor> entry : entrySet){
           System.out.println("key: "+entry.getKey()+" "+"value: "+entry.getValue());
       }
   }
}
