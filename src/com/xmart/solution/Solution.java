package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        int [] array =  {-2, -5, 6, -2, -3, 1, 5, -6} ;
        System.out.println(maximumSumOfContiguousSubArray(array));
    }

    private static int maximumSumOfContiguousSubArray(int[] array) {
        int[] dynamicTab = new int[array.length];
        dynamicTab[0] = Math.max(array[0],0);
        int max = dynamicTab[0];
        for (int i = 1 ; i < array.length; i++){
            dynamicTab[i] = Math.max(dynamicTab[i-1] + array[i],array[i]);
            max = Math.max(max, dynamicTab[i]);
        }
        return max;
    }
}