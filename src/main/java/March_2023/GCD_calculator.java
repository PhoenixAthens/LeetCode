package March_2023;

public class GCD_calculator {
    public int GCD_calculator(int num1, int num2){
        num1=Math.abs(num1);
        num2=Math.abs(num2);
        if(num1==num2)return num1;
        if(num1>num2){
            return GCD_intern(num1,num2);
        }else{
            return GCD_intern(num2,num1);
        }
    }
    public int GCD_intern(int num1,int num2){
        if(num2==0)return num1;
        int res=num1%num2;
        return GCD_intern(num2,res);
    }
    public static void main(String...args){
        System.out.println(new GCD_calculator().GCD_calculator(12,18));
        System.out.println(new GCD_calculator().GCD_calculator(13,17));
        System.out.println(new GCD_calculator().GCD_calculator(14,-21));
        System.out.println(new GCD_calculator().GCD_calculator(-16,-24));
        System.out.println(new GCD_calculator().GCD_calculator(0,20));
    }
}
