package From_1st_December;
import java.util.*;
public class DetermineIfStringHalvesAreAlike {
    //RUNTime:16ms beats 16.80%, Memory:42.5MB beats 35.52%
    public boolean halvesAreAlike(String s) {
        ArrayList<Character> characters=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int f0=0;
        int f1=0;
        int main=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            if(characters.contains(s.charAt(i))){
                main++;
            }
            if(i==length/2-1){
                f0=main;
                main=0;
            }
        }
        f1=main;
        System.out.println(f0+":"+f1);
        return f1 == f0;
    }
    public static void main(String...args){
        System.out.println(new DetermineIfStringHalvesAreAlike().halvesAreAlike("textbook"));
    }
}
