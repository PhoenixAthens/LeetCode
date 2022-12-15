package From_15th_December_StillWorkingOnIt;

public class LargestCommonSubsequence {
    //works for 9/45 test cases
    //fails at 10
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();
        if(text1.equals(text2)){
            return len1;
        }else{
            int count=0;
            int i=0;
            if(len1>len2 || len1==len2){
                //broken string outcome yet to overcome!
                char[] seq=text1.toCharArray();
                char present=text2.charAt(i);
                for(char c:seq){
                    if(c==present){
                        count++;
                        i++;
                        if(i==len2)break;
                        else present=text2.charAt(i);

                    }
                }
            }else{
                char[] seq=text2.toCharArray();
                char present=text1.charAt(i);
                for(char c:seq){
                    if(c==present){
                        count++;
                        i++;
                        if(i==len2)break;
                        else present=text1.charAt(i);

                    }
                }
            }
            return count;
        }

    }
    public static void main(String...args){
        int r=longestCommonSubsequence("abcde","ace");
        System.out.println(r);
    }
}
