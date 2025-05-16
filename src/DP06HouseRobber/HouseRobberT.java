package DP06HouseRobber;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class HouseRobberT {
    public static void main(String[] args) {
        int[] arr = {2, 3,2};
        int n=arr.length;
        int temp2=fun(Arrays.copyOfRange(arr,1,n-1));
        int temp1=fun(Arrays.copyOfRange(arr,0,n-2));
        System.out.println(Math.max(temp1,temp2));
    }
    static int fun(int[] arr){
//        int[] dp=new int[n+1];
//        dp[0]=0;dp[1]=arr[0];
        int n=arr.length;
        int prev2=0;
        int prev=arr[0];
        for(int i=1;i<n;i++){
            int take=arr[i];
            if(i>1){
                take+=prev2;//take+=dp[i-2];
            }
            int notTake=prev;//int noTake=dp[i-1];
            int curr=Math.max(take,notTake);//dp[i]=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
