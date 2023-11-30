package October_2022.Still_Working_On_IT;

import java.util.*;
public class Minimum_GeneMutation_FinalAttempt{
    public static int minMutation(String startGene, String endGene, String[] bank) {
        ArrayList<String> Source=new ArrayList<>(Arrays.asList(bank));
        if(!Source.contains(endGene)){
           return -1;
        }else{
            int minMutations=0;
            //You don't have to care about the bank, just check from it, you see,
            //1. you make changes to you string. compare it with end String, where Char are diff, make changes,
            //2. check if your change is a possible mutation
            //3 make change count it, that's it!
            char[] main=startGene.toCharArray();
            char[] end=endGene.toCharArray();
            for(int i=0;i<main.length;i++){
                if(main[i]!=end[i]){
                    minMutations++;
                }
            }
            return minMutations;

        }


    }
    public static void main(String...args){
        System.out.println((minMutation("AACCTTGG","AATTCCGG", new String[]{"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"})));
    }
}
