package com.picnic.groceries;

import com.picnic.groceries.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductApiController {


    @GetMapping("/product")
    Product getProduct() {
        Product coffee = new Product("Coffee!", "HotJava", 250);
        return coffee;
    }
}
