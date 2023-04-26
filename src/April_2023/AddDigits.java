package April_2023;
//Date: April 26th 2023
public class AddDigits {
    //Runtime: 1ms beats 100%, Memory: 39.6MB beats 85.75%
    public int addDigits(int num) {
        while(num>9){
            int sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}
