import java.util.*;
public class MinimumWindowString {
    //This does not work for all test cases
    public String minWindow(String s, String t){
        if(s.equals(t) || s.contains(t)){
            return t;
        }if(s.length()<t.length()) return "";
        //if(s.length()==t.length() && !s.contains(t)) return "";
        boolean repetition=false;
        ArrayList<String> provided=new ArrayList<>();
        String[] dont=t.split("");
        String repetitionOf=null;
        for(String k:dont){
            if(provided.contains(k)){
                repetition=true;
                repetitionOf=k;
            }
            provided.add(k);
        }
        String[] temp=new String[s.length()];
        ArrayList<String> found=new ArrayList<>();
        //System.out.println(provided.toString());
        int counter=0;
        boolean flag=false;
        String prev=null;
        StringBuilder tempMade= new StringBuilder();
        for(Character a:s.toCharArray()){
            String here=String.valueOf(a);
            if(here.equals(repetitionOf)){

            }else if(here.equals(prev) && counter<t.length()){
                    tempMade = new StringBuilder(here);
                    counter=1;
                    flag=true;
                    continue;
            }
            if(provided.contains(here)){
                prev=here;
                counter++;
                flag=true;
                tempMade.append(here);
            }else if(flag){
                tempMade.append(here);
            }
            if(counter==t.length()){
                flag=false;
                found.add(tempMade.toString());
                counter=0;
                tempMade = new StringBuilder();
                if(provided.contains(prev)){
                  counter++;
                  flag=true;
                  tempMade.append(prev);
                }else{
                    prev=null;
                }
            }
        }
        System.out.println(found);
        if(found.size()==0) return "";
        else{
            String toGo=found.get(0);
            int minimal=toGo.length();
            for(String str:found){
                if(str.length()<minimal){
                    toGo=str;
                }
            }
            return toGo;
        }
    }
    public static void main(String...args){
        System.out.println(new MinimumWindowString().minWindow("cabeca","cae"));
    }

}
