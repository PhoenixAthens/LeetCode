import java.util.*;
public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1){
            return String.valueOf(n);
        }else{
            return counter(countAndSay(n-1));
        }
    }
    public static String counter(String num){
        ArrayList<String> arrayList=new ArrayList<>();
        char prev=num.charAt(0);
        int counter=1;
        if(num.length()==1){
            arrayList.add(String.valueOf(counter));
            arrayList.add(String.valueOf(prev));
        }else{
            for(int i=1;i<num.length();i++){
                if(num.charAt(i)==prev){
                    counter++;
                }else{
                    arrayList.add(String.valueOf(counter));
                    arrayList.add(String.valueOf(prev));
                    counter=1;
                    prev=num.charAt(i);
                }
                if(i==num.length()-1){
                    arrayList.add(String.valueOf(counter));
                    arrayList.add(String.valueOf(prev));

                }
            }
        }
        String str="";
        for(String s:arrayList){
            str+=s;
        }
        return str;
    }
    public static void main(String...args){
        System.out.println(new CountAndSay().countAndSay(4));
    }
}
