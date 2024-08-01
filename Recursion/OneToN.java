package Recursion;
public class OneToN {
    public static void print1toN(int i,int n){
        if(i<1){
            return;
        }

        print1toN(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        print1toN(3, 3);
    }
}
