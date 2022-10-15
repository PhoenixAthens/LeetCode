package Sorting;
import java.util.*;
public class BinaryInsertionSort {
    private static final Scanner scan=new Scanner(System.in);
    public static List<int[]> ListOfSortedUnsortedArrays(){
        List<int[]> UnsortedThenSorted=new ArrayList<>();
        System.out.print("Enter Array's length: ");
        if(scan.hasNextInt()){
            int[] array=new int[scan.nextInt()];
            System.out.println("Enter the elements for unsorted array: ");
            for(int i=0;i<array.length;i++){
                array[i]=scan.nextInt();
            }
            UnsortedThenSorted.add(array);
            UnsortedThenSorted.add(SortedArrayGenerator(array.length));
            return UnsortedThenSorted;
        }else{
            return null;
        }
    }
    public static int[] SortedArrayGenerator(int len){
        int[] array=new int[len];
        System.out.println("Enter the elements for Sorted array: ");
        for(int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        return array;

    }


}
