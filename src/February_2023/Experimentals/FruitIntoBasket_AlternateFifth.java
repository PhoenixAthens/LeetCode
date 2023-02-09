package February_2023.Experimentals;

public class FruitIntoBasket_AlternateFifth {
    public int totalFruit(int[] fruits){
        return 0;
    }
    public static void main(String...args){
        var val1=new FruitIntoBasket_AlternateFifth().totalFruit(new int[]{1,2,1});
        //SubArrays= [1,2,1]
        var val2=new FruitIntoBasket_AlternateFifth().totalFruit(new int[]{0,1,2,2});
        //SubArrays= [0,1] , [1,2,2]
        var val3=new FruitIntoBasket_AlternateFifth().totalFruit(new int[]{1,2,3,2,2});
        //SubArrays= [1,2], [2,3,2,2]
        var val4=new FruitIntoBasket_AlternateFifth().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        //SubArrays= [3,3,3,1], [1,2,1,1,2], [3,3,4]
        var val5=new FruitIntoBasket_AlternateFifth().totalFruit(new int[]{0,0,1,1});
        //SubArrays = [0,0,1,1]
        var val6=new FruitIntoBasket_AlternateFifth().totalFruit(new int[]{1,0,1,4,1,4,1,2,3});//expected 5, output=4
        //SubArrays = [1,0,1], [1,4,1,4,1],
        var val7=new FruitIntoBasket_AlternateFifth().totalFruit(new int[]{0,1,6,6,4,4,6});//expected 5, got 4
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
        /*ArrayDeque<Integer> nm=new ArrayDeque<>();
        nm.push(1);
        nm.push(2);
        System.out.println(nm.getFirst());
        System.out.println(nm.removeLast());*/
    }
}
