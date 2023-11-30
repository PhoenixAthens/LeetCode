package Sorting;
import java.util.*;
public class BubbleSort {
    private static final Scanner scan=new Scanner(System.in);
    public static int[] arrayGenerator(){
        System.out.print("Enter Array's length: ");
        if(scan.hasNextInt()){
            int length=scan.nextInt();
            int[] array=new int[length];
            //System.out.println("Enter the elements: ");
            for(int i=0;i<length;i++){
                array[i]=randomNumberGenerator();//scan.nextInt();
            }
            return array;
        }else{
            return null;
        }
    }
    public static int[] bubbleSort(int[] array){
        if(array==null) return null;
        else{
            int length=array.length;
            for(int i=0;i<array.length;i++){
                int k=0;
                int counter=0;
                for(int j=k+1;j<length;j++){
                    if(array[k]>array[j]){
                        int temp=array[k];
                        array[k]=array[j];
                        array[j]=temp;
                        counter++;
                    }
                    k++;
                }
                length--;
                if(counter==0){
                    break;
                }

            }
            return array;
        }

    }
    public static void printArray(int[] array){
        if(array==null) System.out.println("What the heck dude??");
        else System.out.println(Arrays.toString(array));
    }
    public static void main(String...args){
        long time=System.currentTimeMillis();
        printArray(bubbleSort(arrayGenerator()));
        time=System.currentTimeMillis()-time;
        System.out.println("Time elapsed: "+time);
    }
    public static int randomNumberGenerator(){
        return (int)(Math.random()*1000);
    }
}
