package January_2023.Jan_2nd_2023;

public class DetectCapital_ED2 {
    //Runtime: 2ms beats 69.88%, Memory: 40.8MB beats 77.90%
    public boolean detectCapitalUse(String word) {
        String t3;
        if(word.length()>1) t3=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        else t3=word.substring(0,1);
        return word.equals(word.toUpperCase())||word.equals(word.toLowerCase())||word.equals(t3);

    }
}
