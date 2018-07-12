package com.example.demo.dao;

import com.example.demo.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * Created by hyy on 2018/7/10.
 */

@Mapper
public interface ProductMapper {
    Product select(@Param("id") long id);
    int update(Product product);
}
