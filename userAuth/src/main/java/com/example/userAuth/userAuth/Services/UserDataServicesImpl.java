package com.example.userAuth.userAuth.Services;
import com.example.userAuth.userAuth.modals.UserModal;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.userAuth.userAuth.DAO.IUserDAO;
import org.springframework.stereotype.Service;

@Service
public class UserDataServicesImpl implements UserDataServices{

    @Autowired
    private IUserDAO userDAO;

    @Override
    public String addUser(UserModal userData) {

        if(userDAO.existsById(userData.getId())){
            return "user already exists";
        }
        else{
            userDAO.save(userData);
            return "user added successfully";
        }


    }

    @Override
    public String updateUser(UserModal userData){
        if(userDAO.existsById(userData.getId())){
            userDAO.save(userData);
            return "User data updated successfully!";
        }
        else{
            return "User not found!!";

        }
    }

    @Override
    public String deleteUser(UserModal userData) {
        if (!userDAO.existsById(userData.getId())) {
            return "user not found!!!";
        }
        else {
            userDAO.delete(userData);
            return "User deleted successfully!!";
        }
    }
}
