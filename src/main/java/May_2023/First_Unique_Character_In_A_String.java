package May_2023;
import java.util.HashMap;
//Date: 2nd May 2023
public class First_Unique_Character_In_A_String {
    //Runtime: 15ms beats 67.57%, Memory: 43.1MB beats 54.22%
    public int firstUniqChar(String s) {
        HashMap<Character,int[]> map=new HashMap<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int[] find=map.get(arr[i]);
            if(find!=null){
                find[0]++;
            }else{
                map.put(arr[i], new int[]{1,i});
            }
        }
        int index=2_000_000;
        for(char i:map.keySet()){
            int[] curr=map.get(i);
            if(curr[0]==1){
                index=Math.min(index,curr[1]);
            }
        }
        if(index>1_000_000)return -1;
        return index;
    }
    public static void main(String...args){
        System.out.println(new First_Unique_Character_In_A_String().firstUniqChar("leetcode"));
        System.out.println(new First_Unique_Character_In_A_String().firstUniqChar("loveleetcode"));
        System.out.println(new First_Unique_Character_In_A_String().firstUniqChar("aabb"));


    }

}
