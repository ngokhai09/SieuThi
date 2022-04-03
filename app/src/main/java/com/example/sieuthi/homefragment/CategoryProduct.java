package com.example.sieuthi.homefragment;

import java.util.List;

public class CategoryProduct {

    private String name;
    private List<Product> listProduct;

    public CategoryProduct(String name, List<Product> listProduct) {
        this.name = name;
        this.listProduct = listProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
}
