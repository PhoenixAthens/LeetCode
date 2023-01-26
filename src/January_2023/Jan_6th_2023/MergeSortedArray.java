package January_2023.Jan_6th_2023;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==1 && nums2.length==1){
            nums1[0]=Math.max(nums1[0],nums2[0]);
        }
        else if(nums2.length!=0){
            int index=0;
            int[] newOne=new int[nums1.length];
            int cnt=0;
            for(int i=0;i<nums1.length;i++){
                if(nums2[index]<=nums1[i]){
                    newOne[cnt++]=nums2[index++];
                }
                if(nums1[i]!=0)newOne[cnt++]=nums1[i];
                else{
                    for(int j=i+1;j<nums1.length;j++){
                        newOne[cnt++]=nums2[index++];
                    }
                    break;
                }
            }
            nums1=newOne;
            System.out.println(java.util.Arrays.toString(nums1));
        }
    }
    public static void main(String...args){
        new MergeSortedArray().merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        new MergeSortedArray().merge(new int[]{1},3,new int[]{},3);
        new MergeSortedArray().merge(new int[]{0},3,new int[]{1},3);
    }
    /*
        int[] newCreation=new int[nums1.length];
        int cnt=0;
        for(int i=0;i<nums1.length;i++){
            int small=Math.min(nums1[i],nums2[i]);
            if (small != 0) {
                newCreation[cnt++] = small;
            }
            newCreation[cnt++]=Math.max(nums1[i],nums2[i]);


        }
        nums1=newCreation;
    * */
}
