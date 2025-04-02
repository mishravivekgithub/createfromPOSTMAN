package com.example.springbootgit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringtbootgitController {

    // help me to create a get method that return string
    @GetMapping
    public String successMessage(){
        return "Hello GIT Demo";
    }
    @GetMapping
    public String successdemo(){
        try {
            return "Hello GIT new Demo";
        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred";
        }
    }
    
}
