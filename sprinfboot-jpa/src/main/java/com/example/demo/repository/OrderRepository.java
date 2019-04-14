package com.example.demo.repository;

import com.example.demo.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    Order findByOid(Integer oid);
    List<Order> findAllByUid(Integer uid);
    List<Order> findAllByPid(Integer pid);
    //List<Order> findAllByDate(Date date);
    String deleteByOid(Integer oid);
    /*List<OrderInfo> findOrderInfo();*/



}
