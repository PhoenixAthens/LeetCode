package April_2023;
//Data: 18th April 2023
public class MergeStringsAlternately {
    //Runtime: 0ms beats 100%, Memory: 40.9MB beats 61.59%
    public String mergeAlternately(String word1, String word2) {
        StringBuilder build=new StringBuilder();
        int lenWord1=word1.length();
        int lenWord2=word2.length();
        if(lenWord1>lenWord2){
            int i=0;
            while(i<lenWord2){
                build.append(word1.charAt(i));
                build.append(word2.charAt(i));
                i++;
            }
            while(i<lenWord1){
                build.append(word1.charAt(i));
                i++;
            }
        }else if(lenWord2>lenWord1){
            int i=0;
            while(i<lenWord1){
                build.append(word1.charAt(i));
                build.append(word2.charAt(i));
                i++;
            }
            while(i<lenWord2){
                build.append(word2.charAt(i));
                i++;
            }
        }else{
            for(int i=0;i<lenWord1;i++){
                build.append(word1.charAt(i));
                build.append(word2.charAt(i));
            }
        }
        return build.toString();
    }
    public static void main(String...args){
        System.out.println(new MergeStringsAlternately().mergeAlternately("abc","pqr"));
        System.out.println(new MergeStringsAlternately().mergeAlternately("ab","pqrs"));
    }
}
