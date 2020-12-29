package com.test.spring5;

public class Book {
    private String bname;
    private String bauthor;
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo(){
        System.out.println("bname="+this.bname+ "\t"+"bauthor="+bauthor);
    }


}
