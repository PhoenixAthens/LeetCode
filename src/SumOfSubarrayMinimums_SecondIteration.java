public class SumOfSubarrayMinimums_SecondIteration {
    //works for 59/87 test cases
    //fails at: [36,74,84,92,17,68,97,6,68,85]
    public static int sumSubarrayMins(int[] arr) {
        int totalSum=0;
        int bummer=1_000_000_007;
        int min=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    totalSum+=arr[i];
                    min=arr[i];
                }else{
                    min=Math.min(min,arr[j]);
                    totalSum+=min;
                }
                totalSum%=bummer;
                System.out.println("Sum: "+totalSum);

            }
        }
        return totalSum%bummer;
    }
    public static void main(String...args){
        System.out.println(sumSubarrayMins(new int[]{36,74,84,92,17,68,97,6,68,85}));
    }

}
