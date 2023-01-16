package JAN_16_2023;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int writePointer=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]==newInterval[0]){
                int j=i;
                for(;j<intervals.length;j++){
                    if(intervals[j][0]==newInterval[1]){
                       intervals[writePointer++]=new int[]{newInterval[0],intervals[j][1]};
                    }
                }
                i=j;
            }else if(newInterval[0]>intervals[i][0] && newInterval[0]<intervals[i][1]){
                int j=i;
                for(;j<intervals.length;j++){
                    if(intervals[j][0]==newInterval[1]){
                        intervals[writePointer++]=new int[]{intervals[i][0],intervals[j][1]};
                    }
                }
                i=j;
            }else if(newInterval[0]==intervals[i][1]){

            }else{
                intervals[writePointer++]=intervals[i];
            }
        }
        return intervals;
    }
}
