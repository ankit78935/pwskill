package com.company.Encapsulation;
class Student2{
private int age;
private String name;
//public void setAge(int age){
//        this.age=age;   //age=age this shadowing problem compiler doesnt understant which one is local or instance and this keyword solve shadowing problem
//        }
//        public int getAge(){
//              return age;
//        }
//public void setName(String name){
//        this.name=name;
//        }
//        public String getName(){
//    return name;
//        }
// to genrate getter setter automatic from intellij click alt+insert
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class SettersGetters {
    public static void main(String[] args) {
        Student2 obj =new Student2();
        Student2 obj1 =new Student2();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("ankit");
        obj1.setName("rahul");
        int aage= obj.getAge();
        String aname= obj.getName();
        int bage= obj1.getAge();
        String bname= obj1.getName();
        System.out.println(aage+aname);
        System.out.println(bage+bname);

    }
}
