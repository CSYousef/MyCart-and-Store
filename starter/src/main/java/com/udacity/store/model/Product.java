package com.udacity.store.model;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "products")

public class Product {
// TODO: Add the details of the product class
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id", nullable = false)
    Long Id;
   String Name;
   String Description;
    double Price;
    @Lob
    byte[] Picture;

    public Product() {
    }

    public Product(Long id, String name, String description, double price, byte[] picture) {
        Id = id;
        Name = name;
        Description = description;
        Price = price;
        Picture = picture;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public byte[] getPicture() {
        return Picture;
    }

    public void setPicture(byte[] picture) {
        Picture = picture;
    }
}
