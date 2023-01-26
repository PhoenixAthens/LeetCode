package January_2023.Jan_4th_2023;
import java.util.HashMap;

public class MinimumRoundsToCompleteTheTasks {
    // First Iteration
    // Runtime: 44ms beats 69.39%, Memory: 62.4MB beats 64%
    // Second Iteration
    // Runtime: 46ms beats 66.78%, Memory: 62MB beats 65.4%

    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:tasks){
            if(map.containsKey(i))map.put(i,map.get(i)+1);
            else map.put(i,1);

            // Using the piece of code below instead of code from line 13-15
            // increases runtime to a minimum of 85ms
            /* map.put(i,map.getOrDefault(i,0)+1); */
        }
        int rounds=0;
        for(int i:map.keySet()){
            int val=map.get(i);
            if(val<2)return -1;
            else{
                if(val%3==0)rounds+=val/3;
                else if((val%3)%2==0){
                    int temp=val/3;
                    rounds+=temp;
                    val%=3;
                    rounds+=val/2;
                }else if(val%3==1){
                    int num=(val/3)-1;
                    val-=3*num;
                    num+=val/2;
                    rounds+=num;
                }
            }
        }
        return rounds;
    }
    public static void main(String...args){
        System.out.println(new MinimumRoundsToCompleteTheTasks().minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
        System.out.println(new MinimumRoundsToCompleteTheTasks().minimumRounds(new int[]{2,3,3}));

    }
}
