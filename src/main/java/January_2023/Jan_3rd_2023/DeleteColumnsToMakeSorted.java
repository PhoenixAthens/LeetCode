package January_2023.Jan_3rd_2023;

import java.util.Arrays;
import java.util.ArrayList;
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        //Runtime:368ms beats 5.17%, Memory: 44.2MB
        if(strs.length==1)return 0;
        else{
            int end=strs[0].length();
            int count=0;
            ArrayList<Integer> indexes=new ArrayList<>();
            int[] codeRay=new int[end];
            for(int i=0;i<strs.length;i++){
                if(!indexes.contains(i)){
                    for(int j=0;j<end;j++){
                        if(!indexes.contains(j)){
                            int val=strs[i].substring(j,j+1).hashCode();
                            if(val>=codeRay[j])codeRay[j]=val;
                            else{
                                count++;
                                indexes.add(j);
                            }
                        }
                    }
                }
            }
            System.out.println(indexes);
            return count;
        }


    }
    public static void main(String...args){
        System.out.println(new DeleteColumnsToMakeSorted().minDeletionSize(new String[]{"rrjk","furt","guzm"}));
        //  r r j k
        //  f u r t
        //  g u z m
        String a="Hello";
        int end=a.length();
        int[] codeRay=new int[a.length()];
        for(int i=0;i<end;i++){
            codeRay[i]=a.substring(i,i+1).hashCode();
        }
        System.out.println(Arrays.toString(codeRay));

    }
}
