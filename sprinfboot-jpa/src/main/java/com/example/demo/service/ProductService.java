package com.example.demo.service;


import com.example.demo.pojo.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProductService  {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findByPid(int pid){
        return productRepository.findById(pid)
                .orElse(new Product("null",0.0,"null",0));
    }
    public List<Product> findByPname(String pname){
        return productRepository.findByPname(pname);
    }
    public Product createProduct(Product product){
        return productRepository.save(product);
    }
    public String deleteByPid(int pid){
         productRepository.deleteByPid(pid);
         return "purchase success ";
    }
   /* public String buyProduct(int num,int pid){
         productRepository.updateNumber(num,pid);
         return "buy "+ num +" success";
    }*/
   public Product updateProduct(int pid,int num){
       Product product = findByPid(pid);
       int count = product.getNumber();
       product.setNumber(count - num);
       return productRepository.save(product);
   }


}
