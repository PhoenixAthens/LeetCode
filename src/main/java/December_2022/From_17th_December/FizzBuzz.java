package December_2022.From_17th_December;
import java.util.*;
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        //First Iteration
        //Runtime: 3ms beats 56.48%, Memory: 48.5MB beats 28.51%
        //Second Iteration
        //Runtime: 1ms beats 100%, Memory: 43.2MB beats 94.9%
        List<String> make=new ArrayList<>();
        if(n<3){
            for(int i=1;i<=n;i++){
                make.add(String.valueOf(i));
            }
        }else{
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0)make.add("FizzBuzz");
                else if(i%5==0)make.add("Buzz");
                else if(i%3==0)make.add("Fizz");
                else make.add(String.valueOf(i));
            }
        }
        return make;
    }
}
