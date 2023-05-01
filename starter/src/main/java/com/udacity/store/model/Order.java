package com.udacity.store.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")

public class    Order {
//TODO: Add the details of the order class
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id", nullable = false)
    Long id;
    String name;
    double TotalPrice;

    public Order() {

    }

    public Order(Long id, String name, double totalPrice) {
        this.id = id;
        this.name = name;
        TotalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }
}
