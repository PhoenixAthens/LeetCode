package December_2022.From_1st_December;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DetermineIfStringHalvesAreAlike_SecondIteration {
    //RUNTime:47ms beats 5.5%, Memory:47.5MB beats 5.34%
    public boolean halvesAreAlike(String s) {
        ArrayList<String> characters = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));
        char[] arr=s.toCharArray();
        int length=s.length();
        String half1=s.substring(0,length/2);
        String half2=s.substring(length/2,length);
        AtomicInteger g= new AtomicInteger();
        Arrays.stream(half1.split("")).parallel().forEach(x->{
            if(characters.contains(x)){
                g.addAndGet(1);
            }
        });
        AtomicInteger y= new AtomicInteger();
        Arrays.stream(half2.split("")).parallel().forEach(x->{
            if(characters.contains(x)){
                y.addAndGet(1);
            }
        });
        return g.get()==y.get();
    }
}
