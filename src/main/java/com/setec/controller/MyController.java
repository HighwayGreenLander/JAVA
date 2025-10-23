package com.setec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.setec.entities.Booked;

@Controller
public class MyController {

    @GetMapping({"/", "/home"})
    public String home(Model mod) {
    	Booked booked = new Booked();
    	mod.addAttribute("booked",booked);
    	
    	
        return "index"; 
    }

    @GetMapping("/service")
    public String service() {
        return "service"; 
    }

    @GetMapping("/about")
    public String about() {
        return "about"; 
    }
    
    @GetMapping("/menu")
    public String menu() {
    	return "menu";
    }
    
    @GetMapping("/reservation")
    public String reservation(Model mod) {
    	Booked booked = new Booked();
    	mod.addAttribute("booked",booked);
    	
    	return "reservation";
    }
    
    @GetMapping("/testimonial")
    public String testimonial() {
    	return "testimonial";
    }
    
    @GetMapping("/contact")
    public String contact() {
    	return "contact";    
    }
    
    @PostMapping("/success")
    public String success(@ModelAttribute Booked booked) {
        return "success";
    }


    
}

