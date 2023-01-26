package October_2022;

public class CheckIfTwoStringsAreEquivalent {
    //Runtime: 1ms beats 83.44%, Memory: 42.2MB beats 17.92%
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first= new StringBuilder();
        for(String i:word1){
            first.append(i);
        }
        StringBuilder second=new StringBuilder();
        for(String j:word2){
            second.append(j);

        }
        return first.toString().equals(second.toString());
    }
    public static void main(String...args){
        System.out.println(new CheckIfTwoStringsAreEquivalent().arrayStringsAreEqual(new String[]{"ab", "c"},new String[]{"a", "bc"}));
    }
}

