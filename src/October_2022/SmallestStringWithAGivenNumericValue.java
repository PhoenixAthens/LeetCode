package October_2022;

public class SmallestStringWithAGivenNumericValue {
    //Runtime: 100ms beats 5.58%, Memory: 67.9MB beats 5.18%
    public static String getSmallestString(int n, int k) {
        String[] chars=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s",
                "t","u","v","w","x","y","z"};
        StringBuilder represent=new StringBuilder();
        int present=chars.length;
        while(k>0 /*&& represent.length()!=n*/){
            if((k-present)>=n-1){
                //System.out.println(k+":"+n+":"+represent);
                k-=present;
                n-=1;
                represent.append(chars[present-1]);
            }else{
                //System.out.println(k+":"+n+":"+represent);
                present-=1;
            }

        }
        return represent.reverse().toString();
    }
    public static void main(String...args){
        System.out.println(getSmallestString(5,73));
    }
}
