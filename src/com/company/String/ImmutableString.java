package com.company.String;

public class ImmutableString {
    public static void main(String[] args) {
          String s1="ankit";
          String s2="ankit";
        System.out.println(s1==s2);// dont allow duplicate so both have same adrs
          String name =new String("ankitkumar");
        String name1 =new String("ankitkumar");
        System.out.println(name==name1);  // duplicate allow

    }
}
