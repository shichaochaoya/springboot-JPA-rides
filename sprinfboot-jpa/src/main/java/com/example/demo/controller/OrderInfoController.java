package com.example.demo.controller;


import com.example.demo.pojo.Order;
import com.example.demo.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping("/orderInfoUser/oid/{oid}")
    public List<Map<String ,Object>> getUserByOid(@PathVariable int oid){
        return orderInfoService.findUserByOid(oid);
    }
    @GetMapping("/orderInfoProduct/oid/{oid}")
    public List<Map<String ,Object>> getProductByOid(@PathVariable int oid){
        return orderInfoService.findProductByOid(oid);
    }

    @GetMapping("/orderInfo/oid/{oid}")
    public List<Map<String ,Object>> getInfoByOid(@PathVariable int oid){
        return orderInfoService.findInfoByOid(oid);
    }
}
