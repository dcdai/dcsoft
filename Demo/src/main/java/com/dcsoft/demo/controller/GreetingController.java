package com.dcsoft.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.RestController;

import com.dcsoft.demo.JavaConfig;
import com.dcsoft.demo.JavaConfigProperty;
import com.dcsoft.springbootdome.scope.DemoPrototypeService;
import com.dcsoft.springbootdome.scope.DemoSingletonService;  
  
@RestController  
@RequestMapping("/test")
public class GreetingController {  
  
    private static final String template = "Hello, %s!";  
    private final AtomicLong counter = new AtomicLong();  
  
     @Autowired
     DemoPrototypeService p1;
	 @Autowired
	 DemoPrototypeService p2;
	 @Autowired
	 DemoSingletonService s1;
	 @Autowired
	 DemoSingletonService s2;
	 @Autowired
	 JavaConfig javaConfig;
	 @Autowired
	 JavaConfigProperty javaConfigProperty;

    @RequestMapping(value = "/test1", method=RequestMethod.GET)
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {  
        return new String(counter.incrementAndGet()+"    "+ 
                            String.format(template, name));  
    }  
    
    
    @RequestMapping(value = "/test2", method=RequestMethod.GET)
    public String test2(@RequestParam(value="name", defaultValue="World") String name) {  
    	
    	 System.out.println("S1 ��S2�Ƿ���� ��"+ s1.equals(s2));
    	 System.out.println("P1 ��P2�Ƿ���� ��"+ p1.equals(p2));
    	 javaConfig.outputResource();
    	 
    	 javaConfigProperty.outputResource();
    	 
    	 
    	 
        return new String(counter.incrementAndGet()+"    "+ 
                            String.format(template, name));  
    }  
}  
