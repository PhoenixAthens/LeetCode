package October_2022.Still_Working_On_IT;

import java.util.*;
public class EarliestPossibleDayOfFullBloom {
    public static int earliestFullBloom(int[] plantTime, int[] growTime) {
        //we will need:
        //int present Day=0                //this is in days
        //int GrowthTime                   //this is in days
        //int Day of bloom=growthTime+1    //this is in days
        //0AAB
        // 00AB
        //.  000AAB
        //.     00AB
        //.plantTime = [1,4,3], growTime = [2,3,1]
        //0000AAAB
        //    000AB
        //       0AB
        //SO the easiest solution is to plant the seed that takes the most Time To Grow First and
        // then the seed that takes the most amount of time to Plant, compare on the basis of which one's bigger;
        /*int PresentDay=0;
        int DayDone=0;
        List<Integer> listOfComp=new ArrayList<>();
        for(int i=0;i<plantTime.length;i++){
            listOfComp.add(growTime[i]);
            listOfComp.add(plantTime[i]);
        }
        ArrayList<Integer> DayDoneArray=new ArrayList<>();
        for(int i=0;i<listOfComp.size();i+=2){
            PresentDay+=listOfComp.get(i+1);
            DayDone=PresentDay+listOfComp.get(i);
            DayDoneArray.add(DayDone);
        }
        DayDoneArray.sort(null);
        return DayDoneArray.get(DayDoneArray.size()-1);*/
        //Sort the list on the basis of plantTime
        int[] plantTimeSub=new int[plantTime.length];
        System.arraycopy(plantTime,0,plantTimeSub,0,plantTimeSub.length);
        Arrays.parallelSort(plantTimeSub);
        ArrayList<Integer> help=new ArrayList<>();
        for(int i=0;i<plantTime.length;i++){
            help.add(plantTime[i]);
        }
        int[] mainWork=new int[plantTimeSub.length];
        int counter=0;
        for(int i=plantTimeSub.length-1;i>=0;i--){
            mainWork[counter]=help.indexOf(plantTimeSub[i]);
            counter++;
        }
        int PresentDay;
        if(plantTime.length==1){
            PresentDay=0;
        }else{
            PresentDay=-1;
        }
        int DayDone=0;
        ArrayList<Integer> DayDoneArray=new ArrayList<>();
        System.out.println(Arrays.toString(mainWork));
        for(int i:mainWork){
            PresentDay+=plantTime[i];
            System.out.println(PresentDay);
            DayDone=PresentDay+growTime[i];
            DayDoneArray.add(DayDone);
        }
        System.out.println(DayDoneArray);
        System.out.println("PresentDay: "+PresentDay);
        DayDoneArray.sort(null);
        return DayDoneArray.get(DayDoneArray.size()-1);




    }
    public static void main(String...args){
        System.out.println(earliestFullBloom(new int[]{1,4,3},new int[]{2,3,1}));//2^5,4^6,6^8,7^9
        //2+4=5th day bloon
    }
}
