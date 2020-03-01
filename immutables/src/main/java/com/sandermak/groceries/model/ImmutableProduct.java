package com.sandermak.groceries.model;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeAbstract = "Immutable*", typeImmutable = "*")
public interface ImmutableProduct {

    String getName();

    String getBrand();

    int getPrice();

    @Value.Default
    default boolean getOnSale() {
        return false;
    }

}
