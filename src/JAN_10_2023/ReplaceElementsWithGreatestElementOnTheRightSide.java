package JAN_10_2023;

public class ReplaceElementsWithGreatestElementOnTheRightSide {
    //First Iteration
    //Runtime: 2ms beats 89.38%, Memory: 45.5MB beats 65.97%
    //Second Iteration
    //Runtime: 2ms beats 89.38%, Memory: 45.4MB beats 71.34%

    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int maxToRight=0;
            int index=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>maxToRight){
                    maxToRight=arr[j];
                    index=j;
                }
            }
            int temp=i;
            while(temp<index){
                arr[temp]=maxToRight;
                temp++;
            }
            if(temp!=i)i=temp-1;
            if(maxToRight==0)arr[i]=-1;
        }
        return arr;
    }
    public static void main(String...args){
        int[] result=new ReplaceElementsWithGreatestElementOnTheRightSide().replaceElements(new int[]{17,18,5,4,6,1});
        System.out.println(java.util.Arrays.toString(result));
        int[] result2=new ReplaceElementsWithGreatestElementOnTheRightSide().replaceElements(new int[]{400});
        System.out.println(java.util.Arrays.toString(result2));
    }
}
