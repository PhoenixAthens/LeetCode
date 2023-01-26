package December_2022.From_12th_December;

public class FibonacciNumbers_SecondIteration {
    //Runtime: 0ms, Memory: 41.1MB
    public int fib(int n) {
        int[] array=new int[n+2];
        return fibo(n,array);
    }
    public int fibo(int n,int[] give){
        if(n<=1){
            return n;
        }else if(give[n]!=0){
            return give[n];
        }else{
            int calc=fibo(n-1,give)+fibo(n-2,give);
            give[n]=calc;
            return calc;
        }
    }
}
