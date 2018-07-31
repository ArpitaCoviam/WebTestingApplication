package com.Interview.WebTestapplication.candidate.Controller;

import com.Interview.WebTestapplication.candidate.Repository.POCRepository;
import com.Interview.WebTestapplication.candidate.Repository.UserRepository;
import com.Interview.WebTestapplication.candidate.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class JSPPageCallController {

    @Autowired
    LoginService loginservice;

    @Autowired
    UserRepository repository;

    @Autowired
    POCRepository pocrepo;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model)
    {
        return "welcome";
    }



//    @RequestMapping(value="/findbyFullname", method = RequestMethod.GET)
//    public String findemployeeFullname(ModelMap model)
//    {
//        return "backbutton";
//    }


}
