package February_2023;

public class FruitIntoBasket_FourthIteration {
    //Date: 9th Feb, 2023
    //works for 70/91 test cases
    public int totalFruit(int[] fruits) {
        if(fruits.length==1)return 1;
        int max=0;
        int size=1;
        int prev1=fruits[0];
        int prev2=0;
        int i=1;
        for(;i<fruits.length;i++){
            if(fruits[i]==prev1){
                size++;
            }else{
                prev2=fruits[i];
                break;
            }
        }
        for(;i<fruits.length;i++){
            if(fruits[i]==prev1 || fruits[i]==prev2){
                size++;
            }else{
                prev1=fruits[i-1];
                prev2=fruits[i];
                max=Math.max(max,size);
                size=2;
            }
        }
        max=Math.max(size,max);
        return max;
    }
    public static void main(String...args){
        var val1=new FruitIntoBasket_FourthIteration().totalFruit(new int[]{1,2,1});
        //SubArrays= [1,2,1]
        var val2=new FruitIntoBasket_FourthIteration().totalFruit(new int[]{0,1,2,2});
        //SubArrays= [0,1] , [1,2,2]
        var val3=new FruitIntoBasket_FourthIteration().totalFruit(new int[]{1,2,3,2,2});
        //SubArrays= [1,2], [2,3,2,2]
        var val4=new FruitIntoBasket_FourthIteration().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        //SubArrays= [3,3,3,1], [1,2,1,1,2], [3,3,4]
        var val5=new FruitIntoBasket_FourthIteration().totalFruit(new int[]{0,0,1,1});
        //SubArrays = [0,0,1,1]
        var val6=new FruitIntoBasket_FourthIteration().totalFruit(new int[]{1,0,1,4,1,4,1,2,3});//expected 5, output=4
        //SubArrays = [1,0,1], [1,4,1,4,1],
        var val7=new FruitIntoBasket_FourthIteration().totalFruit(new int[]{0,1,6,6,4,4,6});//expected 5, got 4
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);


    }

}
