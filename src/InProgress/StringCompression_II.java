package InProgress;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringCompression_II {
    public int getLengthOfOptimalCompression(String s, int k) {
        if(s.length()==1 && k==1){
            return 0;
        }else if(s.length()==1 && k==0){
            return 1;
        }
        char[] arrayOfCharacters=s.toCharArray();
        char prevChar=arrayOfCharacters[0];
        ArrayList<String> arr=new ArrayList<>();
        int counter=1;
        for(int i=1;i<arrayOfCharacters.length;i++){
            if(prevChar==arrayOfCharacters[i]){
                counter++;
            }else{
                arr.add(String.valueOf(prevChar));
                //if(counter>1)
                    arr.add(String.valueOf(counter));
                counter=1;
                prevChar=arrayOfCharacters[i];
            }
            if(i==arrayOfCharacters.length-1){
                arr.add(String.valueOf(prevChar));
                //(counter>1)
                    arr.add(String.valueOf(counter));
            }
        }
        System.out.println(arr);
        if(k==0)
            return combinator(arr);
        int[] order=new int[arr.size()];
        for(int i=0;i<k;i++){
            int indexOfToBeRemovedNumber=0;
            int indexOfToBeRemovedChar=0;
            int min=100;
            for(String str:arr){
                try{
                    int occ=Integer.parseInt(str);
                    if(occ<min) {
                        min = occ;
                        indexOfToBeRemovedNumber = arr.indexOf(str);
                        indexOfToBeRemovedChar = indexOfToBeRemovedNumber - 1;
                    }
                }catch(Exception ex){
                }
            }
            System.out.println(indexOfToBeRemovedChar);
            System.out.println(indexOfToBeRemovedNumber);
            arr.remove(indexOfToBeRemovedChar);
            arr.remove(indexOfToBeRemovedChar);
        }
        return combinator(arr);
    }
    public static ArrayList<String> returnArrayOfDigits(int val){
        ArrayList<String> arr=new ArrayList<>();
        while(val!=0){
            arr.add(String.valueOf(val%10));
            val=val/10;
        }
        return arr;
    }
    public static int combinator(ArrayList<String> egg){
        CopyOnWriteArrayList<String> unn=new CopyOnWriteArrayList<>(egg);
        for(String str:unn){
            try{
                int val=Integer.parseInt(str);
                if(val>10){
                    int insertionPoint=unn.indexOf(str);
                    unn.remove(str);
                    unn.addAll(insertionPoint,returnArrayOfDigits(val));
                }
            }catch(Exception ex){

            }
        }
        ArrayList<String> dump=new ArrayList<>(unn);
        return dump.size();
    }
    public static void main(String...args){
        System.out.println(new StringCompression_II().getLengthOfOptimalCompression("aaaaaaaaaaa",2));
        /**
         * [a, 3, b, 1, c, 3, d, 1]
         * [a, 3, 1, 3, d, 1]
         */
    }
}
