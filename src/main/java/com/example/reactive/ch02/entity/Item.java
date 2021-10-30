package com.example.reactive.ch02.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Item {

    private @Id String id;

    private String name;

    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
