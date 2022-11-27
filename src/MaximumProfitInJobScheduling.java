import java.util.Stack;

public class MaximumProfitInJobScheduling {
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Stack<Integer> endTimeTemp=new Stack<>();
        int totalProfit=0;
        for(int i=0;i<startTime.length;i++) {
            int presentStartTime = startTime[i];
            int presentEndTime = endTime[i];
            int presentProfit = profit[i];
            int prevEndTime = 0;
            for (int j = 0; j < startTime.length; j++) {
                if ( endTime[j] <= presentEndTime && profit[j] > presentProfit) {
                    presentProfit = profit[j];
                    presentStartTime = startTime[j];
                    presentEndTime = endTime[j];
                    /*startTime[j] = 100;
                    endTime[j] = 100;
                    profit[j] = 0;*/
                }
            }
            System.out.println("StartTime: "+presentStartTime+", endTime: "+presentEndTime+", profit: "+presentProfit);
            if (endTimeTemp.isEmpty()) {
                endTimeTemp.push(presentEndTime);
                totalProfit += presentProfit;
            } else if (endTimeTemp.peek() <= presentStartTime) {
                endTimeTemp.push(presentEndTime);
                totalProfit += presentProfit;
            }
            System.out.println(endTimeTemp);
        }


            /*if(i!=startTime.length-1){
                if(endTime[i]==endTime[i+1]){
                    if(profit[i]>profit[i+1]){
                        totalProfit+=profit[i];
                        endTimeTemp=endTime[i];
                    }else{
                        totalProfit+=profit[i+1];
                        endTimeTemp=endTime[i+1];
                    }
                    i++;
                }else if(endTime[i]>startTime[i+1]){
                    System.out.println("Start: "+startTime[i]+",End time: "+endTime[i]);
                    int count1=0,count2=0,profit1=0,profit2=0;
                    profit1+=profit[i];
                    profit2+=profit[i+1];
                    //try it without profit as well, where you just calc more job count
                    for(int j=i;j<startTime.length;j++){
                        if(startTime[j]>=endTime[i]){
                            count1++;
                            profit1+=profit[j];
                        }
                        if(startTime[j]>=endTime[i+1]){
                            count2++;
                            profit2+=profit[j];
                        }
                    }
                    System.out.println("count1: "+count1+",count2: "+count2+",profit1: "+profit1+", profit2: "+profit2);
                    if(count1>count2 && profit1>profit2){
                        System.out.println("H1");
                        totalProfit+=profit[i];
                        endTimeTemp=endTime[i];

                    }else if(count2>count1 && profit2>profit1){
                        System.out.println("H2");
                        totalProfit+=profit[i+1];
                        endTimeTemp=endTime[i+1];
                    }else if(count2>count1 && profit1>profit2){
                        System.out.println("H3");
                        totalProfit+=profit[i];
                        endTimeTemp=endTime[i];
                    }else if(count2<count1 && profit1<profit2){
                        System.out.println("H4");
                        totalProfit+=profit[i+1];
                        endTimeTemp=endTime[i+1];
                    }else if(count1==count2){
                        if(profit1>profit2){
                            totalProfit+=profit[i];
                            endTimeTemp=endTime[i];
                        }else{
                            totalProfit+=profit[i+1];
                            endTimeTemp=endTime[i+1];
                        }
                    }
                    i++;
                }else{
                    totalProfit+=profit[i];
                }
            }else if(startTime[i]>=endTimeTemp){
                totalProfit+=profit[i];
            }

        }*/
        return totalProfit;
    }

    public static void main(String...args){
        System.out.println(jobScheduling(new int[]{1,2,3,4,6},new int[]{3,5,10,6,9},new int[]{20,20,100,70,60}));//3+
    }
    /*
    * working cases:
    * start time:[1,2,2,3], endTime =[2,5,3,4], profit=[3,4,1,2] answer=7
    * */
    // stuck at start time:[4,2,4,8,2], endTime =[5,5,5,10,8], profit=[1,2,8,10,4] ,answer: 18 , got:14
    // 4 to 5, p=1
    // 2 to 5, p=2
    // 4 to 5, p=8
    // 8 to 10,p=10
    // 2 to 8, p=4
    // we create a method that compares two jobs, to find the first best job, then the second best job and so on.
    // to find the best job, the criteria should be to compare jobs that fit in the same window of time, do the one that gives the max profit.
}
//OLD SOLUTIOn
/*
int totalProfit=0;
        int endTimeTemp=0;
        for(int i=0;i<startTime.length;i++){
            if(i!=startTime.length-1){
                if(endTime[i]==endTime[i+1]){
                    if(profit[i]>profit[i+1]){
                        totalProfit+=profit[i];
                        endTimeTemp=endTime[i];
                    }else{
                        totalProfit+=profit[i+1];
                        endTimeTemp=endTime[i+1];
                    }
                    i++;
                }else if(endTime[i]>startTime[i+1]){
                    System.out.println("Start: "+startTime[i]+",End time: "+endTime[i]);
                    int count1=0,count2=0,profit1=0,profit2=0;
                    profit1+=profit[i];
                    profit2+=profit[i+1];
                    //try it without profit as well, where you just calc more job count
                    for(int j=i;j<startTime.length;j++){
                        if(startTime[j]>=endTime[i]){
                            count1++;
                            profit1+=profit[j];
                        }
                        if(startTime[j]>=endTime[i+1]){
                            count2++;
                            profit2+=profit[j];
                        }
                    }
                    System.out.println("count1: "+count1+",count2: "+count2+",profit1: "+profit1+", profit2: "+profit2);
                    if(count1>count2 && profit1>profit2){
                        System.out.println("H1");
                        totalProfit+=profit[i];
                        endTimeTemp=endTime[i];

                    }else if(count2>count1 && profit2>profit1){
                        System.out.println("H2");
                        totalProfit+=profit[i+1];
                        endTimeTemp=endTime[i+1];
                    }else if(count2>count1 && profit1>profit2){
                        System.out.println("H3");
                        totalProfit+=profit[i];
                        endTimeTemp=endTime[i];
                    }else if(count2<count1 && profit1<profit2){
                        System.out.println("H4");
                        totalProfit+=profit[i+1];
                        endTimeTemp=endTime[i+1];
                    }else if(count1==count2){
                        if(profit1>profit2){
                            totalProfit+=profit[i];
                            endTimeTemp=endTime[i];
                        }else{
                            totalProfit+=profit[i+1];
                            endTimeTemp=endTime[i+1];
                        }
                    }
                    i++;
                }else{
                    totalProfit+=profit[i];
                }
            }else if(startTime[i]>=endTimeTemp){
                totalProfit+=profit[i];
            }

        }
        return totalProfit;
    }
* */