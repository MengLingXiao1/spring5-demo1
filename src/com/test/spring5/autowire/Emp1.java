package com.test.spring5.autowire;

public class Emp1 {
    private Dept1 dept1;

    public Dept1 getDept() {
        return dept1;
    }

    public void setDept(Dept1 dept1) {
        this.dept1 = dept1;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "dept=" + dept1 +
                '}';
    }

    public void test(){
        System.out.println(dept1);
    }
}
