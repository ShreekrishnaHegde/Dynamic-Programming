package DP5AdjcentEleSubSequenceSum;

import java.util.Arrays;

public class AdjacentSubSequenceSumM {
    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 9};
        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        function(n-1,arr,dp);
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
