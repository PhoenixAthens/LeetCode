package September_2022;

import java.util.Arrays;

public class Roman_to_Integer{
    //Runtime: 24ms beats 7.15%, Memory: 46.9MB beats 11.41%
    public static int CharArray(String s){
        String enteredString=s.toUpperCase();
        char[] arrayOfCharacters=enteredString.toCharArray();
        int[] ArrayOFNumbers=Determiner(arrayOfCharacters);
        System.out.println(Arrays.toString(ArrayOFNumbers));
        return calculator(ArrayOFNumbers);
    }
    public static int[] Determiner(char[] charArray){
        int[] numArray=new int[charArray.length];
        int counter=0;
        for(char c:charArray){
            if(c=='I'){
                numArray[counter]=1;
                counter++;
            }
            else if(c=='V'){
                numArray[counter]=5;
                counter++;
            }else if(c=='X'){
                numArray[counter]=10;
                counter++;
            }else if(c=='L'){
                numArray[counter]=50;
                counter++;
            }else if(c=='C'){
                numArray[counter]=100;
                counter++;
            }else if(c=='D'){
                numArray[counter]=500;
                counter++;
            }else if(c=='M'){
                numArray[counter]=1000;
                counter++;
            }else return null;
        }
        return numArray;
    }
    public static int calculator(int[] array){
        int sum=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>array[i-1]){
                sum-=array[i-1];
                sum+=(array[i]-array[i-1]);
            }else sum+=array[i];
        }
        return sum;
    }
    public static void main(String...args){
        System.out.println(CharArray("MCMXCIV"));
    }
}
