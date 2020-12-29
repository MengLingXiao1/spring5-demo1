package com.test.spring5;

public class Order {
    private String oname;
    private String address;

    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
    public void orderTest(){
        System.out.println(this.oname+"::"+this.address);
    }
}
