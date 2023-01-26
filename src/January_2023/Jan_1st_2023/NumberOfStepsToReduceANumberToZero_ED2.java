package January_2023.Jan_1st_2023;
//ED stands for Edition
public class NumberOfStepsToReduceANumberToZero_ED2 {
    //using bitwise operators:
    //runtime: 0ms, Memory: 38.9MB
    public int numberOfSteps(int num) {
        if(num==0)return 0;
        int steps=0;
        while(num>0){
            if((num&1)==1)num--;
            else num>>=1;
            steps++;
        }

        return steps;

    }
    public static void main(String...args){
        System.out.println(Integer.toBinaryString(35));

    }
}
