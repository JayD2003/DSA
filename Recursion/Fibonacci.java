package Recursion;
public class Fibonacci {
    public static int fibo(int n){
        //base case if 0 meaans 0 1 means 1
        if(n<=1){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
