import java.util.*;
public class CheckIfStringIsParagram {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        String[] arrayOfChars=sentence.toLowerCase().split("");
        System.out.println(Arrays.toString(arrayOfChars));
        Set<String> expected=new HashSet<>(Set.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r"
        ,"s","t","u","v","w","x","y","z"));
        Set<String> provided=new HashSet<>();
        Collections.addAll(provided, arrayOfChars);
        return provided.equals(expected);

    }
    public static void main(String...args){
        System.out.println(new CheckIfStringIsParagram().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
