package January_2023.Jan_17th_2023;

public class FlipStringToMonotoneIncreasing_ED2 {
    //works for 88/93 test cases;
    //Time limit exceeded
    public int minFlipsMonoIncr(String s) {
        char[] arr=s.toCharArray();
        int misplacedZeroes=0;
        int misplacedOnes=0;
        for(int i=0;i<s.length();i++){
            if(arr[i]=='0'){
                for(int j=0;j<i;j++){
                    if(arr[j]=='1'){
                        misplacedZeroes++;
                        arr[j]='0';
                        break;
                    }
                }
            }else{
                for(int j=i+1;j<s.length();j++){if(arr[j]=='0'){misplacedOnes++;break;}}
            }
        }
        return Math.min(misplacedOnes,misplacedZeroes);
    }
    public static void main(String...args){
        System.out.println(new FlipStringToMonotoneIncreasing_ED2().minFlipsMonoIncr("00110"));
        System.out.println(new FlipStringToMonotoneIncreasing_ED2().minFlipsMonoIncr("010110"));
        System.out.println(new FlipStringToMonotoneIncreasing_ED2().minFlipsMonoIncr("00011000"));
        System.out.println(new FlipStringToMonotoneIncreasing_ED2().minFlipsMonoIncr("0101100011"));
        System.out.println(new FlipStringToMonotoneIncreasing_ED2().minFlipsMonoIncr("10011111110010111011"));

    }
}
