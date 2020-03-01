package com.picnic.groceries.model;

import org.immutables.value.Value;

import java.util.Objects;

@Value.Immutable
@Value.Style(typeAbstract="I*",typeImmutable="*")
public interface IProduct {

    String getName();
    String getBrand();
    int getPrice();

    @Value.Default
    default boolean getOnSale(){
        return false;
    }

}
