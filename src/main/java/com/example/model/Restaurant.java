package com.example.model;

import lombok.Data;

@Data
public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private Manager manager;
}
