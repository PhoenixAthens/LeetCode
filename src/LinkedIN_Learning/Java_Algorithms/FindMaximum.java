package LinkedIN_Learning.Java_Algorithms;

public class FindMaximum {
    public static int findMaximum_SOL1(int a, int b, int c){
        int max = a;
        if(b>a)max = b;
        if(c>a)max = c;
        return max;
    }
    // Optimization-1
    public static int findMax_2(int a, int b, int c){
        int max = a;
        if(b>max)max=b;
        if(c>max)max=c;
        return max;
    }
    public static int findMaximum_SOL2(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
    public static void main(String...args){
        System.out.println(findMaximum_SOL1(1,2,3));
        System.out.println(findMaximum_SOL1(8,8,1));
        System.out.println(findMaximum_SOL1(3,2,3));
        System.out.println(findMaximum_SOL1(1,1,9));
        System.out.println(findMaximum_SOL1(1,9,9));
        System.out.println("------------------------------");
        System.out.println(findMaximum_SOL2(1,2,3));
        System.out.println(findMaximum_SOL2(8,8,1));
        System.out.println(findMaximum_SOL2(3,2,3));
        System.out.println(findMaximum_SOL2(1,1,9));
        System.out.println(findMaximum_SOL2(1,9,9));
        System.out.println("------------------------------");
        System.out.println(findMax_2(1,2,3));
        System.out.println(findMax_2(8,8,1));
        System.out.println(findMax_2(3,2,3));
        System.out.println(findMax_2(1,1,9));
        System.out.println(findMax_2(1,9,9));
    }

}
