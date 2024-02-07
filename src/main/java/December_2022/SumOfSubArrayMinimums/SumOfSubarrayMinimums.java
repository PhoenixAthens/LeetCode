package December_2022.SumOfSubArrayMinimums;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class SumOfSubarrayMinimums {
    public static void main(String... args) {
        //System.out.println(new SumOfSubarrayMinimums().sumSubarrayMins(new int[]{36,74,84,92,17,68,97,6,68,85}));
        System.out.println(new SumOfSubarrayMinimums().sumSubarrayMins_2(new int[]{3, 1, 2, 4}));
        String name = "AK47";
        //System.out.println((new int[]{1,2,3}).length);
        //System.out.println(new SumOfSubarrayMinimums().subArrMin_3(new int[]{3,1,2,4}));
    }

    //worked 77/87 test cases
    //then the TIME LIMIT EXCEEDED
    public int sumSubarrayMins(int[] arr) {
        int bummer = 1000_000_007;
        int sum = 0;
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            int min = 0;
            int start = 0;
            for (int j = 0; j < arr.length; j++) {
                int present = arr[j];
                count++;
                if (count == 1) {
                    min = present;
                } else if (present < min) {
                    min = present;
                }
                if (count == i) {
                    sum += min;
                    sum %= bummer;
                    count = 0;
                    j = start;
                    start++;
                }

            }
        }
        return sum;

    }

    //Fails at 68/87 test case
    public int sumSubarrayMins_2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                stack.push(arr[j]);
                int min = Integer.MAX_VALUE;
                while (!stack.isEmpty()) {
                    min = Math.min(min, stack.pop());
                }
                sum += min;
                for (int k = i; k <= j; k++) {
                    stack.push(arr[k]);
                }
            }
            stack = new Stack<>();
        }
        return sum;
    }

    public int subArrMin_3(int[] arr) {
        int length = arr.length;
        int[] left = new int[length];
        int[] right = new int[length];

        Arrays.fill(left, -1);
        Arrays.fill(right, length);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < length; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        int mod = (int) 1e9 + 7;
        long answer = 0;

        for (int i = 0; i < length; ++i) {
            answer += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }

        return (int) answer;
    }

    public int sumMinSub_4(int[] arr) {
        Stack<Integer> minimums = new Stack<>();
        int totalSum = 0;
        int bummer = 1_000_000_007;
        int mid = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minimums.isEmpty() || arr[i] > arr[minimums.peek()]) {
                minimums.push(i);
            } else if (arr[minimums.peek()] >= arr[i]) {
                while (arr[i] < arr[minimums.peek()]) {
                    mid = minimums.pop();
                    try {
                        left = minimums.peek();
                    } catch (Exception ex) {
                        left = -1;
                    }
                    right = i;
                    totalSum += (arr[mid] * (right - mid) * (mid - (left)));
                    totalSum %= bummer;
                    if (minimums.isEmpty()) {
                        break;
                    }
                }
                minimums.push(i);
            }
        }
        right = arr.length;
        while (!minimums.isEmpty()) {
            mid = minimums.pop();
            try {
                left = minimums.peek();
            } catch (Exception ex) {
                left = -1;
            }
            totalSum += (arr[mid] * (right - mid) * (mid - (left)));
            totalSum %= bummer;
        }
        return totalSum % bummer;
    }

    //Runtime: 65ms
    public int subMin_5(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            left[i] = -1;
            right[i] = arr.length;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        stack = new Stack<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        long sum = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < arr.length; i++) {
            sum += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            sum %= mod;
        }
        return (int) sum;
    }

    //try to understand this
    public int sumSubarrayMins_6(int[] arr) {
        int mod = (int) 1e9 + 7;
        int n = arr.length + 1;
        int[] left = new int[n];
        int[] ext = new int[n];
        int[] sums = new int[n];
        System.arraycopy(arr, 0, ext, 1, n - 1);

        int res = 0;
        for (int i = 1; i < n; i++) {
            int cur = ext[i]; //3
            int l = i - 1; //0
            while (ext[l] >= cur) l = left[l]; //l=0

            left[i] = l;//[0,0
            sums[i] = sums[l] + cur * (i - l);
            res = (res + sums[i]) % mod;
        }
        return res;
    }

    //and this
    public int sumSubarrayMins_7(int[] arr) {
        final int kMod = 1_000_000_007;

        final int n = arr.length;

        long ans = 0;

        // prevMin[i] := index k s.t. arr[k] is the previous minimum in arr[:i]

        int[] prevMin = new int[n];

        // nextMin[i] := index k s.t. arr[k] is the next minimum in arr[i + 1:]

        int[] nextMin = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.fill(prevMin, -1);

        Arrays.fill(nextMin, n);

        for (int i = 0; i < arr.length; ++i) {

            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {

                final int index = stack.pop();

                nextMin[index] = i;

            }

            if (!stack.isEmpty())

                prevMin[i] = stack.peek();

            stack.push(i);

        }

        for (int i = 0; i < arr.length; ++i) {

            ans += (long) arr[i] * (i - prevMin[i]) * (nextMin[i] - i);

            ans %= kMod;

        }

        return (int) ans;

    }

    //Experimental
    /*
    public static int sumSubarrayMins(int[] arr) {
            int bummer=1000_000_007;
            AtomicInteger sum2= new AtomicInteger();
            Arrays.stream(arr).forEach(x-> sum2.addAndGet(x));
            int sum=sum2.get();
            for(int i=2;i<=arr.length;i++){
                int count=0;
                int min=arr[0];
                int start=-1;
                for(int j=0;j<arr.length;j+=2){
                    int p=arr[j];
                    int p_next=0;
                    int tempMin=0;
                    if(j<arr.length-1){
                        p_next=arr[j+1];
                        tempMin= Math.min(p,p_next);
                    }else{
                        tempMin=p;
                    }

                    count+=2;
                    if(tempMin<min){
                        min=tempMin;
                    }
                    if(count==i){
                        System.out.println(min);
                        sum+=min;
                        sum%=bummer;
                        System.out.println(sum);
                        count=0;
                        j=start;
                        start++;
                        min=arr[start];
                    }
                }
            }
            return sum;
    }

    * */
    /* try to understand this
    static int mod =(int) 1e9 +7;
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length + 1;
        int[] left = new int[n];
        int[] ext = new int[n];
        int[] sums = new int[n];
        for(int i = 0; i < n -1; ++i)
           ext[i+1] = arr[i];

        int res = 0;
        for (int i = 1; i < n; i++) {
            int cur = ext[i];
            int l = i - 1;
            while (ext[l] >= cur)
                l = left[l];

            left[i] = l;
            sums[i] = sums[l] + cur * (i - l);
            res = (res + sums[i]) % mod;
        }
        return res;
    }
    *
    *
    *
    * */
}
