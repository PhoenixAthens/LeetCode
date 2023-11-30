package InProgress;

import java.util.*;
public class MinimumGeneMutation_SolutionCameClose {
    public static int minMutation(String start, String end, String[] bank) {
        ArrayList<String> Bank=new ArrayList<>(Arrays.asList(bank));
        if(!Bank.contains(end)) return -1;
        else {
            int totalChanges=0;
            for(String s:bank){
                String current=s;
                int changes=0;
                for(int i=0;i<start.length();i++){
                    if(s.charAt(i)!=start.charAt(i) && end.charAt(i)==s.charAt(i)){
                        changes++;
                    }
                }
                System.out.println(changes+" : "+start);
                if(changes>1){
                    changes=0;
                    if(current.equals(end))break;
                }else if(changes==1){
                    start=current;
                    totalChanges+=changes;
                }
                if(start.equals(end))break;

            }
            if(totalChanges==0)return -1;
            return totalChanges;
        }

    }
    public static void main(String...args){
        int k=minMutation("AACCGGTT",  "AACCGGTA",new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"});
        System.out.println(k);
    }
}
