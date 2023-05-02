package May_2023;
//Date: 2nd May 2023
public class Valid_Anagram {
    //Runtime: 2ms beats 99.65%, Memory: 42.8MB beats 60.91%
    public boolean isAnagram(String s, String t) {
        char[] sChars=s.toCharArray();
        char[] tChars=t.toCharArray();
        if(sChars.length!= tChars.length)return false;
        int[] allZeroes=new int[26];
        for(int i=0;i<sChars.length;i++){
            allZeroes[122-sChars[i]]++;
            allZeroes[122-tChars[i]]--;
        }
        for(int i:allZeroes){
            if(i>0)return false;
        }
        return true;
    }
}
