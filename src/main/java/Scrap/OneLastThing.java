package Scrap;

public class OneLastThing {
    public static boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int f0=0;
        int f1=0;
        int length=s.length();

        for(int i=0;i<length/2;i++) {
            int p = s.charAt(i);
            if (p == 97 || p ==101 || p == 105 || p == 111 || p == 117) {
                f0++;
            }
        }
        for(int i=length/2;i<length;i++) {
            char p = s.charAt(i);
            if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u') {
                f1++;
            }
        }
        return f1 == f0;
    }

}
