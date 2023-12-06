package April_2023;

import java.util.ArrayList;
//Date: 4th April 2023

public class OptimalPartitionOfString {
    //Runtime: 35ms beats 58.89%, Memory: 49.8MB beats 7.56%
    public int partitionString(String s) {
        int[] alphabet= new int[26];
        ArrayList<String> listOF=new ArrayList<>();
        StringBuffer Current=new StringBuffer();
        int strLen=s.length();
        for(int i=0;i<strLen;i++){
            char character=s.charAt(i);
            if(alphabet[122-character]==0){
                Current.append(character);
                alphabet[122-character]+=1;
            }else{
                listOF.add(Current.toString());
                alphabet=new int[26];
                alphabet[122-character]+=1;
                Current=new StringBuffer();
                Current.append(character);
            }
        }
        listOF.add(Current.toString());
        return listOF.size();
    }
    public static void main(String...args){
        /*var value=new OptimalPartitionOfString().partitionString("abacaba");
        var value2=new OptimalPartitionOfString().partitionString("ssssss");*/
        /*System.out.println(value);
        System.out.println(value2);*/
    }
}
