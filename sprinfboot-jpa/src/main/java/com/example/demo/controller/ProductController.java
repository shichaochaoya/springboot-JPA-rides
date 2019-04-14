package com.example.demo.controller;


import com.example.demo.pojo.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/welecome",method = RequestMethod.GET)
    public @ResponseBody
    String welcome(){
        return "Welcome to Dharma_mall";
    }


    @GetMapping("/product")
    public @ResponseBody
    List<Product> getAllProduct(){
        return productService.findAll();
    }

    @Cacheable(value = "product",key = "#pid",unless = "#result.price > 2000")
    @GetMapping("/product/pid/{pid}")
    public Product getProductByPid(@PathVariable int pid){
        return productService.findByPid(pid);
    }

    @GetMapping("/product/pname/{pname}")
    public List<Product> getProductByPname(@PathVariable String pname){
        return productService.findByPname(pname);
    }


    @PutMapping("product/save")
    public Product productAdd(@RequestBody Product product){
       return productService.createProduct(product);
    }

    @CacheEvict(value = "product",allEntries = true)
    @DeleteMapping("product/pid/{pid}")
    public String deleteByPid(@PathVariable int pid){
        return productService.deleteByPid(pid);
    }


    @CachePut(value = "product",key = "#result.pid")
    @PutMapping("product/update/{pid}/{num}")
    public Product updateByPid(@PathVariable int pid,@PathVariable int num){
        return productService.updateProduct(pid,num);
    }
}
