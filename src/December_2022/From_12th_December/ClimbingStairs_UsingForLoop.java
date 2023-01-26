package December_2022.From_12th_December;

public class ClimbingStairs_UsingForLoop {
    // Runtime: 0ms, Memory: 39.2MB
    //fib(0)=1, fib(1)=1;
    public int climbStairs(int n) {
        int sum=1;
        int lastSum=0;
        if(n==1 || n==2)return n;
        for(int i=1;i<n+1;i++){
            int temp=sum;
            sum+=lastSum;
            lastSum=temp;
        }
        return sum;
    }
    public static void main(String...args){
        System.out.println(new ClimbingStairs_UsingForLoop().climbStairs(6));
    }
}
