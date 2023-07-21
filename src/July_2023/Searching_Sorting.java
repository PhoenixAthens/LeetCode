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
    //45ms solution on LeetCode
    public static void mergeSort(int[] arr){
        if(arr.length<=1)return;
        int mid = Math.floorDiv(arr.length,2);
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr,mid,right,0,right.length);
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);

    }
    public static void merge(int[] left, int[] right, int[] arr){
        int a = 0;
        int b = 0;
        int leftLen = left.length;
        int rightLen = right.length;
        int arrLen = arr.length;
        while(a+b<arrLen){
            //int temp = arr[a+b];
            if(b==rightLen || (a<leftLen && left[a]<right[b])){
                arr[a+b]=left[a];
                //left[a]=temp; //This is not needed, it's at an index that is no longer accessible
                a++;
            }else{
                arr[a+b]=right[b];
                //right[b]=temp; //This is not needed, it's at an index that is no longer accessible
                b++;
            }
        }

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

        System.out.println("==========================================================================");
        int[] testArray_8 ={45, 12, 67, 89, 34, 23, 90, 11, 56, 78, 3, 6, 9, 15, 18, 21, 24, 27, 30, 33};
        mergeSort(testArray_8);
        System.out.println(Arrays.toString(testArray_8));

        int[] testArray_9 = {199, -198, 197, -196, 195, -194, 193, -192, 191, -190, 189,
                -188, 187, -186, 185, -184, 183, -182, 181, -180, 179, -178, 177, -176,
                175, -174, 173, -172, 171, -170, 169, -168, 167, -166, 165, -164, 163, -162,
                161, -160, 159, -158, 157,-156 ,155 ,-154 ,153 ,-152 ,151 ,-150 , 149 ,-148
                ,147 ,-146 ,145 ,-144 ,143 ,-142 ,141 ,-140 , 139 ,-138 ,137 ,-136 ,135 ,-134
                ,133 ,-132 ,131 ,-130 , 129 ,-128 ,127 ,-126 ,125 ,-124 ,123 ,-122 ,121 ,-120 ,
                119 ,-118 ,117 ,-116 ,115 ,-114 ,113 ,-112 ,111 ,-110 , 109 ,-108 ,107 ,-106 ,105
                ,-104 ,103 ,-102 ,101 ,-100 , 99,-98 ,97,-96 ,95,-94 ,93,-92 ,91,-90 , 89,-88 ,87,-86
                ,85,-84 ,83,-82 ,81,-80 , 79,-78 ,77,-76 ,75,-74 ,73,-72 ,71,-70 , 69,-68 ,67,-66 ,65,
                -64 ,63,-62 ,61,-60 , 59,-58 ,57,-56 ,55,-54 ,53,-52 ,51,-50};
        mergeSort(testArray_9);
        System.out.println(Arrays.toString(testArray_9));
    }
}
