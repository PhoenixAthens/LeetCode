package November_2022;

import java.util.*;

public class MakeTheStringGreat {
    //Slow but this code works [35ms][42.7MB]
    public String makeGood(String s) {
        ArrayList<String> provided=new ArrayList<>(Arrays.asList(s.split("")));
        for(int i=0;i<provided.size()-1;i++){
            String get=provided.get(i);
            if(get.hashCode()<=90){
                if(provided.get(i+1).equals(get.toLowerCase())){
                    provided.remove(i+1);
                    provided.remove(i);
                    System.out.println(provided);
                    i-=1;
                }
            }else if(get.hashCode()>=97){
                if(provided.get(i+1).equals(get.toUpperCase())){
                    provided.remove(i+1);
                    provided.remove(i);
                    System.out.println(provided);
                    i-=1;
                }
            }
        }
        StringBuilder build=new StringBuilder();
        provided.forEach(build::append);//method reference doubled the time from 35ms to 70ms
        // use lambda for better performance
        return build.toString();
    }
    public static void main(String...args){
        System.out.println(new MakeTheStringGreat().makeGood("abBAcC"));
    }
}
