package com.company.String;

public class StringTypes {
    public static void main(String[] args) {
//  immutable string(we cant change)
        String name = "ankit";
        System.out.println(name);
        name.concat("kumar"); //add in string
//        muteable string(we can change)
        StringBuilder name1=new StringBuilder("ankit");
        System.out.println(name1);
        name1.append("kumar");// add in string
        System.out.println(name1);


    }
}
