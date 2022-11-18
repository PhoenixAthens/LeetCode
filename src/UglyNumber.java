import java.util.*;
public class UglyNumber {
    // time: 2ms, Memory: 41.5MB
    public static boolean isUgly(int n) {
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }else{
            int i=0;
            while(i!=1){
                if(n%5==0){
                    n/=5;
                }else if(n%3==0){
                    n/=3;
                }else if(n%2==0){
                    n/=2;
                }else{
                    return false;
                }
                i=n;
            }
            return true;
        }
    }
    public static void main(String...args){
        for(int i=0;i<50;i++){
            System.out.println(i+": "+isUgly(i));
        }
    }
}
/*
ArrayList<String> factors=new ArrayList<>();
            for(int i=2;i<n;i++){
                if(n%i==0){
                    factors.add(String.valueOf(i));
                }
            }
            if(factors.size()>0){
                factors.removeIf(x-> (x.equals("2") ||x.equals("3")||x.equals("5")));
                System.out.println(factors);
                return factors.size()>0?false:true;
            }else{
                return false;
            }

 */
