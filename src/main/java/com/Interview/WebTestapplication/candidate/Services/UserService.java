package com.Interview.WebTestapplication.candidate.Services;

import com.Interview.WebTestapplication.candidate.Entity.User;
import com.Interview.WebTestapplication.candidate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findByUserName(String userName)  {
       return this.userRepository.findByUserName(userName);
    }
}
