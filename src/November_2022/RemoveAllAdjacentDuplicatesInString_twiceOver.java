package November_2022;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveAllAdjacentDuplicatesInString_twiceOver {
    //Time: 283MS, Memory:49.4MB
    public String removeDuplicates(String s) {
        ArrayList<String> copy=new ArrayList<>(Arrays.asList(s.split("")));
        String peeves=null;
        int length=copy.size();
        for(int i=0;i<length;i++){
            if(i<0)i++;
            String at=copy.get(i);
            if(peeves!=null && peeves.equals(at)){
                copy.remove(i);
                copy.remove(i-1);
                peeves=null;
                i-=3;
                length-=2;
                if(length==0)return "";
            }else{
                peeves=at;
            }
        }
        StringBuilder build=new StringBuilder();
        for(String i:copy){
            build.append(i);
        }
        return build.toString();

    }
}
