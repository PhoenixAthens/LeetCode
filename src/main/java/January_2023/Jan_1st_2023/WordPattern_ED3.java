package January_2023.Jan_1st_2023;
import java.util.*;
public class WordPattern_ED3 {
    // works for 31/37 test cases!!
    public boolean wordPattern(String pattern, String s) {
        HashSet<String> make1=new HashSet<>(new ArrayList<>(List.of(pattern.split(""))));
        HashSet<String> make2=new HashSet<>(new ArrayList<>(List.of(s.split(" "))));
        return make1.size()==make2.size();
    }
}
