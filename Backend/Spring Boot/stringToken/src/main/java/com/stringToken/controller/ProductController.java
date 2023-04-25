package com.stringToken.controller;

import com.stringToken.model.Product;
import com.stringToken.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/")
    public String addProduct(@RequestBody Product product) {
        service.addProduct(product);
        return "Product Added";
    }

    @GetMapping("/{id}")
    public Optional<Product> findProductById(@PathVariable String id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Product> findAllProduct() {
        return service.findAllProduct();
    }
}