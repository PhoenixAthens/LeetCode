package From_1st_December;

public class DetermineIfStringHalvesAreAlike_FifthIteration {
    //RunTime:9ms beats 50%, Memory:42.5MB beats 35.52%
    public boolean halvesAreAlike(String s) {
        int f0=0;
        int f1=0;
        int main=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            char p=s.charAt(i);
            if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'||p=='A'||p=='E'||p=='I'||p=='O'||p=='U'){
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
