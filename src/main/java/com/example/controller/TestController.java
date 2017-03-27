package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Record;
import com.example.service.TestServices;

@RestController
public class TestController {

	@Autowired
    private TestServices testServices;
	
	
	
	@RequestMapping(value = "/show")
    public String show(){
        return testServices.show();
    }

    @RequestMapping(value = "/showDao")
    public Object showDao(int age){
        return testServices.showDao(age);
    }
    
    @RequestMapping(value = "/country/{country}")  
    public Object showDao(@PathVariable String country){
        return testServices.findByCountry(country);
    }
    
    @RequestMapping(value = "/insertRecord")
    public int insertRecord(){
    	Record r = new Record();
    	r.setActualhours("1");
    	r.setDate(new Date());
    	r.setFixedhours("2");
    	r.setType(1);
        return testServices.insertRecord(r);
    }
    
    
    
}
