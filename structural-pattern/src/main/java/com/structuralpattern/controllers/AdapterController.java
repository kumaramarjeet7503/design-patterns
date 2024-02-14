package com.structuralpattern.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.structuralpattern.adapter.Adapter;
import com.structuralpattern.adapter.LegacyAdapter;
import com.structuralpattern.adapter.LegecyImpl;
import com.structuralpattern.adapter.LegecyLog;
import com.structuralpattern.composite.Department;
import com.structuralpattern.composite.Employee;
import com.structuralpattern.composite.Organisation;
import com.structuralpattern.composite.Team;

@RestController
@RequestMapping("/adapter")
public class AdapterController {
   /*  Certainly! Here's a problem related to the Adapter design pattern:
        You are working on a legacy system that uses an old API for logging messages. The old API uses a custom format and interface that is not compatible with the modern logging framework you want to use. Implement an adapter that allows the modern logging framework to work with the old logging API, translating the modern logging calls into the format and interface expected by the old API.
        If you need more information or guidance on applying the Adapter design pattern to this problem, feel free to ask!
*/

    @GetMapping("/org")
    public String makeLog() {
        
        LegecyLog legecyLog = new LegecyImpl() ;
        legecyLog.makeLog() ;

        LegacyAdapter advanceLog = new LegacyAdapter(legecyLog) ;
        advanceLog.advanceLog() ;
        advanceLog.legecyLog() ;

        return new String("true");
    }

}
