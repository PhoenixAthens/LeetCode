package Scrap;
import java.util.*;
public class testing {
    public static void main(String...args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%3==0 && num%5==0 && num==15){
            System.out.println("It's me!!");
        }
        Set<Integer> set1=new HashSet<>(Set.of(1,3,4,5,6,7));
        Set<Integer> set2=new HashSet<>(Set.of(7,6,5,4,3,1));
        System.out.println(set1.equals(set2));
        Set<String> set3=new TreeSet<>(Set.of("a","b","c","d"));
        Set<String> set4=new TreeSet<>(Set.of("d","c","b","a"));
        System.out.println(set3.equals(set4));
    }
}
