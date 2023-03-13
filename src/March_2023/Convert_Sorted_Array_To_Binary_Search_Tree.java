package March_2023;
//Date: 13th March 2023
public class Convert_Sorted_Array_To_Binary_Search_Tree {
    //Runtime: 0ms beats 100%, Memory: 42.7MB beats 19.79%
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==1)return new TreeNode(nums[0]);
        else{
            return word(0,nums.length,nums);
        }
    }
    public TreeNode word(int startIndex, int stopIndex, int[] mainArray){
        if(stopIndex-startIndex==0)return null;
        int len=stopIndex-startIndex;
        int middle=len/2+startIndex;
        TreeNode make=new TreeNode(mainArray[middle]);
        make.left=word(startIndex,middle,mainArray);
        make.right=word(middle+1,stopIndex,mainArray);
        return make;
    }
    public static void main(String...args){
        var result1=new Convert_Sorted_Array_To_Binary_Search_Tree().sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
