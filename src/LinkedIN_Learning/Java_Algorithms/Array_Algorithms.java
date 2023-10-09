package LinkedIN_Learning.Java_Algorithms;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Array_Algorithms {
    //basic way to find an element in an array
    //Linear search
    public static int linearSearch(int[] arr, int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element)return i;
        }
        return -1;
    }

    //Linear Search with Java streams
    /**
     * Explanation:
     * We can simplify linear search by converting our array into a stream and filter out data
     * based on a condition to find the data we are searching for.
     *
     * We filter out elements based on whether the current element matches the element we are looking for,
     * Then we can see if atleast one item matches the condition using `findFirst()`. Now `findFirst()`, returns
     * an OptionalInt, which is a container object to help prevent `NullPointerException`, in our case, if the array
     * contains the element, the optionalInt will contain the item, else the optional will be empty.
     * If we perform linear search on an array that's populated with `null` values, we might end up with a
     * null pointer exception. The use of .findFirst() prevents that because you have to first `unbox`, the value before
     * using it.
     *
     * This unboxing happens with .ifPresent() and .orElse, if the optional value is present meaning the item does exist
     * in the array, it was found, we'll print it out (as shown in the main method), Now, with ifPresent(), if the optional
     * value is not present, we get nothing, .orElse always gives you something whether value is found or not.
     *
     * */
    public static OptionalInt linearSearch_2(int[] arr, int element){
        return Arrays.stream(arr).filter(x->x==element).findAny(); //the instructor used `.findFirst()`
    }

    //Binary Search: O(log n), Linear Search: O(n)
    public static boolean binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(arr[mid]==item)return true;
            else if(arr[mid]<item){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return false;
    }
    public static int factoryBinary(int[] arr, int item){
        return Arrays.binarySearch(arr,item);
    }

    //Aggregating arrays
    public static int[] createEvenArray(int[] arr1, int[] arr2){
        ArrayList<Integer> collection = new ArrayList<>();
        for(int i:arr1)if(i%2==0)collection.add(i);
        for(int i:arr2)if(i%2==0)collection.add(i);
        return collection.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] createEvenArray_2(int[] arr1, int[] arr2){
        return Stream.of(arr1,arr2)
                .flatMapToInt(Arrays::stream)
                .filter(x->x%2==0)
                .toArray();
    }

    //Reverse an array
    public static void reverseInPlace(int[] arr){
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-i-1]=temp;
        }
    }
    public static void rotateToLeft(int[] arr){
        int firstElem = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElem;
    }
    public static void rotateToRight(int[] arr){
        int lastElem = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastElem;
    }
    public static void main(String...args){
        int[] arr = {1,2,3,4,5,6,7};
        var result = linearSearch_2(arr,1);
        result.ifPresent(System.out::println);
        System.out.println(result.orElse(-1)); //This can replace ifPresent() entirely!
        System.out.println(linearSearch_2(arr,9).orElse(-1)); //since 9 is not present in arr
        System.out.println(binarySearch(arr,4));
        System.out.println(binarySearch(arr,8));
        System.out.println("=".repeat(50));
        System.out.println(factoryBinary(arr, 1));
        System.out.println(factoryBinary(arr,0));
        System.out.println("=".repeat(50));
        int[] sampleArr1 = {-9,3,2,-8,12,-16};
        int[] sampleArr2 = {0,-3,-8,-35,40,20,7};
        System.out.println(Arrays.toString(createEvenArray(sampleArr1,sampleArr2)));//[2, -8, 12, -16, 0, -8, 40, 20]
        System.out.println(Arrays.toString(createEvenArray_2(sampleArr1,sampleArr2)));//[2, -8, 12, -16, 0, -8, 40, 20]
        System.out.println("=".repeat(50));
        reverseInPlace(sampleArr1);
        System.out.println(Arrays.toString(sampleArr1));
        reverseInPlace(sampleArr1);
        System.out.println("Double reverse: "+Arrays.toString(sampleArr1));
        System.out.println("=".repeat(50));
        rotateToLeft(sampleArr1);
        System.out.println("Arr1 Rotated to left: "+Arrays.toString(sampleArr1));
        rotateToRight(sampleArr2);
        System.out.println("Arr2 Rotated to right: "+Arrays.toString(sampleArr2));
        rotateToRight(sampleArr1);
        System.out.println("Arr1 Rotated to right: "+Arrays.toString(sampleArr1));
        rotateToLeft(sampleArr2);
        System.out.println("Arr2 Rotated to left: "+Arrays.toString(sampleArr2));
    }
}
