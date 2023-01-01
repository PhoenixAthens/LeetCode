package From_17th_December;

public class NumberOfStepsToReduceANumberToZero {
    //Runtime: 0ms beats 100%, Memory: 39.2MB beats 88.48%

    //After changes made on 1st of January:

    //Runtime:0mx beats 100%, Memory: 38.9MB beats 95.36%
    public int numberOfSteps(int num) {
        if(num==0)return num;
        int count=0;

        //Line 9-16 was unnecessary!
        /*if(num%2==0){
            num/=2;

        }else{
            num-=1;
        }
        count++;*/
        while(num!=0){
           if(num%2==0)num/=2;
           else num-=1;
           count++;
        }
        return count;
    }
}
