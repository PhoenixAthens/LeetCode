import java.util.*;

public class GroupAnagrams_SecondAttempt_ExceedsTime {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> main=new ArrayList<>();
        HashMap<String,List<String>> tempMap=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            //Checker(tempMap,strs[i]);

        }
        for(String s:tempMap.keySet()){
            ArrayList<String> temp=new ArrayList();
            temp.add(s);
            temp.addAll(tempMap.get(s));
            main.add(temp);
        }
        return main;

    }
    public void Checker(HashMap<String,List<String>> m,String s){
        char[] mainStr=s.toCharArray();
        Arrays.parallelSort(mainStr);
        for(String str:m.keySet()){
            char[] tempArray=str.toCharArray();
            Arrays.parallelSort(tempArray);
            if(Arrays.equals(mainStr,tempArray)){
                m.get(str).add(s);
                return;
            }
        }
        m.put(s,new ArrayList<>());


    }
    public static void main(String...args){
        //groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
