package Recursion;

import java.util.ArrayList;

public class SubsequenceArray {
    public static void printsubsequence(int[] a, ArrayList<Integer> n, int index){

        if(index == a.length){
            System.out.println(n);
            return;
        }

        n.add(a[index]);
        printsubsequence(a, n, index+1);

        n.remove(n.size()-1);
        printsubsequence(a, n, index+1);

    }
    public static void main(String[] args) {
        int[] a = new int[]{3,1,2};
        ArrayList<Integer> n = new ArrayList<>();
        printsubsequence(a, n, 0);
    }
}
