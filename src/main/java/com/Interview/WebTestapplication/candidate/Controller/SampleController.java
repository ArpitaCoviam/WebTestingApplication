//package com.Interview.WebTestapplication.candidate.Controller;
//
//import com.Interview.WebTestapplication.candidate.Entity.UserData;
//import com.Interview.WebTestapplication.candidate.Services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class SampleController {
//
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String hello(){
//        return "Hello";
//
//    }
//
//    @RequestMapping(value = "/findAllUsers", method = RequestMethod.GET)
//    public List<UserData> findAll(){
//        return this.userService.findAllUsers();
//
//    }
//}
