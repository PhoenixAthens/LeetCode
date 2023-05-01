package LinkedIN_Learning.Java_Algorithms;

public class FindMaximum {
    public static int findMaximum_SOL1(int a, int b, int c){
        int max = a;
        if(b>a)max = b;
        if(c>a)max = c;
        return max;
    }
    public static int findMaximum_SOL2(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

}
