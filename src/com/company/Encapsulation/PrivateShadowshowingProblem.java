package com.company.Encapsulation;


    class Student{
        private int age;
        private String name;
        public void setData1(int age){
            age=age; // due to this shadowing problem compiler doesnt understant ehich one is local or instance

        }
        public void setData2(String b){
            name=b;
        }
        public void show(){
            System.out.println(name+" "+age);
        }
    }
public class PrivateShadowshowingProblem {
    public static void main(String[] args) {
        Student obj =new Student();
        Student obj1 =new Student();
        obj.setData1(18);
        obj1.setData1(25);
        obj.setData2("ankit");
        obj1.setData2("rahul");
        obj.show();
        obj1.show();


    }
}
