package com.example.product_management;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products;

    public ProductService() {
        // Khởi tạo 3 sản phẩm giả lập
        this.products = new ArrayList<>(Arrays.asList(
                new Product(1, "Laptop Dell", 15000000.0),
                new Product(2, "Chuột không dây", 250000.0),
                new Product(3, "Bàn phím cơ", 800000.0)
        ));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
