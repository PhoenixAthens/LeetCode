package March_2023;
public class Fibonacci_Numbers {
    //Runtime: 0ms beats 100%, Memory: 39.7MB beats 21.33%
    public int fib(int n) {
        if(n==0)return 0;
        return LinearFibonacci(n)[0];
    }
    public int[] LinearFibonacci(int n){
        if(n<=1){
            return new int[]{1,0};
        }else{
            int[] calc=LinearFibonacci(n-1);
            return new int[]{calc[0]+calc[1],calc[0]};
        }
    }
}
