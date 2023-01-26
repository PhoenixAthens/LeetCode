package November_2022.Still_Working_ON_IT;

import java.util.ArrayList;

public class PerfectSquares {
    //Still Working on it!
    public static int numSquares(int n) {
        double sqrt=Math.sqrt(n);
        if((int)sqrt==sqrt){
            return 1;
        }else{
            int count=0;
            int top=n;
            for(int i=n-1;i>0;i--){
                sqrt=Math.sqrt(i);
                if((int)sqrt==sqrt) {
                    if(top%i==0 && count>top/i){
                        System.out.println("T1: "+i);
                        return top/i;
                    }else if(n%i==0 && n>=i){
                        System.out.println("T2: "+i);
                        count+=n/i;
                        n-=i;
                    }else if(n>=i){
                        System.out.println("T3: "+i);
                        n-=i;
                        count++;


                    }
                }
                if(n==0){
                    return count;
                }
            }
            if(n!=0){
                return count+n;
            }else{
                return count;
            }
        }
    }
    public static void main(String...args){
        System.out.println(numSquares(12));
    }
}
