package LinkedIN_Learning.Java_Algorithms;

import java.util.Stack;
import java.util.stream.Stream;

public class StringValidation {
    //Imperative Solution
    public static boolean isUpperCase_1(String s){
        char[] arr = s.toCharArray();
        for(char a:arr)if(!Character.isUpperCase(a))return false;
        return true;
    }
    public static boolean isLowerCase_1(String s){
        char[] arr = s.toCharArray();
        for(char a:arr)if(!Character.isLowerCase(a))return false;
        return true;
    }
    //Using Streams API
    public static boolean isUpperCase_UsingLambdaExp(String s){
        return s.chars().allMatch(x->Character.isUpperCase(x));
    }
    public static boolean isUpperCase_UsingMethodReferences(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }
    public static boolean isLowerCase_UsingLambdaExp(String s){
        return s.chars().allMatch(x->Character.isLowerCase(x));
    }
    public static boolean isLowerCase_UsingMethodReferences(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }
    //Alternates to using .allMatch()
    public static boolean isUpperCase(String s){
        return s.chars().noneMatch(Character::isLowerCase);
    }
    public static boolean isLowerCase(String s){
        return s.chars().noneMatch(Character::isUpperCase);
    }

    //Checking if string has at-least one uppercase, one lowercase, and one digit
    public static boolean passwordChecker(String s){
        return s.chars().anyMatch(Character::isUpperCase)&&
                s.chars().anyMatch(Character::isLowerCase)&&
                s.chars().anyMatch(Character::isDigit);
    }

