package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.User;
import com.healthcaremanagementsystem.model.Person;

import java.util.HashMap;
import java.util.Scanner;

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
        User type = User.valueOf(scanner.nextLine());

        Person person = new Person();
        person.setPersonId(personId);
        person.setType (User.PERSON);

        persons.put(String.valueOf(1),person);
        return person;
    }

//    public void displayPerson(){
//
//    }
}
