import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class DetermineIfStringHalvesAreAlike_ThirdIteration {
    //Runtime: 36 ms; Beats: 5.5%
    //Memory: 46.2 MB, Beats: 5.3%
    public boolean halvesAreAlike(String s) {
        ArrayList<String> characters = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));
        int length=s.length();
        int x=0;
        int y=0;
        for(String i:s.substring(0,length/2).split("")){
            if(characters.contains(i))x++;
        }
        for(String i:s.substring(length/2,length).split("")){
            if(characters.contains(i))y++;
        }
        return x==y;
    }
}
