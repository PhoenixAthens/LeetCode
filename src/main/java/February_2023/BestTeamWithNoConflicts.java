package February_2023;
//Date: 4th Feb, 2023
import java.util.ArrayDeque;
import java.util.Stack;
public class BestTeamWithNoConflicts {
    //works for 11/100+ test cases
    public int bestTeamScore(int[] scores, int[] ages) {
        int result=0;
        ArrayDeque<Integer> values=new ArrayDeque<>();
        ArrayDeque<Integer> ageStack=new ArrayDeque<>();
        values.push(scores[0]);
        ageStack.push(ages[0]);
        int tempSum=scores[0];
        for(int i=1;i<scores.length;i++){
            if(ages[i]<ageStack.peek()){
                if(scores[i]>values.peek()){
                    result=Math.max(result,tempSum);
                    int prevAge=ageStack.pop();
                    int prevVal=values.pop();
                    while(prevAge>ages[i] && prevVal<scores[i]){
                        tempSum-=prevVal;
                        if(!values.isEmpty()){
                            prevAge=ageStack.pop();
                            prevVal=values.pop();
                        }else{
                            break;
                        }
                    }
                    ageStack.push(ages[i]);
                    values.push(scores[i]);
                    tempSum+=scores[i];
                }else{
                    values.push(scores[i]);
                    ageStack.push(ages[i]);
                    tempSum+=scores[i];
                }
            }else if(ages[i]==ageStack.peek()){
                values.push(scores[i]);
                ageStack.push(ages[i]);
                tempSum+=scores[i];
            }else{
                if (scores[i] >= values.peek()) {
                    values.push(scores[i]);
                    ageStack.push(ages[i]);
                    tempSum+=scores[i];
                }
            }
        }
        return Math.max(tempSum,result);
    }
    public static void main(String... args){
        int val=new BestTeamWithNoConflicts().bestTeamScore(new int[]{1,3,5,10,15},new int[]{1,2,3,4,5});
        int val2=new BestTeamWithNoConflicts().bestTeamScore(new int[]{4,5,6,5},new int[]{2,1,2,1});
        int val3=new BestTeamWithNoConflicts().bestTeamScore(new int[]{1,2,3,5},new int[]{8,9,10,1});
        int val4=new BestTeamWithNoConflicts().bestTeamScore(new int[]{9,2,8,8,2}, new int[]{4,1,3,3,5});
        int val5=new BestTeamWithNoConflicts().bestTeamScore(new int[]{319776,611683,835240,602298,430007,574,142444,858606,734364,896074},new int[]{1,1,1,1,1,1,1,1,1,1});
        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
    }
}
