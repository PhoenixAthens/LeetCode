package April_2023;
//Date: 26th April 2023
public class ReverseString {
    //Runtime: 1ms beats 96.30%, Memory: 49MB beats 91.12%
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++){
            char temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
        //System.out.println(java.util.Arrays.toString(s));
    }
    public static void main(String...args){
        new ReverseString().reverseString(new char[]{'h','e','l','l','o'});
    }
}
