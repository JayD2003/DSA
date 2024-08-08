package Recursion;

public class SubsequencesString {
    public static void printsubsequence(String s, String res, int i){
        if(i==s.length()){
            System.out.println(res);
            return;
        }

        char a = s.charAt(i);
        printsubsequence(s, res+a, i+1);
        printsubsequence(s, res, i+1);
    }
    public static void main(String[] args) {
        String s = "aaa";
        printsubsequence(s, "", 0);
    }
}
