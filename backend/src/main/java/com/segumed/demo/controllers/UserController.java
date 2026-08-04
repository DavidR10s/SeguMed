
package com.segumed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {
    
    @GetMapping("/api/users")
    public String getMethodName(@RequestParam String param)
    {
        return new String();
    }
    
    public String info()
    {
        
        return "";
    }
    
}
