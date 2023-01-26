package December_2022.From_1st_December;

public class DetermineIfStringHalvesAreLike_FinalIteration {
    //Runtime: 6ms beats 70.18%, Memory:42.5MB beats 35.52%
    public static boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int f0=0;
        int f1=0;
        int main=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            char p=s.charAt(i);
            if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'){
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
