package February_2023;
import java.util.*;
public class findAnagrams_SecondIteration {
    //Incorrect solution (words for 33/64 test cases)
    public List<Integer> findAnagrams(String s, String p) {
        LinkedList<Character> charOfAnagram=new LinkedList<>();
        int len1=s.length();
        int len2=p.length();
        for(int i=0;i<len2;i++){
            charOfAnagram.add(p.charAt(i));
        }
        ArrayList<Integer> findings=new ArrayList<>();
        for(int i=0;i<=len1-len2;i++){
            LinkedList<Character> make=new LinkedList<>();
            for(int j=i;j<i+len2;j++){
                make.add(s.charAt(j));
            }
            System.out.println(make);
            if(make.containsAll(charOfAnagram) && charOfAnagram.containsAll(make))findings.add(i);

        }
        return findings;
    }
    public static void main(String...args){
        //System.out.println(new findAnagrams_SecondIteration().findAnagrams("baa", "aa"));
        LinkedList<Character> t1=new LinkedList<>(List.of('b','a'));
        LinkedList<Character> t2=new LinkedList<>(List.of('a','a'));
        System.out.println(t2.containsAll(t1));
    }
}
