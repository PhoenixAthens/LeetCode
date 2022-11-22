import java.util.ArrayList;

public class PerfectSquares {
    public static int numSquares(int n) {
        double sqrt=Math.sqrt(n);
        if(n/sqrt==sqrt){
            return 1;
        }else{
            int count=0;
            for(int i=n-1;i>0;i--){
                sqrt=Math.sqrt(i);
                if(i/sqrt==sqrt) {
                    System.out.println(i);
                    while(n>i){
                        count++;
                        n-=i;
                    }
                }
                if(n==0){
                    break;
                }
            }
            return count;
        }
    }
    public static void main(String...args){
        System.out.println(numSquares(12));
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<100;i++){
            //arr.add(Math.sqrt(i));

        }
    }
}
