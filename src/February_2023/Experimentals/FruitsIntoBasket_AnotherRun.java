package February_2023.Experimentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FruitsIntoBasket_AnotherRun {
    //Exceeds time limit!
    //Sliding Window
    public int totalFruit(int[] fruits) {
        //3,3,3,1,2,1,1,2,3,3,4
        int len=fruits.length;
        int j=0;
        int count=0;
        int finalResult=0;
        HashSet<Integer> setOfFruits=new HashSet<>();
        for(int i=0;i<len;i++){
            for(;j<len;j++){
                setOfFruits.add(fruits[j]);
                count++;
                if(setOfFruits.size()>2){
                    count--;
                    break;
                }
            }
            finalResult=Math.max(count,finalResult);
            count=0;
            setOfFruits=new HashSet<>();
            for(int k=i+1;k<j;k++){
                setOfFruits.add(fruits[k]);
                count++;
            }

        }
        return Math.max(finalResult,count);
    }

    }
    public static void main(String...args){
        var val1=new FruitsIntoBasket_AnotherRun().totalFruit(new int[]{1,2,1});
        //SubArrays= [1,2,1]
        var val2=new FruitsIntoBasket_AnotherRun().totalFruit(new int[]{0,1,2,2});
        //SubArrays= [0,1] , [1,2,2]
        var val3=new FruitsIntoBasket_AnotherRun().totalFruit(new int[]{1,2,3,2,2});
        //SubArrays= [1,2], [2,3,2,2]*/
        var val4=new FruitsIntoBasket_AnotherRun().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        //SubArrays= [3,3,3,1], [1,2,1,1,2], [3,3,4]
        var val5=new FruitsIntoBasket_AnotherRun().totalFruit(new int[]{0,0,1,1});
        //SubArrays = [0,0,1,1]
        var val6=new FruitsIntoBasket_AnotherRun().totalFruit(new int[]{1,0,1,4,1,4,1,2,3});//expected 5, output=4
        //SubArrays = [1,0,1], [1,4,1,4,1],
        var val7=new FruitsIntoBasket_AnotherRun().totalFruit(new int[]{0,1,6,6,4,4,6});//expected 5, got 4
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
    }
    
}
