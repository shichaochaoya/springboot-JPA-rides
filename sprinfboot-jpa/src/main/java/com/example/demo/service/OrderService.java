package com.example.demo.service;

import com.example.demo.pojo.Order;
import com.example.demo.pojo.OrderInfo;
import com.example.demo.pojo.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }
    public Order findByOid(Integer oid){
        return orderRepository.findByOid(oid);
    }
    public List<Order> findByUid(Integer uid){
        return orderRepository.findAllByUid(uid);
    }
    public List<Order> findByPid(Integer pid){
        return orderRepository.findAllByPid(pid);
    }
    /*public List<Order> findByDate(Date date){
        return orderRepository.findAllByDate(date);
    }*/


    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    public String deleteByOid(Integer oid){
        orderRepository.deleteByOid(oid);
        return "delete success";
    }
    public String updateOrder(Order order){
        orderRepository.save(order);
        return "update : "+order.getOid()+"success";
    }

}
