package DateWiseFixes.November3rd;

import java.util.*;
public class MinimumGeneMutation {
    public static int minMutation(String start, String end, String[] bank) {
        ArrayList<String> main=new ArrayList<>(Arrays.asList(bank));
        if(main.contains(end)){
            StringBuilder str=new StringBuilder();
            int TotalChanges=0;
            for(int i=0;i<bank.length;i++){
                int changes=0;
                String present=bank[i];
                for(int j=0;j<start.length();j++){
                    if(start.charAt(j)!=present.charAt(j)){
                        if(i!=bank.length-1 && !Objects.equals(end,present)){
                            if(end.charAt(j)!=start.charAt(j)){
                                changes++;
                                str.append(present.charAt(j));
                            }else{
                                str.append(start.charAt(j));
                            }
                        }else{
                            changes++;
                            str.append(present.charAt(j));
                        }

                    }else str.append(start.charAt(j));
                    System.out.println(str.toString()+":Here:"+changes);
                }
                if(changes==1){
                    TotalChanges+=changes;
                    start=str.toString();
                    str=new StringBuilder();
                } else{
                    str=new StringBuilder();
                }
                if(start.equals(end)){
                    return TotalChanges;
                }
            }
            if(!Objects.equals(start,end)){
                return -1;
            }
            return TotalChanges;
        }else{
            return -1;
        }
    }

    public static void main(String...args){
        System.out.println(minMutation("AAAACCCC","CCCCCCCC",new String[]{"AAAACCCA","AAACCCCA","AACCCCCA","AACCCCCC","ACCCCCCC","CCCCCCCC","AAACCCCC","AACCCCCC"}));
    }

}
