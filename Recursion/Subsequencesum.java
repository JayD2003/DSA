package Recursion;

import java.util.ArrayList;

public class Subsequencesum {

    public static boolean onesubsequencesum(int[] a, ArrayList<Integer> n,int index, int target, int sum){
        if(index == a.length){

            //if sum == target return true that it occured
            if(sum == target){
                System.out.println(n);
                return true;
            }

            return false;
        }

        n.add(a[index]);
        sum = sum+a[index];
        //if the condition already met then terminate the extra process
        if(onesubsequencesum(a, n, index+1, target, sum) == true){
            return true;
        }

        n.remove(n.size()-1);
        sum = sum-a[index];
        if(onesubsequencesum(a, n, index+1, target, sum) == true){
            return true;
        }

        return false;
    }


    public static int totalsubsequencesum(int[] a, int index, int target, int sum){
        if(index == a.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }

        //using fibonacci series kinda thing here
        int l = totalsubsequencesum(a, index+1, target, sum+a[index]);
        int r = totalsubsequencesum(a, index+1, target, sum);

        return l+r;
    }
    public static void main(String[] args) {
         int[] a = new int[]{1,2,1};
        ArrayList<Integer> n = new ArrayList<>();
        onesubsequencesum(a, n, 0, 2, 0);
        System.out.println(totalsubsequencesum(a, 0, 2, 0));
    }
}
