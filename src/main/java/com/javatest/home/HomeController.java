package com.javatest.home;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {  
    @RequestMapping("/home")  
    public String hello(){  
        return"HomePage!";  
    }  
}  