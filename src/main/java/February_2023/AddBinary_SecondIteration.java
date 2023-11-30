package February_2023;
//16th Feb, 2023
public class AddBinary_SecondIteration {
    //Runtime: 3ms beats 39.9%, Memory:42.7MB beats 18.33%
    public String addBinary(String a, String b) {
        int len1=a.length();
        int len2=b.length();
        int goTill=len2;
        if(len1>len2){
            goTill=len1;
            b="0".repeat(len1-len2)+b;
        }else{
            a="0".repeat(len2-len1)+a;
        }
        int carry='0';
        String result="";
        int i=goTill-1;
        for(;i>=0;i--){
            int val1=a.charAt(i);
            int val2=b.charAt(i);
            int l1=val1^val2;
            if((l1^carry) == 49)result="1"+result;
            else result="0"+result;
            carry=(l1 & carry)|(val1 & val2);
        }
        if(carry!=48) return "1"+result;
        return result;
    }
    public static void main(String...args){
        /*System.out.println('0'^'1');
        System.out.println('1'^'1');
        System.out.println('1'^'1');
        System.out.println('1'&'1');*/
        //System.out.println(('0' & '1')|('1' & '1'));
        //System.out.println('0'&'1');
        System.out.println(new AddBinary_SecondIteration().addBinary("11","1"));
        System.out.println(new AddBinary_SecondIteration().addBinary("1010","1011"));
        System.out.println(new AddBinary_SecondIteration().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
