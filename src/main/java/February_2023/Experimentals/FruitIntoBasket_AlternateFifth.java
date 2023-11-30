package February_2023.Experimentals;
import java.util.HashSet;
public class FruitIntoBasket_AlternateFifth {
    //Works!!
    //Runtime: 24ms beats 72.19%, Memory: 52.8MB beats 5.26%
    public int totalFruit(int[] fruits){
        if(fruits.length==1)return 1;
        int start=0;
        int size=0;
        HashSet<Integer> make=new HashSet<>();
        int prev=0;
        while(start!=fruits.length-1){
            int j=start;
            for(;j<fruits.length;j++){
                make.add(fruits[j]);
                if(make.size()>2)break;
                else prev=fruits[j];

            }
            make=new HashSet<>();
            size=Math.max(j-start,size);
            if(j==fruits.length)break;
            else{
                j-=1;
                while(j>=0){
                    if(fruits[j]!=prev)break;
                    j--;
                }
                start=j+1;
            }
        }
        return size;
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
