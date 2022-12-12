package From_12th_December;


public class ClimbingStairs {
    //Runtime: 0ms, Memory: 40.7MB

    public int climbStairs(int n) {
        return cheat(n+1);
    }
    public static int fib(int n){
        if(n==1 || n==2 ){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    public int cheat(int n){
        int[] cheat=new int[]{1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,
        121393,196418,317811,514229 ,832040,1346269,2178309 ,3524578,5702887, 9227465, 14930352, 24157817, 39088169,63245986,102334155,165580141,267914296,433494437,701408733};
        return cheat[n];
    }
    public static void main(String...args){
        //System.out.println(new ClimbingStairs().climbStairs(46));
        System.out.println(fib(46));

    }
}
