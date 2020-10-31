package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Owner {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String username;
    private String password;
}
