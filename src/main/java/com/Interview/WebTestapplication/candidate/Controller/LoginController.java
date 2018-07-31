package com.Interview.WebTestapplication.candidate.Controller;

import com.Interview.WebTestapplication.candidate.Entity.POC;
import com.Interview.WebTestapplication.candidate.Entity.User;
import com.Interview.WebTestapplication.candidate.Repository.POCRepository;
import com.Interview.WebTestapplication.candidate.Repository.UserRepository;
import com.Interview.WebTestapplication.candidate.Services.LoginService;
import com.Interview.WebTestapplication.candidate.Services.UserService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.net.SocketException;
import java.util.Arrays;
import java.util.List;


@RestController
@SessionAttributes("name")
//@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginservice;

    @Autowired
    UserRepository repository;

    @Autowired
    POCRepository pocrepo;
//
//    @RequestMapping(value="/login", method = RequestMethod.GET)
//    public String showLoginPage(ModelMap model){
//        return "login";
//    }
//
//    @RequestMapping(value="/welcome", method = RequestMethod.GET)
//    public String showWelcomePage(ModelMap model)
//    {
//        return "welcome";
//    }

    @RequestMapping("/findbyusername")
    public String findByUsername(@RequestParam("username") String username){
        String result = "";

        for(User users: repository.findByUserName(username)){
            result += users.toString() + "<br>";
        }
        return result;
    }
    @RequestMapping("/save")
    public String process(){
        // save a single Customer
        repository.save(new User("Jack", "Smith"));

        // save a list of Customers
        repository.saveAll(Arrays.asList(new User("Adam", "Johnson"), new User("Kim", "Smith"),
                new User("David", "Williams"), new User("Peter", "Davis")));

        return "Done";
    }

    @RequestMapping("/savepoc")
    public String processPOC(){
        // save a single Customer
        //pocrepo.save(new POC("Arpitha","QA", "Digital","Deepti"));


        //save a list of Users
        pocrepo.saveAll(Arrays.asList(new POC("Riya", "QA","Digital","Deepti"),
                new POC("Foram","Developer","Digital","Nataraj"),
                new POC("Chakri","Developer","Digital","Nataraj"),
                new POC("Nataraj","Developer","Digital","Nayan"),
                new POC("Abhinav", "QA","Search","Manoj"),
                new POC("Vandana","QA","Search","Abhinav"),
                new POC("Anand","Developer","Search","Manu"),
                new POC("Pramod","Developer","Search","Manu")));


        return "Done";
    }

    @RequestMapping("/findbyFullname")
    public String findByFullName(@RequestParam("fullname") String fullname){
        String result = "";
        for(POC poc: pocrepo.findByFullName(fullname)){
            result += poc.toString() + "<br>";
        }
        return result ;
    }


    @RequestMapping("/findAll")
    public String findAll() throws InterruptedException {
        Thread.sleep(5000);
        String result = "";
        for (POC poc : pocrepo.findAll()) {
            result += poc.toString() + "<br>";
        }
        return result;
    }

    @RequestMapping("/findbyService")
    public void findByService(@RequestParam("service") String service) throws SocketException, InterruptedException {
        Thread.sleep(10000);
        throw new SocketException();
    }


//    @RequestMapping(value="/login", method = RequestMethod.POST)
//    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
//
//        boolean isValidUser = loginservice.validateUser(name, password);
//
//        if (!isValidUser) {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }
//
//        model.put("name", name);
//        model.put("password", password);
//
//        return "welcome";
//    }

}
