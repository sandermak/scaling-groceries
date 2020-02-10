package com.sandermak.groceries.model;

import org.immutables.value.Value;

/**
 * With this configuration, `Immutable` is stripped from the interface name,
 * and nothing is added to the generated classname. Ergo, the generated
 * immutable class is named `Product`.
 */
@Value.Style(typeAbstract = "Immutable*", typeImmutable = "*")
@Value.Immutable
public interface ImmutableProduct {

    String getName();

    String getBrand();

    int getPrice();

    @Value.Default
    default boolean getOnSale() {
        return false;
    }

}
