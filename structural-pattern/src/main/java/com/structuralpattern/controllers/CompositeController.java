package com.structuralpattern.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.structuralpattern.composite.Department;
import com.structuralpattern.composite.Employee;
import com.structuralpattern.composite.Organisation;
import com.structuralpattern.composite.Team;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/composite")
public class CompositeController {

   /* 
        You are working on a company organizational structure system.
        The system needs to represent the hierarchy of employees, including individual employees, managers, and departments.
        The system should be able to calculate the total salary of a manager and all their subordinates, as well as the total salary of a department and all its employees.
        Use the Composite design pattern to model the organizational structure in the system.
        Let me know if you have any other questions or need further assistance with the Composite design pattern!
    */
    @GetMapping("/org")
    public String getOrganisationDetails() {

        Employee ramesh = new Employee("Ramesh") ;
        Team qa = new Team(ramesh,"QA") ;
        Organisation xtreme = new Department(qa,"Testing") ;
        xtreme.getDesign() ;

        return new String("true");
    }
    
}
