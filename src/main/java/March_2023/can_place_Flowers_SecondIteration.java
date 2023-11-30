package March_2023;
//Date: 20th March 2023
public class can_place_Flowers_SecondIteration {
    //Runtime: 1ms beats 100%, Memory: 43.9MB beats 31.73%
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
            if(flowerbed.length==1){
                if(n==0)return flowerbed[0]>=n;
                else return flowerbed[0]<n;
            }
            int howMany=0;
            int start=1;
            if(flowerbed[0]==0 && flowerbed[1]==0){
                howMany++;
                start=2;
            }
            for(;start<flowerbed.length;start++){
                if(start==flowerbed.length-1){
                    if(flowerbed[start-1]==0 && flowerbed[start]==0)howMany++;
                }
                else{
                    if(flowerbed[start]==0){
                        if(flowerbed[start-1]==0 && flowerbed[start+1]==0){
                            howMany++;
                            start++;
                        }
                    }
                }

            }
            return howMany>=n;
        }

}
