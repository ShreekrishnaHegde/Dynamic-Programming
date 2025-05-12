package DP2ClimbingStairs;

/*
https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(count(3));
    }
    public static int count(int n){
        if (n<=2){
            return n;
        }
        int left=count(n-1);
        int right=count(n-2);
        return left+right;
    }
}


/*
Try to represent the problems in terms of array index
Select an index and do all possible stuffs on that index
sum of all stuffs/ minimum of all stuffs

 */
