package com.example.demo.service;

import com.example.demo.pojo.Order;
import com.example.demo.pojo.Product;
import com.example.demo.pojo.User;
import com.example.demo.repository.OrderInfoRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class OrderInfoService {
/*    @Autowired
    OrderInfoRepository orderInfoRepository;*/
    @Autowired
    private OrderInfoRepository orderInfoRepository;

    public List<Map<String ,Object>> findUserByOid(Integer oid){
        return orderInfoRepository.findUserByOid(oid);
    }

    public List<Map<String ,Object>> findProductByOid(Integer oid){
        return orderInfoRepository.findProductByOid(oid);
    }

    public List<Map<String ,Object>> findInfoByOid(Integer oid){
     return orderInfoRepository.findInfoByOid(oid);
    }



}
