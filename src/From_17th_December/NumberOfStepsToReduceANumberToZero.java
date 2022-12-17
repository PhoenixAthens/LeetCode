package From_17th_December;

public class NumberOfStepsToReduceANumberToZero {
    //Runtime: 0ms beats 100%, Memory: 39.2MB beats 88.48%
    public int numberOfSteps(int num) {
        if(num==0)return num;
        int count=0;
        if(num%2==0){
            num/=2;

        }else{
            num-=1;
        }
        count++;
        while(num!=0){
           if(num%2==0)num/=2;
           else num-=1;
           count++;
        }
        return count;
    }
}
