package com.aouser.firsttry;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/v1")
public class UserController {
  @Autowired
  private UserService userService;
  @GetMapping
  public ResponseEntity<List<User>> getAllUsers(){
    return new ResponseEntity<List<User>>(userService.allUsers(),HttpStatus.OK);
  }
  // @GetMapping("/{id}")
  // public ResponseEntity<Optional<User>> findUserById(String id){
  //   return new ResponseEntity<Optional<User>>(userService.findUserById(id),HttpStatus.OK);
  // }
  @GetMapping("/{id}")
public ResponseEntity<User> findUserById(@PathVariable("id") String id){
    Optional<User> userOptional = userService.findUserById(id);
    if (userOptional.isPresent()) {
        return new ResponseEntity<>(userOptional.get(), HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
}
