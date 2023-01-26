package December_2022.From_15th_December_StillWorkingOnIt;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonSubsequence_SecondIteration {
    //works for 17/45 test cases, fails at 18th test case
    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1.equals(text2))return text1.length();
        else{
            int c1=0;
            int c2=0;
            ArrayList<Integer> first=new ArrayList<>();
            ArrayList<Integer> second=new ArrayList<>();
            ArrayList<String> T1=new ArrayList<>(Arrays.asList(text2.split("")));
            ArrayList<String> T2=new ArrayList<>(Arrays.asList(text1.split("")));
            for(String a:T1){
                if(T2.contains(a)){
                    first.add(T2.indexOf(a));
                    c1=1;
                }
            }
            int prev1=0;
            for(int i=0;i<first.size()-1;i++){
                if(first.get(i)<first.get(i+1)){
                    c1++;
                }else{
                    prev1=Math.max(prev1,c1);
                    c1=1;
                }
            }
            for(String b:T2){
                if(T1.contains(b)){
                    second.add(T1.indexOf(b));
                    c2=1;
                }
            }
            int prev2=0;
            for(int i=0;i<second.size()-1;i++){
                if(second.get(i)<second.get(i+1)){
                    c2++;
                }else{
                    prev2=Math.max(prev2,c2);
                    c2=1;
                }
            }
            System.out.println(first);
            System.out.println(second);
            return Math.max(Math.max(c1,c2),Math.max(prev1,prev2));
        }

    }
    public static int CommonSubsequence(String text1, String text2) {
        if(text1.equals(text2))return text1.length();
        else{
            int c1=0;
            int c2=0;
            ArrayList<Integer> first=new ArrayList<>();
            ArrayList<Integer> second=new ArrayList<>();
            ArrayList<String> T1=new ArrayList<>(Arrays.asList(text2.split("")));
            ArrayList<String> T2=new ArrayList<>(Arrays.asList(text1.split("")));
            for(String a:T1){
                if(T2.contains(a)){
                    int r=T2.indexOf(a);
                    first.add(r);
                    T2.set(r,null);
                    c1=1;
                }
            }
            int prev1=0;
            for(int i=0;i<first.size()-1;i++){
                if(first.get(i)<first.get(i+1)){
                    c1++;
                }else{
                    prev1=Math.max(prev1,c1);
                    c1=1;
                }
            }
            for(String b:T2){
                if(T1.contains(b)){
                    int r=T1.indexOf(b);
                    second.add(r);
                    T1.set(r,null);
                    c2=1;
                }
            }
            int prev2=0;
            for(int i=0;i<second.size()-1;i++){
                if(second.get(i)<second.get(i+1)){
                    c2++;
                }else{
                    prev2=Math.max(prev2,c2);
                    c2=1;
                }
            }
            System.out.println(first);
            System.out.println(second);
            return Math.max(Math.max(c1,c2),Math.max(prev1,prev2));
        }

    }
    public static void main(String...args){
        //int r=longestCommonSubsequence("ylqpejqbalahwr","yrkzavgdmdgtqpg");
        int d=CommonSubsequence("ylqpejqbalahwr","yrkzavgdmdgtqpg");
        //System.out.println(r);
        System.out.println(d);
    }
    //text1: "oxcpqrsvwf"   p |
    //text2: "shmtulqrypy"

    //test1: "ylqpejqbalahwr"
    //text2: "yrkzavgdmdgtqpg"
}
