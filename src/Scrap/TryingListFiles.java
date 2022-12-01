package Scrap;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;

import static java.util.Collections.enumeration;
import static java.util.Collections.list;

public class TryingListFiles {
    public static void main(String...args){
        ArrayList<String> ss=list(enumeration(new ArrayList<>(Arrays.asList("A","B","C"))));
        //ArrayList<String> ss=list(enumeration());
        System.out.println(ss);
    }

}
