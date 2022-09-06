import java.util.*;
public class DuplicateRemover {
    private static <Object> Object[] duplicateRemover(Object[] array){
        Set<Object> setOF=new HashSet<>();
        for(Object e:array){
            setOF.add(e);
        }
        return (Object[]) setOF.toArray();

    }
    public static void main(String...args){
        //Because we use a set the order is disturbed!
        Integer[] arrayOfNumbers=new Integer[]{1,2,3,4,43,4,3,2,1,9,10,5,2,89,43,9,2,4,8,7};
        Object[] array=duplicateRemover(arrayOfNumbers);
        System.out.println(Arrays.toString(array));

    }
}
