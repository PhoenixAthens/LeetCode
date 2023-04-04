package April_2023;

import java.util.ArrayList;

public class OptimalPartitionOfString_Part2 {
    //With String Builder
    //Runtime: 18ms beats 76.9%, Memory: 43.4MB beats 38.41%
    //With String Buffer
    //Runtime: 26ms beats 75.36%, Memory: 43.3MB beats 53%
    public int partitionString(String s) {
        int[] alphabet= new int[26];
        int count=0;
        StringBuffer Current=new StringBuffer();
        int strLen=s.length();
        for(int i=0;i<strLen;i++){
            char character=s.charAt(i);
            if(alphabet[122-character]==0){
                Current.append(character);
                alphabet[122-character]+=1;
            }else{
                count++;
                alphabet=new int[26];
                alphabet[122-character]+=1;
                Current=new StringBuffer();
                Current.append(character);
            }
        }
        return count+1;
    }
    public static void main(String...args){
        var value=new OptimalPartitionOfString_Part2().partitionString("abacaba");
        var value2=new OptimalPartitionOfString_Part2().partitionString("ssssss");
        System.out.println(value);
        System.out.println(value2);
    }
}
