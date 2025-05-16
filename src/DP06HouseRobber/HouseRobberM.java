package DP06HouseRobber;

import java.util.Arrays;

public class HouseRobberM {
    public static void main(String[] args) {
        int[] arr = {2, 3,2,6};
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int temp2=function(n-2, Arrays.copyOfRange(arr,1,n),dp);
        int temp1=function(n-2,Arrays.copyOfRange(arr,0,n-1),dp);
        System.out.println(Math.max(temp1,temp2));
    }
    static int function(int index,int[] arr,int[] dp){
        if(index==0){
            return arr[index];
        }
        if(index<0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=arr[index]+function(index-2,arr,dp);
        int notPick= function(index - 1, arr,dp);
        return dp[index]=Math.max(pick,notPick);
    }
}
