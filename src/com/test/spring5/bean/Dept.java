package com.test.spring5.bean;

public class Dept {
    private String Dname;

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "Dname='" + Dname + '\'' +
                '}';
    }
}
