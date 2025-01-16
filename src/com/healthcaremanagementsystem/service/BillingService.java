package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Billing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BillingService {

    private  static Scanner scanner = new Scanner(System.in);

    private static HashMap<String , Billing> billings = new HashMap<>();

    void printBilling(Billing billing){
        System.out.println(billing);
    }
    public Billing createBilling(){

        System.out.println("please enter id");
        int billId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter total bill");
        int totalBill =Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();
        billing.setBillId(billId);
        billing.setBill(bill);
        billing.setTotalBill(totalBill);
        billing.setPersonId(personId);

        billings.put(String.valueOf(1),billing);
        return billing;
    }
    public void displayBilling(){
        Set<Map.Entry<String,Billing>> entrySet = billings.entrySet();
        for(Map.Entry<String ,Billing> entry: entrySet){
            System.out.println("key: "+entry.getKey()+" "+"value: "+entry.getValue());
        }
    }
}
