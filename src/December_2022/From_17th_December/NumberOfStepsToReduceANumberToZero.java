package December_2022.From_17th_December;

public class NumberOfStepsToReduceANumberToZero {
    //Runtime: 0ms beats 100%, Memory: 39.2MB beats 88.48%

    //After changes made on 1st of January:

    //Runtime:0mx beats 100%, Memory: 38.9MB beats 95.36%

    //The new addition of steps from line 26-29 improves memory consumption!!

    // code at line 14 is unnecessary as well, However it's better to have it in place;
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
           if(num%2==0){
               num/=2;
               if(num%2!=0){
                   num-=1;
                   count++;
               }
           }
           else num-- ;
           count++;
        }
        return count;
    }
}
