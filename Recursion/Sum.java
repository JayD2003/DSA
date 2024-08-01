package Recursion;

public class Sum {
    public static void parameterized(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        parameterized(n-1, sum+n);
    }


    public static int functional(int n){
        if(n==0){
            return 0;
        }
        return n+functional(n-1);
    }
    public static void main(String[] args) {
        parameterized(3, 0);
        System.out.println(functional(3));
    }
}
