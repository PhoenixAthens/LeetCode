package May_2023;

public class MaximumNumberOfVowelsIn_A_SubstringOfGivenLength {
    // Works for 102/106 then fails at 103rd test case ( Time Limit Exceeded)
    // A few changes
    //
    public int maxVowels(String s, int k) {
        char[] arr=s.toCharArray();
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(i+k<=arr.length){
                int countTemp=0;
                for(int j=i;j<i+k;j++){
                    if(arr[j]==97||arr[j]==101||arr[j]==105||arr[j]==111||arr[j]==117)countTemp++;
                }
                count=Math.max(countTemp,count);
            }else break;
        }
        return count;
    }
    public static void main(String...args){
        System.out.println(new MaximumNumberOfVowelsIn_A_SubstringOfGivenLength().maxVowels("abciiidef", 3));
    }
}
