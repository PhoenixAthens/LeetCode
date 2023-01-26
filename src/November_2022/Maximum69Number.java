package November_2022;

import java.util.*;
public class Maximum69Number {
    //Runtime: 2ms beats 40.70%, Memory: 38.9MB beats 96.8%
    public int maximum69Number (int num) {
        ArrayList<Integer> choices=new ArrayList<>(List.of(num));
        char[] temp=String.valueOf(num).toCharArray();
        for(int i=0;i< temp.length;i++){
            if(temp[i]=='6'){
                char[] joiner=Arrays.copyOf(temp,temp.length);
                joiner[i]='9';
                choices.add(Integer.parseInt(new String(joiner)));
            }
        }
        int max=0;
        for(int i:choices){
            if(i>max)max=i;
        }
        return max;
    }
    public int recurSum(int number){
        if(number/10==0){
            return number;
        }else{
            return number%10 + recurSum(number/10);
        }
    }

    public static void main(String...args){
      System.out.println(new Maximum69Number().maximum69Number(666));
    }
}
