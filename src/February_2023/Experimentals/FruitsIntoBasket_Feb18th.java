package February_2023.Experimentals;
import java.util.HashMap;
//Date: 18th Feb 2023
public class FruitsIntoBasket_Feb18th {
    //Runtime: 46ms beats 65.87%, Memory: 51.6MB beats 40.96%
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,right;
        for(right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size()>2){
                int val=map.get(fruits[left]);
                if(val==1)map.remove(fruits[left]);
                else map.put(fruits[left],--val);
                left++;
            }
        }
        return right-left;
    }
    public static void main(String...args){
        /*ArrayDeque<Integer> numbers=new ArrayDeque<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        System.out.println(numbers);
        numbers.removeFirst();
        System.out.println(numbers);
        numbers.removeLast();
        System.out.println(numbers);*/
        var val1=new FruitsIntoBasket_Feb18th().totalFruit(new int[]{1,2,1});
        //SubArrays= [1,2,1]
        var val2=new FruitsIntoBasket_Feb18th().totalFruit(new int[]{0,1,2,2});
        //SubArrays= [0,1] , [1,2,2]
        var val3=new FruitsIntoBasket_Feb18th().totalFruit(new int[]{1,2,3,2,2});
        //SubArrays= [1,2], [2,3,2,2]*/
        var val4=new FruitsIntoBasket_Feb18th().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        //SubArrays= [3,3,3,1], [1,2,1,1,2], [3,3,4]
        var val5=new FruitsIntoBasket_Feb18th().totalFruit(new int[]{0,0,1,1});
        //SubArrays = [0,0,1,1]
        var val6=new FruitsIntoBasket_Feb18th().totalFruit(new int[]{1,0,1,4,1,4,1,2,3});//expected 5, output=4
        //SubArrays = [1,0,1], [1,4,1,4,1],
        var val7=new FruitsIntoBasket_Feb18th().totalFruit(new int[]{0,1,6,6,4,4,6});//expected 5, got 4
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
    }
}
