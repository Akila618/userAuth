package com.example.userAuth.userAuth.DAO;

import com.example.userAuth.userAuth.modals.UserModal;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userAuth.userAuth.Services.UserDataServicesImpl;

public interface IUserDAO extends JpaRepository<UserModal, Integer> {

    boolean existsByEmail(String email);
}
