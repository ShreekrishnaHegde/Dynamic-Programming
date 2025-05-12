package Introduction;

import java.util.Arrays;

public class Fib {
    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n));
    }

    //Un-optimized solution
    public static int fib(int n){
        if(n<=1)
            return 1;
        return fib(n-1)+fib(n-2);
    }

}

/*

Recursive relation: f(n)=f(n-1)+f(n-2)

overlaping subproblem
can be solved usijg memoization by storing value of subproblem in some map



 */
