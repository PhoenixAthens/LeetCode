package May_2023;
//Date: 1st May 2023
public class Average_Salary_Excluding_The_Minimum_And_Maximum_Salary {
    //Runtime: 0ms beats 100%, Memory: 40.4MB beats 52.51%
    public double average(int[] salary) {
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        double sum=0;
        for(int i:salary){
            maximum=Math.max(maximum,i);
            minimum=Math.min(minimum,i);
            sum+=i;
        }
        sum-=(maximum+minimum);
        sum/=(salary.length-2);
        return sum;
    }
    public static void main(String...args){
        System.out.println(new Average_Salary_Excluding_The_Minimum_And_Maximum_Salary().average(new int[]{4000,3000,1000,2000}));
    }
}
