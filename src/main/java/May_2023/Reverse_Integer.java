package May_2023;

public class Reverse_Integer {
    //reverse_Sol1
    //Runtime: 1ms beats 100%, Memory: 40.1MB beats 47.31%
    //reverse_Sol2
    //Runtime: 1ms beats 100%, Memory: 39.9MB beats 58.96%
    public int reverse(int x) {
        if(x==0)return x;
        if(x==2147483647 || x==-2147483648)return 0;
        boolean negative=x<0;
        x=Math.abs(x);
        while(x%10==0){
            x/=10;
        }
        int num=0;
        int len=String.valueOf(x).length();
        while(len!=1){
            num+=x%10;
            num*=10;
            x/=10;
            len--;
        }
        num+=x;
        if(num%10!=x)return 0;
        if(negative)return -num;
        else return num;
    }
    public int reverse_Sol1(int x) {
            if(x==0)return x;
            //if((x>1_464_000_000||x<-1_464_000_000) && x%10>2)return 0;
            if(x==2147483647 || x==-2147483648)return 0;
            boolean negative=x<0;
            x=Math.abs(x);
            while(x%10==0){
                x/=10;
            }
            int num=0;
            int temp=0;
            while(x!=0){
                num+=x%10;
                if(x/10!=0)num*=10;
                else temp=x;
                x/=10;
            }
            if(num%10!=temp)return 0;
            if(negative)return -num;
            else return num;
    }

    public static void main(String...args){
        System.out.println(new Reverse_Integer().reverse(123));
        System.out.println(new Reverse_Integer().reverse(-123));
        System.out.println(new Reverse_Integer().reverse(120));
        System.out.println(new Reverse_Integer().reverse(1_534_236_469));
        System.out.println(new Reverse_Integer().reverse(-2_147_483_412));
        System.out.println(new Reverse_Integer().reverse(-2_147_483_648));//len=10


        //Playground:

        /*
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        2147483647
        -2147483648
        int val =-2_143_847_412;
        System.out.println(val);*//*
        1_534_236_469
        964_632_435

        2_147_483_647
        -2_147_483_412

        -2_147_483_648
        -2_143_847_412

        1_563_847_412
        2_147_483_651
        */

    }
}
