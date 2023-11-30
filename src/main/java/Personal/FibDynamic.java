package Personal;

public class FibDynamic {
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String...args){
        for(int i=0;i<100;i+=5){
            long time=System.currentTimeMillis();
            System.out.println("Fibonacci at "+i+": "+fibonacci(i)+":"+"Time taken: "+(System.currentTimeMillis()-time));
        }

    }
}
