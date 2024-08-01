package Recursion;

public class Factorial {
    public static void parameterized(int n, int factorial){
        if(n==1 || n==0){
            System.out.println(factorial);
            return;
        }

        parameterized(n-1, factorial*n);
    }

    public static int functional(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*functional(n-1);
    }
    public static void main(String[] args) {
        parameterized(3, 1);
        System.out.println(functional(4));
    }
}
