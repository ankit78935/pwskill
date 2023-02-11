package com.company;

public class Array {
    public static void main(String[] args) {
        int num[] ={5,4,7,2};
//        inhanced for loop
        for (int n:
             num) {
            System.out.println(n);
        }
        int [][] arr ={{1,4,7},{2,5},{3,6,8,9}};
        for (int a[]:
             arr) {
            for (int b:
                 a) {

                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
