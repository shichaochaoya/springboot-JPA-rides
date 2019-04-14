package com.example.demo.repository;

import com.example.demo.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderInfoRepository extends JpaRepository<Order,Integer> {

    @Query(value = "SELECT o.oid,o.uid,u.uname,o.pid,o.number,o.datetime FROM order_ o ,user u where o.oid=:oid and u.uid=o.uid",nativeQuery = true)
    List<Map<String ,Object>> findUserByOid(@Param("oid") Integer oid);

    @Query(value = "SELECT o.oid,o.uid,o.pid,p.pname,p.price,p.birthplace,o.number,o.datetime FROM order_ o ,product p where o.oid=:oid and p.pid=o.pid",nativeQuery = true)
    List<Map<String ,Object>> findProductByOid(@Param("oid") Integer oid);

    @Query(value = "SELECT o.oid,o.uid,u.uname,o.pid,p.pname,p.price,p.birthplace,o.number,o.datetime FROM order_ o ,product p,user u where o.oid=:oid and p.pid=o.pid and u.uid=o.uid",nativeQuery = true)
    List<Map<String ,Object>> findInfoByOid(@Param("oid") Integer oid);
}
