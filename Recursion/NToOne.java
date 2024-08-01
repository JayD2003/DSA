package Recursion;
public class NToOne {
    public static void printnto1(int i,int n){
        if(i>n){
            return;
        }

        printnto1(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printnto1(1, 3);
    }
}
