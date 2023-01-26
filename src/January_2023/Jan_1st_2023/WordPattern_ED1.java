package January_2023.Jan_1st_2023;
import java.util.*;
public class WordPattern_ED1 {
    //works for 35/37 test cases
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length()==1 && s.length()!=1){
            return true;
        }else{
            String[] fromS=s.split(" ");
            String[] fromP=pattern.split("");
            StringBuffer buff=new StringBuffer();
            ArrayList<Character> soFar=new ArrayList<>();
            char[] arrayOfIndices=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            int count=0;
            for(String sub:fromS){
                char finale=sub.charAt(sub.length()-1);
                if(soFar.contains(finale)){
                    buff.append(arrayOfIndices[soFar.indexOf(finale)]);
                }else{
                    soFar.add(finale);
                    buff.append(arrayOfIndices[count]);
                    count++;
                }
            }
            StringBuffer buff2=new StringBuffer();
            soFar=new ArrayList<>();
            count=0;
            for(String sub:fromP){
                char finale=sub.charAt(sub.length()-1);
                if(soFar.contains(finale)){
                    buff2.append(arrayOfIndices[soFar.indexOf(finale)]);
                }else{
                    soFar.add(finale);
                    buff2.append(arrayOfIndices[count]);
                    count++;
                }
            }

            return buff.toString().equals(buff2.toString());
        }


    }
    public static void main(String...args){
        String s=new String("Hello world, my name is fascinate!");
        String[] array=s.split(" ");
        //System.out.println(Arrays.toString(array));
        //System.out.println(new Word_Pattern().wordPattern("abba","dog cat cat dog"));
        //System.out.println(new Word_Pattern().wordPattern("abba","dog cat cat fish"));
        System.out.println(new WordPattern_ED1().wordPattern("aaaa","dog cat cat dog"));
    }

}
