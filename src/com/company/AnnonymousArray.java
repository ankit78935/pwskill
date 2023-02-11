package com.company;

public class AnnonymousArray {
    public int add(int []arr){
        int res=0;
        for (int n:
             arr) {
            res =res+n;
        }
        return res;
    }

    public static void main(String[] args) {
        AnnonymousArray obj = new AnnonymousArray();
        int res= obj.add(new int[]{5,4,3,7});
        System.out.println(res);
    }
}
