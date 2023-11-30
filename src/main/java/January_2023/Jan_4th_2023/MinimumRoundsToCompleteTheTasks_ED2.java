package January_2023.Jan_4th_2023;
import java.util.Arrays;
public class MinimumRoundsToCompleteTheTasks_ED2 {
    //With functional decomposition:
    //Runtime: 46ms beats 66.78%, Memory: 100MB beats 55.65%

    //Without Functional Decomposition
    //Runtime: 24ms beats 94.9%, Memory: 90.9MB beats 58.96%

    //Using sort instead of parallelSort
    //Runtime: 44ms beats 67.65%, Memory: 93.9MB beats 58.9%

    public int minimumRounds(int[] tasks) {
        Arrays.parallelSort(tasks);
        int rounds=0;
        int len= tasks.length;
        for(int i=0;i<len;){
            int count=0;
            int present=tasks[i];
            while( i<len && tasks[i]==present){
                count++;
                i++;
            }
            if(count==1)return -1;
            else{
                if(count%3==0)rounds+=count/3;
                else if((count%3)%2==0){
                    int temp=count/3;
                    count%=3;
                    temp+=count/2;
                    rounds+=temp;
                }else if(count%3==1){
                    int num=(count/3)-1;
                    count-=3*num;
                    num+=count/2;
                    rounds+=num;
                }
            }
        }
        return rounds;
    }
    public int squeeze(int val){
        if(val%3==0)return val/3;
        if((val%3)%2==0){
            int temp=val/3;
            val%=3;
            temp+=val/2;
            return temp;
        }else if(val%3==1){
            int num=(val/3)-1;
            val-=3*num;
            num+=val/2;
            return num;
        }
        return 0;
    }
    public static void main(String...args){
        System.out.println(new MinimumRoundsToCompleteTheTasks_ED2().minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
        System.out.println(new MinimumRoundsToCompleteTheTasks_ED2().minimumRounds(new int[]{2,3,3}));
    }
}
