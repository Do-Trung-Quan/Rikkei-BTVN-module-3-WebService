package com.example.product_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductService productService;

    // Tiêm ProductService thông qua Constructor
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}
