package Scrap;

public class CheckingSomething {
    public static boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int f0=0;
        int f1=0;
        int main=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            int p = s.charAt(i);
            if (p == 97 || p ==101 || p == 105 || p == 111 || p == 117){
                main++;
            }
            if(i==length/2-1){
                f0=main;
                main=0;
            }
        }
        f1=main;
        return f1 == f0;
    }
}