    //Testing .anyMatch()
    public static boolean randomChecker(String s){
        return s.chars().anyMatch(Character::isLowerCase);
    }
    // imperative-approach
    public static String normalizeString_Imperative(String s){
        String lower_case = s.toLowerCase();
        String trimmed = lower_case.trim();
        String replacementApplied = trimmed.replace(",","");
        return replacementApplied;
    }
    //Better approach
    public static String normalizeString_Experiment(String s){
        return s.chars().map(Character::toLowerCase).toString();
    }
    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",","");
    }

    //Searching for letter in string (Imperative)
    public static boolean searchForAtEvenIndex(String str, char c){
        //The condition below is necessary because if str is null,
        //invoking a method on the null string will give a Null Pointer Exception!!
        /*
        * String a= null;
        * System.out.println(a.length()); //this will give a null pointer exception
        * */
        if(str==null || str.isEmpty())return false;
        for(int i=0;i<str.length();i+=2)if(str.charAt(i)==c)return true;
        return false;
    }
    public static boolean searchForAtOddIndex(String str, char c){
        if(str==null || str.isEmpty())return false;
        for(int i=1;i<str.length();i+=2)if(str.charAt(i)==c)return true;
        return false;
    }

    //using for-loop
    public static String reverseString(String s){
        StringBuilder builder = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)builder.append(s.charAt(i));
        return builder.toString();
    }
    // using .reverse() method
    public static String reverseString_2(String s){
        return new StringBuilder(s).reverse().toString();
    }

    //Challenge "reverse every word in a String"
    public static String reverseWordsInSentence(String sentence){
        if(sentence==null || sentence.isEmpty())return "";
        StringBuilder reverseString = new StringBuilder();
        Stack<StringBuilder> intermediate = new Stack<>();
        for(int i=sentence.length()-1;i>=0;i--){
            if(sentence.charAt(i)==' '){
                intermediate.push(reverseString);
                reverseString = new StringBuilder();
                continue;
            }
            reverseString.append(sentence.charAt(i));
        }
        intermediate.push(reverseString);
        reverseString = new StringBuilder();
        while(!intermediate.isEmpty()){
            reverseString.append(intermediate.pop());
            reverseString.append(" ");
        }
        return reverseString.toString();
    }

    public static String reverseEachWord_Simpler(String s){
        if(s==null || s.length()<=1)return s;
        String[] arr= s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<arr.length-1;i++){
            result.append(new StringBuilder(arr[i]).reverse());
            result.append(" ");
        }
        result.append(new StringBuilder(arr[arr.length-1]).reverse());
        return result.toString();

    }
    /*
    * Anymatch
    * Returns whether any elements of this stream match the provided predicate.
    *  May not evaluate the predicate on all elements if not necessary for determining
    * the result. If the stream is empty then false is returned and the predicate is not evaluated.
    *
    * So basically, `.anyMatch()` returns true if any of the characters in stream
    * justify the specified condition
    * */
    public static void main(String...args){
        System.out.println(isUpperCase("hello"));
        System.out.println(isUpperCase_1("hello"));
        System.out.println(isUpperCase_UsingLambdaExp("hello"));
        System.out.println(isUpperCase_UsingMethodReferences("hello"));
        System.out.println("-------------------------------------------");
        System.out.println(isUpperCase("HeLLO"));
        System.out.println(isUpperCase_1("HeLLO"));
        System.out.println(isUpperCase_UsingLambdaExp("HeLLO"));
        System.out.println(isUpperCase_UsingMethodReferences("HeLLO"));
        System.out.println("-------------------------------------------");
        System.out.println(isUpperCase("HELLO"));
        System.out.println(isUpperCase_1("HELLO"));
        System.out.println(isUpperCase_UsingLambdaExp("HELLO"));
        System.out.println(isUpperCase_UsingMethodReferences("HELLO"));
        System.out.println("-------------------------------------------");
        System.out.println(isLowerCase("hello"));
        System.out.println(isLowerCase_1("hello"));
        System.out.println(isLowerCase_UsingLambdaExp("hello"));
        System.out.println(isLowerCase_UsingMethodReferences("hello"));
        System.out.println("-------------------------------------------");
        System.out.println(isLowerCase("HeLLO"));
        System.out.println(isLowerCase_1("HeLLO"));
        System.out.println(isLowerCase_UsingLambdaExp("HeLLO"));
        System.out.println(isLowerCase_UsingMethodReferences("HeLLO"));
        System.out.println("-------------------------------------------");
        System.out.println(isLowerCase("HELLO"));
        System.out.println(isLowerCase_1("HELLO"));
        System.out.println(isLowerCase_UsingLambdaExp("HELLO"));
        System.out.println(isLowerCase_UsingMethodReferences("HELLO"));
        System.out.println("-------------------------------------------");
        System.out.println(passwordChecker("Hello"));
        System.out.println(passwordChecker("He0llo"));
        System.out.println(passwordChecker("HELLO"));
        System.out.println(passwordChecker("hello0"));
        System.out.println(passwordChecker("HELLO0"));
        System.out.println("-------------------------------------------");
        System.out.println(randomChecker("Hello"));
        System.out.println(randomChecker("He0llo"));
        System.out.println(randomChecker("HELLO"));
        System.out.println(randomChecker("hello0"));
        System.out.println(randomChecker("HELLO0"));
        System.out.println("-------------------------------------------");
        System.out.println(normalizeString_Imperative(" Hello there, buddy BOT!"));//hello there buddy bot!
        System.out.println(normalizeString_Experiment(" Hello there, buddy BOT!"));//java.util.stream.IntPipeline$4@77459877
        System.out.println(normalizeString(" Hello there, buddy BOT!"));//hello there buddy bot!
        System.out.println("-------------------------------------------");
        System.out.println(reverseWordsInSentence(null));
        System.out.println(reverseWordsInSentence(""));
        System.out.println(reverseWordsInSentence(" "));
        System.out.println(reverseWordsInSentence("sally is a great worker"));
        System.out.println(reverseWordsInSentence("racer racecar madam"));
        System.out.println(reverseWordsInSentence("What can I do today"));
        System.out.println("-------------------------------------------");
        System.out.println(reverseEachWord_Simpler(null));
        System.out.println(reverseEachWord_Simpler(""));
        System.out.println(reverseEachWord_Simpler(" "));
        System.out.println(reverseEachWord_Simpler("sally is a great worker"));
        System.out.println(reverseEachWord_Simpler("racer racecar madam"));
        System.out.println(reverseEachWord_Simpler("What can I do today"));
    }
}
