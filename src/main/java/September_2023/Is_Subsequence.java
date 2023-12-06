package September_2023;

//import org.jetbrains.annotations.NotNull;

public class Is_Subsequence {
    //Enhanced for-loop takes more space than traditional for loop
    //Enhanced For loop -> runtime 0ms, memory 40.49 MB
    //Traditional For loop -> runtime 0ms, memory 40.20 MB
    public boolean isSubsequence(String s, String t) {
        char[] fromT = t.toCharArray();
        char[] fromS = s.toCharArray();
        if(fromS.length > fromT.length)return false;
        else if(fromS.length == 0)return true;
        int j=0;
        for(int i=0; i<fromT.length; i++){
            if(fromT[i]==fromS[j])j++;
            if(j==fromS.length)return true;

        }
        return false;
    }
    public static void main(String...args){
        System.out.println(new Is_Subsequence().isSubsequence("axc","ahbgdc"));
        System.out.println("".toCharArray().length);
    }
}
