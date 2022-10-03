public class Min_Time_To_Make_Rope_Colorful {
    public int minCost(String colors, int[] neededTime) {
        int reqTime=0;
        for(int i=0;i<colors.length()-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                if(neededTime[i]<neededTime[i+1]){
                    reqTime+=neededTime[i];
                }
                else if(neededTime[i+1]<neededTime[i]){
                     reqTime+=neededTime[i+1];
                     int temp=neededTime[i];
                     neededTime[i]=neededTime[i+1];
                     neededTime[i+1]=temp;
                }
                else reqTime+=neededTime[i];
            }
        }
        return reqTime;
    }

}
