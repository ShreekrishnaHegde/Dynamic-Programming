package DP2ClimbingStairs;

public class ClimbingStairsT {
    public static void main(String[] args) {

        int n=10;
        if(n<=2)
            System.out.println(n);
        int prev2=1;
        int prev=2;
        for(int i=3;i<=n;i++){
            int curr=prev2+prev;
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
