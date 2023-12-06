package April_2023;
//Date: 24th April 2023
public class LastStoneWeight {
    //Runtime: 1ms beats 98.75%, Memory: 40.7Mb beats 11.33%
    public int lastStoneWeight(int[] stones) {
        while(stones.length>1){
            int max1,max2,max1Index,max2Index;
            if(stones[0]>=stones[1]){
                max1 = stones[1];
                max2 = stones[0];
                max1Index=1;
                max2Index=0;
            }else{
                max1 = stones[0];
                max2 = stones[1];
                max1Index=0;
                max2Index=1;
            }
            for(int i=2;i<stones.length;i++)
                if(stones[i]>max2){
                    max1=max2;
                    max1Index = max2Index;
                    max2=stones[i];
                    max2Index = i;
                }else if(stones[i]>max1){
                    max1=stones[i];
                    max1Index = i;
                }
            int[] temp;
            stones[max1Index]=-27;
            if(max2==max1){
                temp = new int[stones.length - 2];
                stones[max2Index]=-27;
                int cnt=0;
                for(int i:stones){
                    if(i!=-27)temp[cnt++]=i;
                }
            }else{
                temp = new int[stones.length - 1];
                stones[max2Index]=max2-max1;
                int cnt=0;
                for(int i:stones){
                    if(i!=-27)temp[cnt++]=i;
                }
            }
            stones = temp;
        }
        if(stones.length==1)return stones[0];
        return 0;
    }
    public static void main(String...args){
        int result1= new LastStoneWeight().lastStoneWeight(new int[]{2,7,4,1,8,1});
        System.out.println(result1);
        int result2 = new LastStoneWeight().lastStoneWeight(new int[]{1});
        System.out.println(result2);
    }
}
