package com.company;

public class ArrayLength {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        System.out.println(a.length);
        int [][] b={
                {1,2,3,4},
                {2,3,4},
                {5,6}
        };
        System.out.println(b.length);
        System.out.println(b[0].length);
        System.out.println(b[1].length);
        System.out.println(b[2].length);
        String name ="ankitkumar";
        System.out.println(name.length());

    }
}
