package com.leetcode.java;

import java.util.Arrays;

public class RunningSum1DArray {

    public static void main(String[] args){
        int[] intArray = { 1, 1, 1, 1, 1 };
        System.out.println("Input "+Arrays.toString(intArray));
        System.out.println("Output "+Arrays.toString(runningSum(intArray)));
    }

    public static int[] runningSum(int[] nums) {

       int[] output=new int[nums.length];
        for(int index=0;index<nums.length;index++){
                int sum=0;
                for(int loop=0;loop<=index;loop++){
                    sum=sum+nums[loop];
                }
                output[index]=sum;
        }
        return output;
    }

}
