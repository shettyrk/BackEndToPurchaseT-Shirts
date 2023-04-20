package com.example.BackEndToPurchaseTShirts.Beans;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    @Column(name = "order_id")
    private int o_id;
    @JoinColumn(name = "customer_id",referencedColumnName = "c_id")
    private int c_id;
    @JoinColumn(name = "product_id",referencedColumnName = "p_id")
    private int p_id;
    @JoinColumn(name = "price",referencedColumnName = "price")
    private double amount ;
    @Column(name = "o_date")
    private Date orderDate;

    public Orders(int o_id ,int c_id, int p_id, double amount, Date orderDate) {
        this.o_id=o_id;
        this.c_id = c_id;
        this.p_id = p_id;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public Orders() {
    }

    public Orders(int c_id, int p_id, double amount, Date orderDate) {
        this.c_id = c_id;
        this.p_id = p_id;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

}
