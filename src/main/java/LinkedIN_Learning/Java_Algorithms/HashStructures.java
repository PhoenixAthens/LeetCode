package LinkedIN_Learning.Java_Algorithms;

import java.util.*;

public class HashStructures {
    public static List<Integer> findMissingMembers(int[] first, int[] second){
        List<Integer> missing = new ArrayList<>();
        HashSet<Integer> hSet = new HashSet<>();

        //This is to prevent the situation when the longer array is added to hashSet,
        //which results in shorter being used to check, where if shorter has elements of longer
        //but not all elements of longer, we get the wrong result
        int[] toAdd = first.length>second.length?second:first;
        int[] toCheck = first.length<second.length?second:first;
        for(int i: toAdd)hSet.add(i);
        for(int i: toCheck)if(!hSet.contains(i))missing.add(i);
        return missing;
    }
    public static void main(String...args){
        //Hashtable<Integer, Integer> table = new Hashtable<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        System.out.println(l1.equals(Arrays.asList(1,2,3)));

    }
}
