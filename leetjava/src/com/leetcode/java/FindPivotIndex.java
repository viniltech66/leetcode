package com.leetcode.java;

import java.util.Arrays;

public class FindPivotIndex {

    public static void main(String[] args){
        int[] intArray = { 1,7,3,6,5,6 };
        System.out.println("Input "+ Arrays.toString(intArray));
        System.out.println("Output "+ pivotIndex(intArray));
    }

    public static int pivotIndex(int[] nums) {
        int pivotIndex=0;
        for(int index=0;index<nums.length;index++){
            int leftIndexSum = 0;int rightIndexSum=0;
            //calc left sum
            for(int left=0;left<index;left++){
                leftIndexSum+=nums[left];
            }
            for(int right=index+1;right<nums.length;right++){
                rightIndexSum+=nums[right];
            }
            System.out.println("index  leftSum rightSum {} {} {}"+" " +index+" | "+leftIndexSum+" | "+rightIndexSum);
            //calc right sum
            if(leftIndexSum==rightIndexSum){
                pivotIndex=index;
                return pivotIndex;
            }else{
                pivotIndex=-1;
            }
        }
        return pivotIndex;
    }
}
