//package com.example.BackEndToPurchaseTShirts.Beans;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="Product")
//public class Product {
//    @Id
//    @Column(name="product_id")
//    private int p_id;
//    @Column(name = "size")
//    private String size;
//    @Column(name = "color")
//    private String color;
//    @Column(name = "brand")
//    private String brand;
//    @Column(name="price")
//    private double price;
//
//    public Product(int id, String size, String color, String brand,double price) {
//        this.p_id = id;
//        this.size = size;
//        this.color = color;
//        this.brand = brand;
//        this.price=price;
//    }
//
//    public int getP_id() {
//        return p_id;
//    }
//
//    public void setP_id(int p_id) {
//        this.p_id = p_id;
//    }
//
//    public String getSize() {
//        return size;
//    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//}
