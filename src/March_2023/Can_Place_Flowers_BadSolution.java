package March_2023;

public class Can_Place_Flowers_BadSolution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //works for 115/124 test cases
        //bad solution!!
        if(flowerbed[flowerbed.length-1]==1){
            int howMany=0;
            int lastPlotted= flowerbed.length-1;
            for(int i= flowerbed.length-2;i>0;i--){
                if(flowerbed[i]==1){
                    lastPlotted=i;
                }else if((lastPlotted-i)%2==0 && flowerbed[i-1]!=1)howMany++;
            }
            return howMany>=n;
        }else{
            int startIndex=0;
            for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i]==1){
                    startIndex=i;
                    break;
                }
            }
            int howMany=0;
            int lastPlotted=startIndex;
            for(int i=startIndex+1;i<flowerbed.length;i++){
                if(flowerbed[i]==1){
                    lastPlotted=i;
                }else if((i-lastPlotted)%2==0 && flowerbed[i+1]!=1)howMany++;
            }
            return howMany>=n;
        }
    }
}
