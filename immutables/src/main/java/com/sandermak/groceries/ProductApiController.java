package com.sandermak.groceries;

import com.sandermak.groceries.model.ImmutableProduct;
import com.sandermak.groceries.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductApiController {


    @GetMapping("/product")
    Product getProduct() {
        Product p = Product.builder().name("Coffee!").brand("HotJava").price(2500).build();
        p.withOnSale(true);
        return p;
    }
}
