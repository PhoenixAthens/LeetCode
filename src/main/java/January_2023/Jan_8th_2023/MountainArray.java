package January_2023.Jan_8th_2023;

public class MountainArray {
    //Runtime: 1ms beats 100%, Memory: 43.6MB beats 64.83%
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;
        boolean increase=true;
        boolean descent=false;
        int prev=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>prev && increase){
                prev=arr[i];
                descent=true;
            }else if(arr[i]<prev &&descent){
                increase=false;
                prev=arr[i];
            }else return false;
        }
        return !increase;
    }
}
