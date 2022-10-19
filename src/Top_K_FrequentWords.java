import java.util.*;
public class Top_K_FrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        Arrays.parallelSort(words);
        ArrayList<String> arrayOfStrings = new ArrayList<>(Arrays.asList(words));
        int[] counterArray=new int[arrayOfStrings.size()];
        for (String word : words) {
            if (arrayOfStrings.contains(word)) {
                int indexOf = arrayOfStrings.indexOf(word);
                counterArray[indexOf] += 1;
            }
        }
        ArrayList<Integer> substitute=new ArrayList<>();
        for(int i:counterArray){
            substitute.add(i);
        }
        System.out.println(substitute);
        ArrayList<String> returnList=new ArrayList<>();
        for(int i=0;i<k;i++){
            int index=substitute.indexOf(Collections.max(substitute));
            returnList.add(words[index]);
            substitute.set(index,0);

        }
        //returnList.sort(null);
        return returnList;
    }
    public static void main(String...args){
        System.out.println(topKFrequent(new String[]{"i","love","leetcode","i","love","coding"},3));
    }
}
