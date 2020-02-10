package com.sandermak.groceries;

import com.sandermak.groceries.model.ImmutableProduct;
import com.sandermak.groceries.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductApiController {


    @GetMapping("/product")
    private ImmutableProduct getProduct() {
        Product p = Product.builder().brand("HotJava").name("Coffee!").price(2500).build();

        return p.withOnSale(true);
    }
}
