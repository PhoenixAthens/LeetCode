package DateWiseFixes.November3rd;

import java.util.*;
public class MinimumGeneMutation {
    // 17/18 testCases Working
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
                            if(present.charAt(j)==bank[i+1].charAt(j)){
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
                }
                str=new StringBuilder();
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
    //Above test case should give 4 as result but gives 6
    //Otimal Solution try this
    //class Solution {
    //    public int minMutation(String start, String end, String[] bank) {
    //        int level = 0;
    //        int len = bank.length;
    //        char[] chr = {'A','C','G','T'};
    //
    //        Set<String> hset = new HashSet<String>();
    //        for(String s: bank){
    //            hset.add(s);
    //        }
    //
    //        Queue<String> queue = new LinkedList<>();
    //        queue.add(start);
    //
    //        while(true){
    //            level++;
    //            int n = queue.size();
    //
    //            if(n == 0){
    //                return -1;
    //            }
    //
    //            for(int i =0; i < n; i++){
    //                char[] ch = queue.poll().toCharArray();
    //
    //                for(int j =0; j < 8; j++){
    //                    char org_char = ch[j];
    //                    for(int c = 0; c<4; c++){
    //                        ch[j] = chr[c];
    //                        String str = String.valueOf(ch);
    //                        if(str.equals(end)
    //                          && hset.contains(str)){
    //                            return level;
    //                        }
    //
    //                        if(!hset.contains(str)){
    //                            continue;
    //                        }
    //
    //                        hset.remove(str);
    //                        queue.add(str);
    //                    }
    //                    ch[j] = org_char;
    //                }
    //            }
    //        }
    //    }
    //}

}
