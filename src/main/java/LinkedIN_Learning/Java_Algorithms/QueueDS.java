package LinkedIN_Learning.Java_Algorithms;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDS {
    public static void printBinaryNumbers(int n) {
        if (n < 0) {
            System.out.println();
            return;
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        for (int i = 0; i < n; i++) {
            if (q.isEmpty()) break;
            int current = q.poll();
            System.out.print(current + " ");
            q.offer(current * 10);
            q.offer(current * 10 + 1);
        }
        System.out.println();
        //[10 11] i = 0  -p = //[1 ]
        //[11 100 101] i = 1     -p = //[1,10]
        //[100 101 110 111] i = 2   -p = //[1,10,11]
        //[101 110 111 1000 1001] i = 3  -p = //[1,10,11, 100]
        //[110 111 1000 1001 1010 1011] i = 4   -p = //[1,10,11, 100, 101]
        //[111 1000 1001 1010 1011 1100 1101] i = 5   -p = //[1,10,11, 100, 101, 110]
        //[1000 1001 1010 1011 1100 1101 1110
    }

    public static void printBinary2(int n) {
        if (n < 0) {
            System.out.println();
            return;
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        for (int i = 0; i < n / 2; i++) {
            if (q.isEmpty()) break;
            int current = q.poll();
            System.out.print(current + " ");
            q.offer(current * 10);
            q.offer(current * 10 + 1);
        }
        if (n % 2 == 0) {
            while (q.size() != 1) {
                System.out.print(q.poll() + " ");
            }
        } else {
            while (!q.isEmpty()) {
                System.out.print(q.poll() + " ");
            }
        }

        System.out.println();
    }

    public static void main(String... args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(2);
        integerQueue.add(23);
        integerQueue.add(90);
        integerQueue.add(45);
        integerQueue.offer(101);
        System.out.println(integerQueue); //[2, 23, 90, 45, 101]
        System.out.println(integerQueue.poll()); //2
        System.out.println(integerQueue);//[23, 90, 45, 101]
        System.out.println(integerQueue.remove());//23
        System.out.println(integerQueue);//[90, 45, 101]
        printBinaryNumbers(25); // 1 10 11 100 101 110 111 1000 1001 1010
    }
}