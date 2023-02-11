package com.company.String;

public class CompareString {
    public static void main(String[] args) {
        String s1="pwskill";
        String s2 =new String("pwskill");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3="pwjava";
        String s4 ="pwjava";
        String s5 ="pwJAVA";
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
        String a1="pwskill";
        String a2=new String("pwskill");
        String a3=new String("pwskill");
        System.out.println(a1==a2);
        System.out.println(a1==a3);
        System.out.println(a2==a3);
        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a1));
    }
}
