package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/web")
public class WebController {
    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping
    public String index(ModelMap map){
        logger.info("web controller - homepage");
        map.put("title","FIRET BLOOD");
        if(rand() < 5){
            throw new RuntimeException("sb");
        }
        return "index";
    }

    @RequestMapping("/error")
    public String error(){
        final String errorInfo = "cgh";
        logger.error(errorInfo);
        throw new RuntimeException(errorInfo);
    }


    @RequestMapping("/product")
    public String product(ModelMap map){
        List<Product> productList = productService.findAll();
        map.put("products",productList);
        return "products";
    }

    private int rand(){
        int rand = (int) (Math.random()*(10-1)+1);
        logger.info("Generated random number: " + rand);
        return rand;
    }

}