package com.vuviethung.bai3;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private int numberOfProduct;
    private int numberOfCustomer;
    private List<Product> products = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public Manager(int numberOfProduct, int numberOfCustomer) {
        this.numberOfProduct = numberOfProduct;
        this.numberOfCustomer = numberOfCustomer;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void inputListOfProduct() {
        for (int i = 0; i < numberOfProduct; i++) {
            Product product = new Product();
            product.inputProduct();
            products.add(product);
        }
    }

    public void inputListOfCustomer() {
        for (int i = 0; i < numberOfCustomer; i++) {
            Customer customer = new Customer();
            customer.inputCustomer();
            customers.add(customer);
        }
    }

    public void outputAllOfList() {
        System.out.println("Danh Sach San Pham \n"+products);
        System.out.println("Danh Sach Khach Hang \n "+customers);
    }
}
