package com.healthcaremanagementsystem;

import com.healthcaremanagementsystem.model.Person;
import com.healthcaremanagementsystem.service.DepartmentService;
import com.healthcaremanagementsystem.service.DoctorService;
import com.healthcaremanagementsystem.service.HospitalService;
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
            System.out.println("2. create doctor");
            System.out.println("3. create hospital");
            System.out.println("4. create department");
            System.out.println("5. create appointment");
            System.out.println("6. create prescription");
            System.out.println("7. create billing");

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
                    DoctorService doctorService = new DoctorService();
                    doctorService.createDoctor();
                    doctorService.displayDoctor();
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    HospitalService hospitalService = new HospitalService();
                    hospitalService.createHospital();
                    hospitalService.displayHospital();
                    System.out.println("hospital created successfully");
                    break;

                case 4:
                    DepartmentService departmentService = new DepartmentService();
                    departmentService.createDepartment();
                    departmentService.displayDepartment();
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
