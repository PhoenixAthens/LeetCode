package May_2023;
//Date: May 2nd 2023
public class Sign_Of_The_Product_Of_An_Array {
    //Runtime: 0ms beats 100%, Memory: 42.1MB beats 76.18%
    public int arraySign(int[] nums) {
        int negs=0;

        for(int i:nums){
            if(i<0)negs++;
            if(i==0)return 0;
        }
        return (negs%2==0)?1:-1;
    }
}
