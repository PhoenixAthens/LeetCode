public class SumOfSubarrayMinimums_SecondIteration {
    //works for 77/87 test cases
    //fails at the 77th "Time Limit Exceeded!!"
    public static int sumSubarrayMins(int[] arr) {
        int totalSum=0;
        int bummer=1_000_000_007;
        int min;
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            for(int j=i;j<arr.length;j++){
                min=Math.min(min,arr[j]);
                totalSum+=min;
                totalSum%=bummer;
            }
        }
        return totalSum;
    }
    public static void main(String...args){
        System.out.println(sumSubarrayMins(new int[]{36,74,84,92,17,68,97,6,68,85}));
    }

}
