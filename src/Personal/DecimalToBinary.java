package Personal;

public class DecimalToBinary {
    public long ConvertToBinary(long decimal){
        long num=0;
        long grade=1;
        while(decimal!=0){
            num+=(decimal%2)*grade;
            decimal/=2;
            grade*=10;
        }
        return num;
    }
    public long ConvertToDecimal(){
        return 0;
    }
    public static void main(String...args){
        System.out.println(new DecimalToBinary().ConvertToBinary(8));
        System.out.println(new DecimalToBinary().ConvertToBinary(9036));
        //0010 0011 0100 1100
        //0010 0011 0100 1100
    }

}
