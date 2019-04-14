package com.example.demo.repository;

import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUid(int uid);
    String deleteByUid(int uid);
}
