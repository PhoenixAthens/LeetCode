package November_2022;

import java.util.Arrays;

public class RemoveAllAdjacentDuplicatesInString {
    //Works in 104/106 testCases
    public String removeDuplicates(String s) {

        String[] provided=s.split("");
        String[] mainArray=recur(provided);
        StringBuilder build=new StringBuilder();
        for(String i:mainArray){
            if(i!=null)build.append(i);
        }
        return build.toString();
    }
    public String[] recursiveRemoval(String[] inn){
        String prev=null;
        int len=inn.length;
        for(int i=0;i<inn.length;i++){
            if(inn[i]!=null && inn[i].equals(prev)){
                inn[i]=null;
                inn[i-1]=null;
                len-=2;
            }
            prev=inn[i];
        }
        String[] turnIn=new String[len];
        int j=0;
        for(String i:inn){
            if(i!=null){
                turnIn[j]=i;
                j++;
            }
        }
        return turnIn;
    }
    public  String[] recur(String[] inn){
        String[] newArr= recursiveRemoval(inn);
        if(Arrays.equals(newArr, inn)){
            return inn;
        }else{
            return recur(newArr);
        }
    }
    public static void main(String...args){
        System.out.println(new RemoveAllAdjacentDuplicatesInString().removeDuplicates("abbaca"));
    }
}
