package April_2023;
import April_2023.Longest_ZigZag_Path_In_A_BinaryTree_MyCode.TreeNode;
//Date: 20th April 2023
public class Longest_ZigZag_Path_NotMine {
    //Runtime: 13ms beats 14.46%, Memory: 54.2MB beats 42.77%
    public int longestZigZag(TreeNode root) {
        int[] max ={0};
        dfs(root,true,0,max);
        dfs(root,false,0,max);
        return max[0];
    }
    public void dfs(TreeNode node,boolean goLeft,int count, int[] max){
        if(node == null)return;
        max[0] = Math.max(count,max[0]);
        if(goLeft){
            dfs(node.left,false,count+1,max);
            dfs(node.right,true,1,max);
        }else{
            dfs(node.right,true,count+1,max);
            dfs(node.left,false,1,max);
        }
    }

}
