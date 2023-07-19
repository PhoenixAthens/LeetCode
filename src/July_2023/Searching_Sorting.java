package July_2023;

import java.util.Arrays;

public class Searching_Sorting {
    // LINEAR SEARCH
    public int linearSearch_UnsortedList(int[] arr, int reqVal){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==reqVal)return i;
        return -1;
    }
    public int linearSearch_SortedList(int[] arr, int reqVal){
        for(int i=0;i<arr.length && arr[i]<=reqVal;i++)
            if(arr[i]==reqVal)return i;
        return -1;
    }

    // BINARY SEARCH (sorted array)
    public int BinarySearch(int[] arr, int reqVal){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=Math.floorDiv(start+end,2);
            if(arr[mid]==reqVal)return mid;
            else if(arr[mid]>reqVal){
                start=0;
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i;
            int currentElement=arr[i];
            while(j>0){
                if(currentElement >=arr[j-1])break;
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=currentElement;
        }
    }
    //Bubble Sort
    public static void BubbleSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            boolean swap = false;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swap)break;
        }
    }

    //Selection Sort
    public static void SelectionSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            int max=0;
            for(int j=1;j<=i;j++){
                if(arr[max]<arr[j])max=j;
            }
           int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
    // QuickSort
    public static void quickSort(int[] arr){
        qSort(arr,0,arr.length-1);
    }
    public static void qSort(int[] arr, int left, int right){
        if(left >= right)return;
        int partition = partitioner(arr,left,right);
        qSort(arr,left,partition-1);
        qSort(arr, partition+1,right);
    }
    public static int partitioner(int[] arr, int left, int right){
        int pivot = arr[left]; //using first element as pivot
        int i = left+1;
        int j = right;
        while(true){
            while(i<=j && pivot>=arr[i])i++;
            while(i<=j && pivot<=arr[j])j--;
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else{
                break;
            }
        }
        arr[left] = arr[j];
        arr[j]=pivot;
        return j;
    }
    public static void main(String...args){
        int[] testArray_1 = new int[]{3, 5, 7, 9, 12, 15, 18, 21, 23, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55};
        System.out.println(new Searching_Sorting().BinarySearch(testArray_1,49)); //17
        System.out.println(new Searching_Sorting().BinarySearch(testArray_1,15)); //5
        System.out.println(new Searching_Sorting().BinarySearch(testArray_1,39)); //-1
        int[] testArray_2 = new int[]{-17, -1, 12, 13, 27, 45, 57, 82};
        System.out.println(new Searching_Sorting().BinarySearch(testArray_2,13)); //3
        int[] testArray_3 = new int[]{45, 12, 67, 89, 34, 23, 90, 11, 56, 78, 3, 6, 9, 15, 18, 21, 24, 27, 30, 33};
        insertionSort(testArray_3);
        System.out.println(Arrays.toString(testArray_3));
        // [3, 6, 9, 11, 12, 15, 18, 21, 23, 24, 27, 30, 33, 34, 45, 56, 67, 78, 89, 90]
        int[] testArray_4 = {12,3,22,44,15,13,7,45,77,33};
        insertionSort(testArray_4);
        System.out.println(Arrays.toString(testArray_4));

        int[] testArray_5 = {12,3,22,44,15,13,7,45,77,33};
        BubbleSort(testArray_5);
        System.out.println(Arrays.toString(testArray_5));

        int[] testArray_6 = new int[]{45, 12, 67, 89, 34, 23, 90, 11, 56, 78, 3, 6, 9, 15, 18, 21, 24, 27, 30, 33};
        SelectionSort(testArray_6);
        System.out.println(Arrays.toString(testArray_6));

        int[] testArray_7 = new int[]{45, 12, 67, 89, 34, 23, 90, 11, 56, 78, 3, 6, 9, 15, 18, 21, 24, 27, 30, 33};
        quickSort(testArray_7);
        System.out.println(Arrays.toString(testArray_7));
    }
}
