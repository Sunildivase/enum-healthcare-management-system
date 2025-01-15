package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Department;
import com.healthcaremanagementsystem.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentService {

 private static Scanner scanner = new Scanner(System.in);

 private static HashMap<String, Department> departments = new HashMap<>();

 void printDepartment(Department department){
     System.out.println(department);
 }

 public Department createDepartment(){

     System.out.println("please enter id");
     int deptId = Integer.parseInt(scanner.nextLine());

     System.out.println("please enter department name");
     String deptName = scanner.nextLine();

     System.out.println("please enter doctor id");
     int doctorId = Integer.parseInt(scanner.nextLine());

     System.out.println("please enter hospital id");
     int hospitalId = Integer.parseInt(scanner.nextLine());

     Department department = new Department();
     department.setDeptId(deptId);
     department.setDeptName(deptName);
     department.setDoctorId(doctorId);
     department.setHospitalId(hospitalId);

     departments.put(String.valueOf(1),department);
     return department;

 }
 public void displayDepartment(){
     Set<Map.Entry<String, Department>> entrySet = departments.entrySet();
     for(Map.Entry<String,Department> entry : entrySet){
         System.out.println("key :"+entry.getKey()+" "+"value: "+entry.getValue());
     }
 }
}
