package April_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class BulbSwitcher_SecondAttempt {
    // This Doesn't Work either!
    public int bulbSwitch(int n) {
        if(n<2)return n;
        int half=n/2;
        boolean[] nums=new boolean[n];
        ArrayList<Integer> values=primeCounter(n);
        for(int i=half;i<n;i++)nums[i]=true;
        for(int i:values){
            if(i>=half)break;
            for(int j=i-1;j<n;j+=i){
                nums[j]= !nums[j];
            }
        }
        int count=0;
        for(int i=0;i<n;i++)if(!nums[i])count++;
        return count;
    }
    public ArrayList<Integer> primeCounter(int n){
        ArrayList<Integer> primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            int count=0;
            int calc=(int)Math.sqrt(i);
            for(int j=1;j<=calc;j++){
                if(i%j==0)count++;
            }
            if(count<2)primes.add(i);
        }
        return primes;
    }
    public static void main(String...args){
        //System.out.println(primeCounter(10));
        //System.out.println(new BulbSwitcher_SecondAttempt().bulbSwitch(0));
        //System.out.println(new BulbSwitcher_SecondAttempt().bulbSwitch(1));
        //System.out.println(new BulbSwitcher_SecondAttempt().bulbSwitch(2));
        //System.out.println(new BulbSwitcher_SecondAttempt().bulbSwitch(3));
        System.out.println(new BulbSwitcher_SecondAttempt().bulbSwitch(4));
        System.out.println(new BulbSwitcher_SecondAttempt().bulbSwitch(5));
        System.out.println(new BulbSwitcher_SecondAttempt().bulbSwitch(99_999_999));
    }
}
