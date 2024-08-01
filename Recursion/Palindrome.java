package Recursion;
public class Palindrome {
    public static boolean palindrome(int i,char[] a,int n){
        //base case
        if(i<=n/2)
        return true;

        //condition
        if(a[i]==a[n-i-1])
        palindrome(i+1, a, n);

        
        return false;
    }
    public static void main(String[] args) {
        char[] a = new char[]{'s','a','a','s','b'};
        System.out.println(palindrome(0,a, a.length));
    }

}
