package com.domain;

import java.io.Serializable;
import java.util.Date;


public class Product implements Serializable {
    private int id;
    private String name;
    private Double price;
    private Double number;
    private String description;
    private Date createDate;
    private Date updateDate;

    public Product() {
    }

    public Product(String name, Double price, Double number, String description) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.description = description;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getNumber() {

        return number;
    }

    public void setNumber(Double number) {

        this.number = number;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
