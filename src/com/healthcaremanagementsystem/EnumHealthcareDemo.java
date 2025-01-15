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
                    personService.displayPerson();
                    System.out.println("person created successfully");
                    break;

                case 2:
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    System.out.println("hospital created successfully");
                    break;

                case 4:
                    System.out.println("department created successfully");
                    break;

                case 5:
                    System.out.println("appointment created successfully");
                    break;

                case 6:
                    System.out.println("prescription created successfully");
                    break;

                case 7:
                    System.out.println("billing create successfully");
                    break;

                default:
                    System.out.println("please enter valid input");
            }

        }
        while(option!=0);{
            System.out.println("thank you !!!");
        }
    }
}
