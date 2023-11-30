package January_2023.Jan_30th_2023;

public class Nth_Tribonacci_Number {
    //Runtime: 0ms beats 100%, Memory: 38.9MB beats 80.62%
    // After tweaks below line 25
    //Runtime: 0ms beats 100%, Memory: 38.9MB beats 90.25%
    public int tribonacci(int n) {
        if(n<2){
            return n;
        }
        int[] values=new int[n+1];
        values[0]=0;
        values[1]=1;
        values[2]=1;
        return fibonacciCalculator(n,values);
    }
    public int fibonacciCalculator(int n, int[] values){
        if(n<2)return n;
        else if(values[n]!=0){
            return values[n];
        }else{
            /*values[n-1]=fibonacciCalculator(n-1,values);
            values[n-2]=fibonacciCalculator(n-2,values);
            values[n-3]=fibonacciCalculator(n-3,values);*/

            //Checking if changing the order above improves anything because theoretically, it should!

            values[n-3]=fibonacciCalculator(n-3,values);
            values[n-2]=fibonacciCalculator(n-2,values);
            values[n-1]=fibonacciCalculator(n-1,values);
            return values[n-1]+values[n-2]+values[n-3];
        }
    }
    public static void main(String...args){
        int answer=new Nth_Tribonacci_Number().tribonacci(2);
        System.out.println(answer);
    }
}
