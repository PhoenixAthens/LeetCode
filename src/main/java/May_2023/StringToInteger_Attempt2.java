package May_2023;

public class StringToInteger_Attempt2 {
    //1006/1084, fails at " -1010023630o4" , output: -151030170, expected: -1010023630
    public int myAtoi(String s) {
        s=s.trim();
        if(s.equals(""))return 0;
        boolean positive=true;
        char[] arrayOfChars=s.toCharArray();
        int startFrom=0;
        if(arrayOfChars[0]=='-'){
            startFrom++;
            positive=false;
        }else if(arrayOfChars[0]=='+'){
            startFrom++;
        }
        int result=0;
        while(startFrom<arrayOfChars.length && arrayOfChars[startFrom]=='0')startFrom++;
        int lenOfNum=0;
        boolean flag=true;
        for(;startFrom<arrayOfChars.length-1;startFrom++){
            if(arrayOfChars[startFrom]<48||arrayOfChars[startFrom]>57){
                result/=10;
                startFrom--;
                flag=false;
                break;
            }
            result+=(arrayOfChars[startFrom]-48);
            result*=10;
            lenOfNum++;
        }
        if( startFrom < arrayOfChars.length && flag && arrayOfChars[startFrom]>=48 && arrayOfChars[startFrom]<=57){
            result+=(arrayOfChars[startFrom]-48);
            lenOfNum++;
        }else if(flag){
            startFrom--;
            result/=10;
        }
        if(result==0)return 0;
        final boolean b = lenOfNum > 10 || result % 10 != (arrayOfChars[startFrom] - 48);
        if(positive){
            if(b)return Integer.MAX_VALUE;
            return result;
        }else{
            if(b)return Integer.MIN_VALUE;
            return -result;
        }
    }
    public static void main(String...args){
        System.out.println(new StringToInteger_Attempt2().myAtoi("   -04f"));
        //"21_474_836_460"
    }
}
