package Recursion;

public class ReverseString {
    public static void reverseString(int i,char[] a){
        if(i>=a.length/2){
            return;
        }
        char temp = a[i];
        a[i] = a[a.length-1-i];
        a[a.length-1-i] = temp;
        reverseString(i+1, a);
    }
    // public static void swap(char a, char b){
    //     char temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println(a+" "+b);
    //     return;
    // }
    public static void main(String[] args) {
        char[] a = new char[]{'j','a','y','a','s','a','i'};
        reverseString(0, a);
        for(char i : a){
            System.out.print(i+" ");
        }
    }
}
