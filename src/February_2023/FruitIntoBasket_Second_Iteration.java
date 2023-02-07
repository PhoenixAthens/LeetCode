package February_2023;

public class FruitIntoBasket_Second_Iteration {
    //works for 39/91 test cases
    public int totalFruit(int[] fruits) {
        if(fruits.length==1)return 1;
        int type1=fruits[0];
        int totalInFirstBasket=1;
        int type2=fruits[1];
        int totalInSecondBasket=1;
        int total=totalInSecondBasket+totalInFirstBasket;
        for(int i=2;i<fruits.length;i++){
            if(fruits[i]==type2) totalInSecondBasket++;
            else if(fruits[i]!=type1){
                type1=fruits[i];
                totalInFirstBasket=1;
                total=Math.max(total,totalInSecondBasket+totalInFirstBasket);
            }else{
                totalInFirstBasket++;
            }
            if(i!=fruits.length-1){
                if(fruits[i+1]==type1) totalInFirstBasket++;
                else if(fruits[i+1]!=type2){
                    type2=fruits[i+1];
                    totalInSecondBasket=1;
                    total=Math.max(total,totalInSecondBasket+totalInFirstBasket);
                }else{
                    totalInSecondBasket++;
                }
                i++;
            }
            total=Math.max(total,totalInSecondBasket+totalInFirstBasket);
        }
        return total;

    }
    public static void main(String...args){
        var val1=new FruitIntoBasket_Second_Iteration().totalFruit(new int[]{1,2,1});
        var val2=new FruitIntoBasket_Second_Iteration().totalFruit(new int[]{0,1,2,2});
        var val3=new FruitIntoBasket_Second_Iteration().totalFruit(new int[]{1,2,3,2,2});
        var val4=new FruitIntoBasket_Second_Iteration().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        var val5=new FruitIntoBasket_Second_Iteration().totalFruit(new int[]{0,0,1,1});
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
    }
}
