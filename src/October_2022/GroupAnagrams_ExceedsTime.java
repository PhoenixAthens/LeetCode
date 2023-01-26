package October_2022;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class GroupAnagrams_ExceedsTime {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> main=new ArrayList<>();
        for(int i=0;i< strs.length;i++){
            if(strs[i]!=null){
                char[] arr1=strs[i].toCharArray();
                Arrays.parallelSort(arr1);
                ArrayList<String> beta=new ArrayList<>();
                beta.add(strs[i]);
                for(int j=i+1;j< strs.length;j++){
                    if(strs[j]!=null){
                        char[] arr2=strs[j].toCharArray();
                        Arrays.parallelSort(arr2);
                        if(Arrays.equals(arr1,arr2)){
                            beta.add(strs[j]);
                            strs[j]=null;
                        }
                    }
                }
                main.add(beta);
            }
        }
        return main;
    }
    public static void main(String...args){
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

}
