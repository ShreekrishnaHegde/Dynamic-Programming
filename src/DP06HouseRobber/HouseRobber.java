package DP06HouseRobber;

import java.util.Arrays;

/*
Mr. X is a professional robber planning to rob houses along a street.
Each house has a certain amount of money hidden. All houses along this street are arranged in a circle.
That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a
security system connected, and it will automatically contact the police if two adjacent houses were
broken into on the same night.

You are given an array/list of non-negative integers 'ARR' representing the amount of money of each house.
Your task is to return the maximum amount of money Mr. X can rob tonight without alerting the police.



 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2, 3,2,6};
        int n=arr.length;
        int temp2=function(n-2,Arrays.copyOfRange(arr,1,n));
        int temp1=function(n-2,Arrays.copyOfRange(arr,0,n-1));
        System.out.println(Math.max(temp1,temp2));
    }
    static int function(int index,int[] arr){
        if(index==0){
            return arr[index];
        }
        if(index<0){
            return 0;
        }
        int pick=arr[index]+function(index-2,arr);
        int notPick= function(index - 1, arr);
        return Math.max(pick,notPick);
    }
}
