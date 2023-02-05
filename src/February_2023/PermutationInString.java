package February_2023;
import java.util.HashMap;
//Date: 4th Feb, 2023
public class PermutationInString {
    //Runtime: 1256ms beats 7.1%, Memory: 42.5MB beats 48.94%
    //Working on a better Solution!
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        int lenS1=s1.length();
        int lenS2=s2.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<lenS1;i++){
            char current=s1.charAt(i);
            if(map.containsKey(current)){
                int val=map.get(current);
                map.put(current,++val);
            }else{
                map.put(current,1);
            }
        }

        for(int i=0;i<=lenS2-lenS1;i++){
            HashMap<Character,Integer> make=new HashMap<>(map);
            for(int j=i;j<i+lenS1;j++){
                char current=s2.charAt(j);
                if(make.containsKey(current)){
                    int val=make.get(current);
                    make.put(current,--val);
                }else{
                    break;
                }
            }
            boolean sensor=true;
            for(int k:make.values()){
                if(k!=0){
                    sensor=false;
                    break;
                }
            }
            if(sensor)return true;
        }
        return false;
    }
    public static void main(String...args){
        System.out.println(new PermutationInString().checkInclusion("ab","eidbaooo"));
        System.out.println(new PermutationInString().checkInclusion("ab","eidboaoo"));
        System.out.println(new PermutationInString().checkInclusion("hello","ooolleoooleh"));
        System.out.println(new PermutationInString().checkInclusion("abcdxabcde","abcdeabcdx"));
    }
}
