package com.example.demo.service;


import com.example.demo.pojo.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User findByUid(int uid){
        return userRepository.findByUid(uid);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public String deleteByUid(int uid){
        userRepository.deleteByUid(uid);
        return "delete success";
    }
    public String updateUser(User user){
        userRepository.save(user);
        return "update "+user.getUname()+"success";
    }

}
