package February_2023.Experimentals;

import java.util.HashMap;
//Date: 19th Feb 2023
public class FruitsIntoBasket_FinalIteration {
    //Runtime: 46ms beats 65.86%, Memory: 51.4MB beats 60.2%
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mapOfValues=new HashMap<>();
        int totalFruits=0;
        int i=0;
        int j=0;
        for(;j<fruits.length;j++){
            mapOfValues.put(fruits[j], mapOfValues.getOrDefault(fruits[j],0)+1);
            if(mapOfValues.size()>2){
                totalFruits=Math.max(totalFruits,j-i);
                while(mapOfValues.size()>2){
                    int quantity=mapOfValues.get(fruits[i]);
                    if(quantity==1)mapOfValues.remove(fruits[i]);
                    else{
                        mapOfValues.put(fruits[i],--quantity);
                    }
                    i++;
                }
                totalFruits=Math.max(totalFruits,j-i);
            }
        }
        return Math.max(totalFruits,j-i);
    }
    public static void main(String...args){
        var val1=new FruitsIntoBasket_FinalIteration().totalFruit(new int[]{1,2,1});
        //SubArrays= [1,2,1]
        var val2=new FruitsIntoBasket_FinalIteration().totalFruit(new int[]{0,1,2,2});
        //SubArrays= [0,1] , [1,2,2]
        var val3=new FruitsIntoBasket_FinalIteration().totalFruit(new int[]{1,2,3,2,2});
        //SubArrays= [1,2], [2,3,2,2]*/
        var val4=new FruitsIntoBasket_FinalIteration().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        //SubArrays= [3,3,3,1], [1,2,1,1,2], [3,3,4]
        var val5=new FruitsIntoBasket_FinalIteration().totalFruit(new int[]{0,0,1,1});
        //SubArrays = [0,0,1,1]
        var val6=new FruitsIntoBasket_FinalIteration().totalFruit(new int[]{1,0,1,4,1,4,1,2,3});//expected 5, output=4
        //SubArrays = [1,0,1], [1,4,1,4,1],
        var val7=new FruitsIntoBasket_FinalIteration().totalFruit(new int[]{0,1,6,6,4,4,6});//expected 5, got 4
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
    }

}
