/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bailuyentap_11.ExThree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "An", 800),
                new Employee(2, "Binh", 1200),
                new Employee(3, "Cuong", 1500),
                new Employee(4, "Dung", 900)
        );

        List<String> result = list.stream()
                .filter(e -> e.getSalary() > 1000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}