package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Prescription;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrescriptionService {

   private static Scanner scanner = new Scanner(System.in);

   private static HashMap<String, Prescription> prescriptions = new HashMap<>();

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }

    public Prescription createPrescription(){

        System.out.println("please enter id");
        int prescriptionId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription details");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setPersonId(personId);

        prescriptions.put(String.valueOf(1),prescription);
        return prescription;
    }
    public void displayPrescription(){
        Set<Map.Entry<String,Prescription>> entrySet = prescriptions.entrySet();
        for(Map.Entry<String, Prescription> entry : entrySet){
            System.out.println("key: "+entry.getKey()+" "+"value: "+entry.getValue());
        }
    }
}
