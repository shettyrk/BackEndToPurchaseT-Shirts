package com.example.BackEndToPurchaseTShirts.Beans;

import jakarta.persistence.*;

@Entity(name = "Customer")
@Table(name = "customer")
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    @Column(name = "customer_id",
            updatable = false)
    private Integer c_id;
    @Column(name = "c_name",
            nullable = false,
            columnDefinition = "text")
    private String name;
    @Column(name = "phone",
            nullable = false,
            columnDefinition = "int")
    private long phone;
    @Column(name = "address",
            nullable = false,
            columnDefinition = "text")
    private String address;

    public Customer(Integer c_id, String name, long phone, String address) {
        this.c_id = c_id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Customer() {

    }

    public Customer(String name, long phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "c_id=" + c_id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }
}
