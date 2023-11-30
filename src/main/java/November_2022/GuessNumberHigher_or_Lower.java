package November_2022;

import java.util.*;
public class GuessNumberHigher_or_Lower {
    //works for 21/25 test-cases, need to use BinarySearch to solve this question
    public int guessNumber(int n){
        if(guess(n)==-1 || guess(n)==1){
            for(int i=n;i>=0;i--){
                if(guess(i)==0)return i;
            }
        }else if(guess(n)==1){
            for(int i=0;i<n;i++){
                if(guess(i)==0)return i;
            }
        }
        return n;
    }
    public int guess(int num){
        int nome=new Scanner(System.in).nextInt();
        if(num>nome)return -1;
        else if(num<nome)return 1;
        else return 0;
    }
}
