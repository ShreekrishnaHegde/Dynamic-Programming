package DP5AdjcentEleSubSequenceSum;

import java.util.Arrays;

public class AdjacentSubSequenceSumT {
    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 9};
        int n=arr.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        int prev2=0;
        int prev=arr[0];
        for(int i=1;i<n;i++){
            int take=arr[i];
            if(i>1){
//                take+=dp[i-2];
                take+=prev2;
            }

//            int noTake=dp[i-1];
            int notTake=prev;
//            dp[i]=Math.max(take,notTake);
            int curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}

/*
Tc: O(n)
Sc: O(1)

 */