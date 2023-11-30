package May_2023;

import java.util.HashMap;

//Date: 2nd May 2023
public class First_Unique_Character_SolII {
    //Runtime: 5ms beats 93.11%, Memory: 43.2MB beats 29.82%
    public int firstUniqChar(String s) {
        int[][] characters=new int[26][2];
        char[] arr=s.toCharArray();
        int cnt=0;
        for(char i:arr){
            characters[122-i][0]++;
            characters[122-i][1]=cnt++;
        }
        int minIndex=2_000_000;
        for(int[] i:characters){
            if(i[0]==1){
                minIndex=Math.min(minIndex,i[1]);
            }
        }

        return (minIndex>1_000_000)?-1:minIndex;
    }
    //Don't use the code below!
    public int alternate(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        char[] arr=s.toCharArray();
        int[] counter=new int[26];
        int cnt=0;
        for(char i:arr){
            counter[122-i]++;
            map.putIfAbsent(i, cnt);
            cnt++;
        }
        int index=2_000_000;
        for(int i=0;i<counter.length;i++){
            char val= (char) (122-i);
            if(i==1){
                index=Math.min(index,map.get(val));
            }
        }
        return (index>1_000_000)?-1:index;
    }
    public static void main(String...args){
        System.out.println(new First_Unique_Character_SolII().firstUniqChar("leetcode"));
        System.out.println(new First_Unique_Character_SolII().firstUniqChar("loveleetcode"));
        System.out.println(new First_Unique_Character_SolII().firstUniqChar("aabb"));
    }
}
