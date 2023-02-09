package February_2023;

import java.util.ArrayList;

public class FruitIntoBasket_FifthIteration_WorkingSolution {
    //Runtime: 28ms beats 74.35%, Memory: 51.4MB beats 60.73%
    public int totalFruit(int[] fruits){
        int size=0;
        ArrayList<Integer> callout=new ArrayList<>();
        int types=0;
        for(int i=0;i<fruits.length;i++){
            if(!callout.contains(fruits[i])){
                types++;
            }
            if(types>2){
                types=2;
                ArrayList<Integer> helper=new ArrayList<>();
                int j=callout.size();
                size=Math.max(size,j);
                int lastType= callout.get(j-1);
                helper.add(lastType);
                j-=2;
                while(j>=0){
                    if(callout.get(j)==lastType)helper.add(callout.get(j));
                    else break;
                    j--;
                }
                callout=helper;
                callout.add(fruits[i]);
            }else callout.add(fruits[i]);
        }
        size=Math.max(size,callout.size());
        return size;
    }
    public static void main(String...args){
        var val1=new FruitIntoBasket_FifthIteration_WorkingSolution().totalFruit(new int[]{1,2,1});
        //SubArrays= [1,2,1]
        var val2=new FruitIntoBasket_FifthIteration_WorkingSolution().totalFruit(new int[]{0,1,2,2});
        //SubArrays= [0,1] , [1,2,2]
        var val3=new FruitIntoBasket_FifthIteration_WorkingSolution().totalFruit(new int[]{1,2,3,2,2});
        //SubArrays= [1,2], [2,3,2,2]
        var val4=new FruitIntoBasket_FifthIteration_WorkingSolution().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        //SubArrays= [3,3,3,1], [1,2,1,1,2], [3,3,4]
        var val5=new FruitIntoBasket_FifthIteration_WorkingSolution().totalFruit(new int[]{0,0,1,1});
        //SubArrays = [0,0,1,1]
        var val6=new FruitIntoBasket_FifthIteration_WorkingSolution().totalFruit(new int[]{1,0,1,4,1,4,1,2,3});//expected 5, output=4
        //SubArrays = [1,0,1], [1,4,1,4,1],
        var val7=new FruitIntoBasket_FifthIteration_WorkingSolution().totalFruit(new int[]{0,1,6,6,4,4,6});//expected 5, got 4
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);


    }
}
