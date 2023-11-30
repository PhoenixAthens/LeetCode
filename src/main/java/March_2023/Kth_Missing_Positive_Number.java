package March_2023;
//Date: 8th March 2023
public class Kth_Missing_Positive_Number {
    //Runtime: 0ms, beats 100%, Memory: 42.3MB beats 24.74%
    public int findKthPositive(int[] arr, int k) {
        int j=0;
        int count=0;
        for(int i=1;i<=1000;i++){
            if(j<arr.length){
                if(i!=arr[j])count++;
                else j++;
            }
            else count++;
            if(count==k)return i;
        }
        return 1000;
    }
}
