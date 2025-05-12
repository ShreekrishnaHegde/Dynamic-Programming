package Introduction;

import java.util.Arrays;

public class FibM {
    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibMem(n,dp));
    }

    /*
    Optimized case using memoization
    Time Complexity: O(N)
    Space Complexity: O(N) stack space + O(n) array

     */
    public static int fibMem(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibMem(n-1,dp)+fibMem(n-2,dp);
    }
}
