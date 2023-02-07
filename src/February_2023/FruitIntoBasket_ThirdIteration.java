package February_2023;

public class FruitIntoBasket_ThirdIteration {
    //works for 62/91 test cases
    public int totalFruit(int[] fruits) {
        if(fruits.length==1)return 1;
        int type1=-1;
        int type2=-1;
        int totalInFirstBasket=0;
        int totalInSecondBasket=0;
        int total=0;
        boolean basket1=true;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i]==type1){
                totalInFirstBasket++;
            }else if(fruits[i]==type2){
                totalInSecondBasket++;
            }else{
                if(totalInFirstBasket < totalInSecondBasket){
                    type1=fruits[i];
                    totalInFirstBasket=1;
                    basket1=false;
                }else if(totalInFirstBasket > totalInSecondBasket){
                    type2=fruits[i];
                    totalInSecondBasket=1;
                    basket1=true;
                }else{
                    if(basket1){
                        type1=fruits[i];
                        totalInFirstBasket=1;
                        basket1=false;
                    }else{
                        type2=fruits[i];
                        totalInSecondBasket=1;
                        basket1=true;
                    }
                }

            }
            total=Math.max(total,totalInSecondBasket+totalInFirstBasket);
        }
        return total;
    }
    public static void main(String...args){
        var val1=new FruitIntoBasket_ThirdIteration().totalFruit(new int[]{1,2,1});
        var val2=new FruitIntoBasket_ThirdIteration().totalFruit(new int[]{0,1,2,2});
        var val3=new FruitIntoBasket_ThirdIteration().totalFruit(new int[]{1,2,3,2,2});
        var val4=new FruitIntoBasket_ThirdIteration().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        var val5=new FruitIntoBasket_ThirdIteration().totalFruit(new int[]{0,0,1,1});
        var val6=new FruitIntoBasket_ThirdIteration().totalFruit(new int[]{1,0,1,4,1,4,1,2,3}); //expected 5, output=4;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
    }
}
