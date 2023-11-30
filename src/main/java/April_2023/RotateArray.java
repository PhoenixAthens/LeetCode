package April_2023;

public class RotateArray {
    //Runtime: 1ms beats 53.88%, Memory: 57.8MB beats 96.75%
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int rotate=k%(n);
        if(rotate!=0){
            int[] temp=new int[n];
            int start=n-rotate;
            int cnt=0;
            for(int i=start;i<n;i++){
                temp[cnt++]=nums[i];
            }
            for(int i=0;i<start;i++){
                temp[cnt++]=nums[i];
            }
            System.arraycopy(temp, 0, nums, 0, n);
            //Replacing above with a for-loop improves memory usage!
        }
        System.out.println(java.util.Arrays.toString(nums));

    }
    public static void main(String...args){
        new RotateArray().rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}
