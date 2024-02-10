package com.example.userAuth.userAuth.controllers;
import com.example.userAuth.userAuth.modals.UserModal;
import com.example.userAuth.userAuth.Services.UserDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin //for cross origin requests from the frontend to the backend without any errors if the ports are different
@RestController
@RequestMapping("/user")

public class User {
    //dependency injection

    @Autowired
    public UserDataServices userServices;


    @PostMapping("/addUser")
    public String addUser(@RequestBody UserModal userData){

        return userServices.addUser(userData);
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody UserModal userData){
        return userServices.updateUser(userData);

    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestBody UserModal userData){
        return userServices.deleteUser(userData);
    }
}
