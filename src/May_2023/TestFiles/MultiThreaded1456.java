package May_2023.TestFiles;

public class MultiThreaded1456 {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int count = 0;
        int numThreads = Runtime.getRuntime().availableProcessors();
        MaxVowelsThread[] threads = new MaxVowelsThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * arr.length / numThreads;
            int end = (i + 1) * arr.length / numThreads;
            threads[i] = new MaxVowelsThread(arr, start, end, k);
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                count = Math.max(count, threads[i].getMaxCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    private static class MaxVowelsThread extends Thread {
        private final char[] arr;
        private final int start;
        private final int end;
        private final int k;
        private int maxCount;

        public MaxVowelsThread(char[] arr, int start, int end, int k) {
            this.arr = arr;
            this.start = start;
            this.end = end;
            this.k = k;
            this.maxCount = 0;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                if (i + k <= arr.length) {
                    int countTemp = 0;
                    for (int j = i; j < i + k; j++) {
                        if (arr[j] == 97 || arr[j] == 101 || arr[j] == 105 || arr[j] == 111 || arr[j] == 117)
                            countTemp++;
                    }
                    maxCount = Math.max(countTemp, maxCount);
                } else break;
            }
        }

        public int getMaxCount() {
            return maxCount;
        }
    }
}
