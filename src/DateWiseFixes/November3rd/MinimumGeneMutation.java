package DateWiseFixes.November3rd;

import java.util.*;
public class MinimumGeneMutation {
    public static int minMutation(String start, String end, String[] bank) {
        ArrayList<String> Bank=new ArrayList<>(Arrays.asList(bank));
        if(Bank.contains(end)){
            for(int i=0;i<Bank.size();i++){
                String current=bank[i];
                for(int j=0;j<current.length();j++){
                    if(start.charAt(j)!=current.charAt(j)){
                        if(i!=Bank.size()-1){

                        }
                    }
                }
            }
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String...args){
        System.out.println(minMutation("AACCGGTT","AACCGGTA",new String[]{"AACCGGTA"}));
    }

}
