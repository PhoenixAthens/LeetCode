package JAN_1_2023;
import java.util.*;

public class WordPattern_ED2 {
    // first iteration
    // runtime: 2ms beats 38.63%, Memory: 40.5MB beats 66.98%
    // second iteration
    // runtime: 2ms beats 38.63%, Memory: 40.1MB beats 90.3%
    // Third Iteration
    // runtime: 2ms beats 38.63%, Memory: 40.4MB beats 70.29%
    public boolean wordPattern(String pattern, String s) {
        if (pattern.length()!= s.split(" ").length) return false;//this line of code reduces memory consumption by some percent!!
        int[] first=createScheme(pattern.split(""));
        int[] second=createScheme(s.split(" "));
        return Arrays.equals(first,second);
    }
    public int[] createScheme(String[] seq){
        int[] result=new int[seq.length];
        int count=0;
        int val=0;
        HashMap<String,Integer> make=new HashMap<>();
        for(String chara:seq){
            if(make.containsKey(chara)){
                result[count++]=make.get(chara);
            }else{
                make.put(chara,val);
                result[count++]=val++;
            }
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String...args){
        System.out.println(new WordPattern_ED2().wordPattern("abba","dog cat cat dog"));
        System.out.println(new WordPattern_ED2().wordPattern("abba","dog cat cat fish"));
        System.out.println(new WordPattern_ED2().wordPattern("aaaa","dog cat cat dog"));
    }
    /*
     * This didn't work, but it was worth a shot!!
     *
     *
     *         HashMap<String,String> make=new HashMap<>();
     *         String[] fromP=pattern.split("");
     *         String[] fromS=s.split(" ");
     *         int count=0;
     *         for(int i=0;i<fromS.length;i++){
     *             String present=fromS[i];
     *             if(make.containsKey(present)){
     *                 make.put(present+count,make.get(present));
     *                 count++;
     *             }else{
     *                 System.out.println(present+" : "+fromP[i]);
     *                 make.put(present,fromP[i]);
     *             }
     *         }
     *         System.out.println(make);
     *         String[] madePattern=make.values().toArray(new String[0]);
     *         System.out.println(Arrays.toString(madePattern));
     *         return Arrays.equals(madePattern,fromP);
     */
    /*
       This didn't work either!!

        String[] fromS=s.split(" ");
        String[] fromP=pattern.split("");
        ArrayList<String> myList=new ArrayList<>();
        int len=pattern.length();
        StringBuffer buff=new StringBuffer();
        for(int i=0;i<len;i++){
            String Present=fromS[i];
            if(myList.contains(Present)){
                buff.append(fromP[myList.indexOf(Present)]);
            }else{
                myList.add(Present);
                buff.append(fromP[i]);
            }
        }
        return Objects.equals(buff.toString(),pattern);
    */

}
