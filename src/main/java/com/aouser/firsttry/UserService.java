package com.aouser.firsttry;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  
  @Autowired
  private UserRepository userRepository;
  
  public List<User> allUsers() {
    // System.out.println("************************");
    // System.out.println(userRepository.findAll());
    // System.out.println("************************");
    return userRepository.findAll();
  }

  Optional<User> findUserById(String id) {
    return userRepository.findUserById(id);
  }

}
