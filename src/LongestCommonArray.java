import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestCommonArray {
    public static String LongestCommonPrefix(String[] s){
        char[] result=finderForPrefix(s,shortestStringInArray(s));
        if(result.length==0){
            return "";
        }else{
            String common="";
            for(int i=0;i<result.length;i++){
                if(result[i]!=0){
                    common+=result[i];
                }
            }
            if(common.length()==0){
                return "";
            }
            return common;

        }
    }
    public static int shortestStringInArray(String[] array){
        int[] len=new int[array.length];
        for(int i=0;i<array.length;i++){
            len[i]=array[i].length();
        }
        int smallest=findMinFromArray(len);
        return smallest;

    }
    public static int findMinFromArray(int[] array){
        int min=array[0];
        for(int i:array){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
    public static char[] finderForPrefix(String[] s, int len){
        char[] main=new char[len];
        block:{
            for(int j=0;j<len;j++){
                char AtZero=s[0].charAt(j);
                //System.out.println(AtZero);
                for(int i=0;i<s.length;i++){
                    if(s[i].charAt(j)==AtZero){
                        main[j]=AtZero;
                    }else{
                        main[j]=0;
                        break block;
                    }
                }

            }
        }
        return main;
    }
    public static void main(String...args){
        System.out.println(LongestCommonPrefix(new String[]{"a"}));
    }
}
