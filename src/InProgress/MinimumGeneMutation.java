package InProgress;

import java.util.*;
public class MinimumGeneMutation {
    public static int minMutation(String start, String end, String[] bank) {
        ArrayList<String> Bank=new ArrayList<>(Arrays.asList(bank));
        if(!Bank.contains(end)) return -1;
        else{
            int changes=0;
            ArrayList<String> Start=new ArrayList<>(Arrays.asList(start.split("")));
            ArrayList<String> End=new ArrayList<>(Arrays.asList(end.split("")));
            if(Start.size()>End.size()){
                for(int i=0;i<Start.size();i++){
                    if(End.get(i)==null || !Objects.equals(End.get(i), Start.get(i))) changes++;
                }
            }else if(Start.size()<End.size()){
                for(int i=0;i<End.size();i++){
                    if(Start.get(i)==null || !Objects.equals(End.get(i), Start.get(i))) changes++;
                }
            }else{
                for(int i=0;i<Start.size();i++){
                    if(!Objects.equals(End.get(i), Start.get(i))) changes++;
                }

            }
            return changes;
        }
    }
    public static void main(String...args){
        int k=minMutation("AACCTTGG", "AATTCCGG",new String[]{"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"});
        System.out.println(k);
    }
}
