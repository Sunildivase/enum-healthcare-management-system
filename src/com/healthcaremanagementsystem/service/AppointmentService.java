package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Appointment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppointmentService {

   private static final Scanner scanner = new Scanner(System.in);

   private static final HashMap<String, Appointment> appointments = new HashMap<>();

    void printAppointment(Appointment appointment){
        System.out.println(appointment);
    }

    public Appointment createAppointment(){

        System.out.println("please enter id");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department id");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPersonId(personId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);


        appointments.put(String.valueOf(1),appointment);
        return appointment;
    }

    public void displayAppointment(){
        Set<Map.Entry<String,Appointment>> entrySet = appointments.entrySet();
        for(Map.Entry<String,Appointment> entry : entrySet){
            System.out.println("key: "+entry.getKey()+" "+"value: "+entry.getValue());
        }
    }
}
