package com.picnic.groceries;

import com.picnic.groceries.model.IProduct;
import com.picnic.groceries.model.ImmutableProduct;
import com.picnic.groceries.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductApiController {


    @GetMapping("/product")
    IProduct getProduct() {
        Product coffee = Product.builder()
                .name("Coffee!")
                .brand("HotJava")
                .price(250)
                .build();

        return coffee.withOnSale(true);

    }
}
