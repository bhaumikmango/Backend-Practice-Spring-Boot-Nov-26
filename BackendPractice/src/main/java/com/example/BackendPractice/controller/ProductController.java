package com.example.BackendPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BackendPractice.model.Product;
import com.example.BackendPractice.service.ProductService;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }


    //update product
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    //delete product
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
                        service.deleteProduct(prodId);
    }
}