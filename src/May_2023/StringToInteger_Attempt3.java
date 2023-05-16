package May_2023;
//Date: May 16th 2023
public class StringToInteger_Attempt3 {
    //Runtime: 2ms, Memory: 42.9MB
    public int myAtoi(String s) {
        s=s.trim();
        if(s.equals(""))return 0;
        char[] arr = s.toCharArray();
        int[] numVal=new int[arr.length];
        if(arr[0]==45){
            int[] val=internalMain(numVal,1,arr);
            if(val[1]==23)return Integer.MIN_VALUE;
            return -val[0];
        }else if(arr[0]==43){
            int[] val=internalMain(numVal,1,arr);
            if(val[1]==23)return Integer.MAX_VALUE;
            return val[0];
        }else{
            int[] val=internalMain(numVal,0,arr);
            if(val[1]==23)return Integer.MAX_VALUE;
            return val[0];
        }
    }
    public final int[] internalMain(int[] arr, int startingIndex, char[] givenString){
        int counter=0;
        for(int i=startingIndex;i<givenString.length;i++){
            if(givenString[i]<=57 && givenString[i]>=48){
                arr[counter++]=givenString[i]-48;
            }else{
                break;
            }
        }
        int num=0;
        int i=0;
        int weight=(int)Math.pow(10,counter-1);
        while(i<counter-1){
            num+=arr[i++];
            num*=10;
        }
        num+=arr[i];
        if(weight==0)return new int[]{0,0};
        int last=num/weight;
        if(num%10!=arr[counter-1]||last!=arr[0])return (new int[]{0,23});
        else return (new int[]{num,0});

    }
    public static void main(String...args){
        /*
        System.out.println((int)'+'); => 43
        System.out.println((int)'-'); => 45

        System.out.println((int)'0'); => 48
        System.out.println((int)'9'); => 57
        */
        System.out.println(new StringToInteger_Attempt3().myAtoi("  -42"));
    }
}
