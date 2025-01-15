package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.User;
import com.healthcaremanagementsystem.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonService {

    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<String, Person> persons = new HashMap<>();

    void printPerson(Person person){
        System.out.println(person);
    }

    public Person cretePerson(){

        System.out.println("please enter id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type of person");
        String type= scanner.nextLine().toUpperCase(); // enum value convert in string using toUpperCase()

        System.out.println("please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter alternateMobile");
        String alternateMobile = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setType (User.PERSON); // here we use enum
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setContactNo(contactNo);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);

        persons.put(String.valueOf(1),person);
        return person;
    }

    public void displayPerson(){
        Set<Map.Entry<String, Person>> mapSet = persons.entrySet();
        for (Map.Entry<String ,Person> entry : mapSet){
            System.out.println("key: "+ entry.getKey() + "value: "+entry.getValue() );
        }
    }
}
