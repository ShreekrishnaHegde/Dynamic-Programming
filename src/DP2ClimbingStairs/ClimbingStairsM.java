package DP2ClimbingStairs;

import java.util.Arrays;

public class ClimbingStairsM {
    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(count(n,dp));

    }

    public static int count(int n,int[] dp){
        if (n<=2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int left=count(n-1,dp);
        int right=count(n-2,dp);
        return dp[n]=left+right;
    }
}

