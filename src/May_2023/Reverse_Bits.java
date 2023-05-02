package May_2023;

public class Reverse_Bits {
    //Runtime:1ms beats 93.99%, Memory: 42.3MB beats 32.90%
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
    public int reverseBits_Sol2(int n){
        if(n==0)return 0;
        int[] arr=new int[32];
        boolean flag;
        flag= n < 0;
        if(flag)arr[0]=1;
        n=Math.abs(n);
        int i=31;
        while(n!=0){
            arr[i]=n%2;
            n/=2;
            i--;
        }
        int total;
        if(arr[31]==1)total=(int)Math.pow(-2,31);
        else total=(int)Math.pow(2,31);
        for(i=30;i>=0;i--){
            total+=arr[i]*Math.pow(2,i);
        }
        if(flag)return ~total+1;
        return total;
    }
    public static void main(String...args){
        System.out.println(new Reverse_Bits().reverseBits(-3));
        System.out.println(new Reverse_Bits().reverseBits_Sol2(-3));
    }
}
