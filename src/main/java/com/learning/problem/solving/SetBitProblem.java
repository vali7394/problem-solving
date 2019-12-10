package com.learning.problem.solving;

public class SetBitProblem {

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(1923));
        countNoOfSetBits(1923);
        System.out.println(recNoOfSetBits(1923));
    }


    private static void countNoOfSetBits(int number){

        int count =0;
        while(number>0){
            number=number&(number-1);
            count++;
        }

        System.out.println(count);
    }

    private static int recNoOfSetBits(int n){
        if(n==0) {
            return 0;
        }
        return 1+recNoOfSetBits(n&(n-1));
    }

}
