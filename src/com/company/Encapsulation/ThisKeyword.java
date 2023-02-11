package com.company.Encapsulation;

class Student1{
    private int age;
    private String name;
    public void setData1(int age){

        this.age=age;   //age=age this shadowing problem compiler doesnt understant which one is local or instance and this keyword solve shadowing problem

    }
    public void setData2(String name){
        this.name=name;
    }
    public void show(){
        System.out.println(name+" "+age);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Student1 obj =new Student1();
        Student1 obj1 =new Student1();
        obj.setData1(18);
        obj1.setData1(25);
        obj.setData2("ankit");
        obj1.setData2("rahul");
        obj.show();
        obj1.show();
    }
}
