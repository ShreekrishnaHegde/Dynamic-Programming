package Introduction;


public class FibT {
    public static void main(String[] args) {
        int n=11;
        //int[] dp=new int[n+1];
        int prev2=0;//dp[0]=0;
        int prev=1;//dp[1]=1;
        for(int i=2;i<=n;i++){
            //dp[i]=dp[n-1]+dp[n-2];
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
/*
Optimized case using Tabu lation
    Time Complexity: O(N)
    Space Complexity: O(1)
 */
