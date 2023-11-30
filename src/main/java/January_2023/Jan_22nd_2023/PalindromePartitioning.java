package January_2023.Jan_22nd_2023;
import java.util.*;
public class PalindromePartitioning {
    //works for 11/32 test cases
    public List<List<String>> partition(String s) {

        ArrayList<ArrayList<String>> allSubStrings=new ArrayList<>();
        int stringLength=s.length();
        for(int i=0;i<stringLength;i++){
            StringBuffer temp=new StringBuffer();
            temp.append(s.charAt(i));
            for(int size=2;size<stringLength;size++){
                for(int j=i+1;j<stringLength;j++) {
                    temp.append(s.charAt(j));
                    if (temp.toString().length() == size) {
                        int whereAt=j;
                        ArrayList<String> make=new ArrayList<>();
                        for(int z=0;z<i;z++)make.add(""+s.charAt(z));
                        make.add(temp.toString());
                        for(int z=whereAt+1;z<stringLength;z++)make.add(""+s.charAt(z));
                        allSubStrings.add(make);
                        temp = new StringBuffer();
                        for (int k = i; k < size; k++) temp.append(s.charAt(k));
                    }
                }
            }
        }
        List<List<String>> main=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        for(int i=0;i<stringLength;i++)temp.add(""+s.charAt(i));
        main.add(temp);
        for(int i=0;i<allSubStrings.size();i++){
            ArrayList<String> present=allSubStrings.get(i);
            boolean signal=true;
            for(String str:present) if(!PalindromeChecker(str,str.length()))signal=false;
            if(signal)main.add(present);
        }
        if(PalindromeChecker(s,stringLength) && s.length()>1)main.add(new ArrayList<>(List.of(s)));
        return main;
    }
    public static boolean PalindromeChecker(String s, int size){
        int beginPointer=0;
        if(size>2){
            for(int i=size-1;i>=size/2;i--){
                System.out.println(s.charAt(beginPointer)+" : "+s.charAt(i));
                if(s.charAt(beginPointer)!=s.charAt(i))return false;
                beginPointer++;
            }
            return true;
        }else if(size==2){
            return s.charAt(0)==s.charAt(1);
        }else{
            return true;
        }
    }
    public static void main(String...args){
        //System.out.println(new PalindromePartitioning().partition("aab"));
        /*System.out.println(PalindromeChecker("efe",3));
        System.out.println(PalindromeChecker("effe",4));
        System.out.println(PalindromeChecker("ab",2));
        System.out.println(PalindromeChecker("aa",2));*/
        System.out.println(PalindromeChecker("bbabb",5));
        System.out.println(new PalindromePartitioning().partition("abbab"));



    }
}
