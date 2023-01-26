package December_2022.From_7th_December;

public class RangeSumOfBST {
    //Runtime: 0ms, Memory: 67.9MB
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root,low, high);
    }
    public int sum(TreeNode root,int low,int high){
        int sum=0;
        if(root!=null){
            if(root.val>=low && root.val<=high){
                sum+=root.val;
            }
            if(root.val>low){
                sum+=sum(root.left,low,high);
            }
            if(root.val<high){
                sum+=sum(root.right,low,high);
            }
        }
        return sum;
    }


    public static void main(String...args){
    }
}
//            we have a tree
//              10
//             /  \
//            5   15
//           / \    \
//          3   7   18
// low 7 , high 15
// if root.val>low && root.val<high{
// total+=root.val
// if(root.left.val<low{
// goIn(root.left.right,low, high)
// if(root.right.val
