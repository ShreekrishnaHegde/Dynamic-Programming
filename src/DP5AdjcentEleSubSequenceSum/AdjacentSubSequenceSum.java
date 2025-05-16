package DP5AdjcentEleSubSequenceSum;

public class AdjacentSubSequenceSum {
/*

You are given an array list of n integers.you are supposed to return thr maximum sum of the seqquences
with the constraint that no two element are adjacent in the given list.
 */
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};
    }
    int function(int index,int[] arr){
        if(index==0){
            return arr[index];
        }
        if(index<0){
            return 0;
        }
        int pick=arr[index]+function(index-2,arr);
        int notPick= function(index - 1, arr);
        return Math.max(pick,notPick);
    }
}
