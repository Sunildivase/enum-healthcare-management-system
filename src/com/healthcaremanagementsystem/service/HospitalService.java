package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HospitalService {

    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<String , Hospital> hospitals = new HashMap<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){

        System.out.println("please enter id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter contact number");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email id");
        String emailId = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);
        hospital.setAddress(address);


        hospitals.put(String.valueOf(1),hospital);
        return hospital;
    }
    public void displayHospital(){
        Set<Map.Entry<String,Hospital>> entrySet = hospitals.entrySet();
        for(Map.Entry<String ,Hospital> entry: entrySet){
            System.out.println("key: "+entry.getKey()+" "+"value: "+entry.getValue());
        }
    }
}
