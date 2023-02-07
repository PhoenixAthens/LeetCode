package February_2023;
import java.util.HashMap;
public class FruitIntoBasket_First_Iteration {
    //works for 28/91 test cases
    public int totalFruit(int[] fruits) {
        if(fruits.length==1)return 1;
        HashMap<Integer,Integer> mapper=new HashMap<>();
        for(int i:fruits){
            Integer val=mapper.get(i);
            if(val!=null)mapper.put(i,++val);
            else mapper.put(i,1);
        }
        int k=mapper.get(fruits[0]);
        int j=mapper.get(fruits[1]);
        for(int i:mapper.keySet()){
            if(mapper.get(i)>k){
                j=k;
                k=mapper.get(i);
            }
        }
        return k+j;
    }
    public static void main(String...args){
        var value=new FruitIntoBasket_First_Iteration().totalFruit(new int[]{1,2,1});
        var value2=new FruitIntoBasket_First_Iteration().totalFruit(new int[]{0,1,2,2});
        var value3=new FruitIntoBasket_First_Iteration().totalFruit(new int[]{1,2,3,2,2});
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
    }

}
