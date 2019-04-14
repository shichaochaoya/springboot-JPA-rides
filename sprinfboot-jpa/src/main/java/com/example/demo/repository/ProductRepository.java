package com.example.demo.repository;


import com.example.demo.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Null;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    //public Product findByPid(int pid);
    Product save(Product product);
    String deleteByPid(int pid);
    List<Product> findByPname(String pname);
    /*@Query(value = "update product p set p.number = p.number-:num where pid=:pid",nativeQuery = true)
    String updateNumber(@Param("num") int num, @Param("pid") int pid);*/

}
