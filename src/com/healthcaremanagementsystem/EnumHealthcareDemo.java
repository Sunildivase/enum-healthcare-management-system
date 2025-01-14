package com.healthcaremanagementsystem;

import com.healthcaremanagementsystem.model.Person;
import com.healthcaremanagementsystem.service.PersonService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnumHealthcareDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Integer,String> testPerson = new HashMap<>();

        int option = 0;
        do{
            System.out.println("--------------healthcare-management-system--------------------------");
            System.out.println("1. create person");

            System.out.println("please enter the option");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    PersonService personService = new PersonService();
                    personService.cretePerson();
                    System.out.println("person created successfully");
                    break;
            }

        }
        while(option!=0);{
            System.out.println("thank you !!!");
        }
    }
}
