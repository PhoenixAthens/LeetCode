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
    public long ConvertToDecimal(long binary){
        long num=0;
        long power=0;
        while(binary!=0){
            num+=(binary%10)*Math.pow(2,power++);
            binary/=10;
            System.out.println(num);
        }
        return num;
    }
    public static void main(String...args){
        System.out.println(new DecimalToBinary().ConvertToBinary(8));
        System.out.println(new DecimalToBinary().ConvertToBinary(9036));
        System.out.println(new DecimalToBinary().ConvertToBinary(17195));
        System.out.println(new DecimalToBinary().ConvertToDecimal(10001101001100L));
        System.out.println(new DecimalToBinary().ConvertToDecimal(110_0000_0110_0111L));
        //System.out.println(0234);
        //0010 0011 0100 1100
        //0010 0011 0100 1100
    }

}
