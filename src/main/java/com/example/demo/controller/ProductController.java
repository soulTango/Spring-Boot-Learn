package com.example.demo.controller;


import com.example.demo.bean.Product;
import com.example.demo.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hyy on 2018/7/10.
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/{id}")
    public Product getProductInfo(@PathVariable("id") Long productId) {
        // TODO
        System.out.println("执行到了");
        return productMapper.select(productId);
    }

    @PutMapping("/{id}")
    public String updateProductInfo( @PathVariable("id") Long productId, @RequestBody Product newProduct) {
        // TODO
        int i =  productMapper.update(newProduct);
        if(i > 0 ){
            return "更新成功";
        }else
            return "更新失败";
    }
}