package com.example.model;

import lombok.Data;

@Data
public class Dish {
    private Long id;
    private String name;
    private String description;
    private double price;
}
