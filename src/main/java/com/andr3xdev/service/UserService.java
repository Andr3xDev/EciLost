package com.andr3xdev.service;

import com.andr3xdev.models.UserModel;
import com.andr3xdev.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class IUserService {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }
}