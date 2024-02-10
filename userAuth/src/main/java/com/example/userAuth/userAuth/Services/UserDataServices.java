package com.example.userAuth.userAuth.Services;
import com.example.userAuth.userAuth.modals.UserModal;

public interface UserDataServices {
    //Crud operations

    String addUser(UserModal userData);

    String updateUser(UserModal userData);

    String deleteUser(UserModal userData);



}
