package December_2022.From_12th_December;

public class ClimbingStairs_Recursion {
    //Runtime: 0ms beats 100%, Memory: 41.4MB beats 7.82%
    public int climbStairs(int n){
        int[] array=new int[n+2];
        return fib(n+1,array);
    }
    public int fib(int n,int[] give){
        if(n<=1){
            return n;
        }else if(give[n]!=0){
            return give[n];
        }else{
            int calc=fib(n-1,give)+fib(n-2,give);
            give[n]=calc;
            return calc;
        }
    }
    public static void main(String...args){
        System.out.println(new ClimbingStairs_Recursion().climbStairs(45));
    }
    //if n=5, f(4)+f(3)=give[4]=3
    // f(4)=f(3)+f(2)=give[3]=2
    // f(3)=f(2)+(f1)=give[2]=1
    // f(2)=f(1)+f(0)=1+0

}
