package com.prodmanager.product.controllers;

import com.prodmanager.product.entities.Product;
import com.prodmanager.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAllProducts();
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findProductById(id);
    }
}
