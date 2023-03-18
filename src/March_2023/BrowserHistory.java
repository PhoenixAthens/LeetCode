package March_2023;
//Date: March 18th 2023
public class BrowserHistory {
    //Runtime: 62ms beats 36.48%, Memory: 50.7MB beats 22.81%
    //Second Iteration
    //Runtime: 60ms beats 46.56%, Memory: 50.7MB beats 22.81%
    //Third Iteration
    //Runtime: 59ms beats 54.85%, Memory: 50.4MB beats 53.18%


    public class TreeNode {
        String url;
        TreeNode left_prev;
        private TreeNode right_next;

        private TreeNode(String url) {
            this.url = url;
        }

        private TreeNode(String url, TreeNode next, TreeNode previous) {
            this.url = url;
            this.right_next = next;
            this.left_prev = previous;
        }
    }

    private TreeNode obj;

    public BrowserHistory(String homepage) {
        obj = new TreeNode(homepage, null, null);
    }

    public void visit(String url) {
        obj.right_next = new TreeNode(url, null, obj);
        obj = obj.right_next;

    }

    public String back(int steps) {
        int i = steps;
        while (i != 0) {
            if (obj.left_prev == null) return obj.url;
            else {
                obj = obj.left_prev;
            }
            i--;
        }
        return obj.url;
    }

    public String forward(int steps) {
        int i = steps;
        while (i != 0) {
            if (obj.right_next == null) return obj.url;
            else {
                obj = obj.right_next;
            }
            i--;
        }
        return obj.url;
    }
    public static void main(String...args){
        BrowserHistory obj=new BrowserHistory("leetcode.com");
        obj.visit("google.com");
        obj.visit("facebook.com");
        obj.visit("youtube.com");
        System.out.println(obj.back(1));
        System.out.println(obj.back(1));
        System.out.println(obj.forward(1));
        obj.visit("linkedIn.com");
        System.out.println(obj.forward(2));
        System.out.println(obj.back(2));
        System.out.println(obj.back(7));
    }
}
