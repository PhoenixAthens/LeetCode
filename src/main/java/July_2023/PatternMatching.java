package July_2023;

public class PatternMatching {
    //näive algo
    public static int mainSearch(String pattern, String text){
        char[] patternArray = pattern.toCharArray();
        char[] textCharArray = text.toCharArray();
        for(int i=0;i<text.length();i++){
            int j = 0;
            int tempI = i;
            while( j < patternArray.length && tempI<textCharArray.length && patternArray[j]==textCharArray[tempI]){
                j++;
                tempI++;
            }
            if(j==patternArray.length)return tempI-j;
        }
        return -1;
    }
    public static boolean patternSearch(String pattern, String text){
        int result = mainSearch(pattern,text);
        if(result!=-1){
            System.out.println("Pattern found at "+result);
            return true;
        }else{
            System.out.println("Pattern not found");
            return false;
        }
    }

    //knuth-morris pratt algorithm
    public static int[] patternWorker(char[] pattern){
        int[] repeater = new int[pattern.length];
        int j=0;
        for(int i=1;i<pattern.length;i++){
            while(j>1 && pattern[i]!=pattern[j]){
                j = repeater[j-1];
            }
            if(pattern[j]==pattern[i])j+=1;
            repeater[i]=j;
        }
        return repeater;
    }
    public static int patternSearch_KMP(char[] pattern, char[] text){
        int[] patternAnalysis = patternWorker(pattern);
        int j = 0;
        for(int i=0;i<text.length;i++){
            while(j>1 && text[i]!=pattern[j]){
                j = patternAnalysis[j-1];
            }
            if(pattern[j]==text[i])j+=1;
            if(j==pattern.length)return i-j+1;
        }
        return -1;
    }
    public static boolean patternSearch_fast(String pattern, String text){
        int result = patternSearch_KMP(pattern.toCharArray(),text.toCharArray());
        if(result!=-1){
            System.out.println("Pattern found at "+result);
            return true;
        }else{
            System.out.println("Pattern not found!!");
            return false;
        }
    }


    public static void main(String...args){
        patternSearch("aba","cbabababaa");
        patternSearch("abcabb","cbabababaa") ;
        patternSearch("aba","cbabababaa") ;
        patternSearch("abcabb","cbabcabcab") ;
        patternSearch("abcabb","cbabcabcabb");

        patternSearch_fast("aba","cbabababaa");
        patternSearch_fast("abcabb","cbabababaa") ;
        patternSearch_fast("aba","cbabababaa") ;
        patternSearch_fast("abcabb","cbabcabcab") ;
        patternSearch_fast("abcabb","cbabcabcabb");
    }
}
