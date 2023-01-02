package JAN_2_2023;

public class DetectCapital_ED1 {
    // First Iteration
    //Runtime: 2ms beats 69.98%, Memory: 41.1MB beats 68.17%
    // Second Iteration
    //Runtime: 2ms beats 69.88%, Memory: 40.9MB beats 77.90%
    // Third Iteration
    //Runtime: 2ms beats 69.88%, Memory: 40.9MB beats 77.83%
    public boolean detectCapitalUse(String word) {
        String t1=word.toUpperCase();
        String t2=word.toLowerCase();
        String t3;
        if(word.length()>1) t3=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        else t3=word.substring(0,1);
        return word.equals(t1)||word.equals(t2)||word.equals(t3);
    }
    public static void main(String...args){
        System.out.println((new DetectCapital_ED1().detectCapitalUse("USA")));
        System.out.println((new DetectCapital_ED1().detectCapitalUse("FlaG")));
        System.out.println((new DetectCapital_ED1().detectCapitalUse("G")));
    }
}
