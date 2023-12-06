package April_2023;

import java.util.ArrayList;

public class OptimalPartitionOfString_Part2 {
    //With String Builder
    //Runtime: 18ms beats 76.9%, Memory: 43.4MB beats 38.41%
    //With String Buffer
    //Runtime: 26ms beats 75.36%, Memory: 43.3MB beats 53%
    //Best Score:
    //Runtime: 17ms beats 76.29%, Memory: 43.2MB beats 59.94%
    //Some further Improvements:
    //Runtime: 9ms beats 92.55%, Memory: 43.5MB beats 38.41%
    public int partitionString(String s) {
        int[] alphabet= new int[26];
        int count=0;
        int strLen=s.length();
        for(int i=0;i<strLen;i++){
            char character=s.charAt(i);
            if (alphabet[character - 97] != 0) {
                count++;
                alphabet = new int[26];
            }
            alphabet[character-97]+=1;
        }
        return count+1;
    }
    public static void main(String...args){
        int value=new OptimalPartitionOfString_Part2().partitionString("abacaba");
        int value2=new OptimalPartitionOfString_Part2().partitionString("ssssss");
        System.out.println(value);
        System.out.println(value2);
    }
}
