package com.example.Entity;

import com.example.model.Dish;
import com.example.model.Extra;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonIgnore
    private Order order;

    @Column(name = "dish_id")
    private Long dishId;

    @Transient
    private Dish dish;

    @Column(name = "extra_id")
    private Long extraId;

    @Transient
    private Extra extras;

    @Column(name = "total", precision = 6, scale =  2, nullable = false)
    private double subTotal;
}
