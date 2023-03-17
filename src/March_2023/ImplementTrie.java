package March_2023;

import java.util.ArrayList;
//Date: 17th March 2023

public class ImplementTrie {
    //Runtime: 355ms beats 5%, Memory: 49.8MB beats 99.43%
    private ArrayList<String> mainSet;
    public ImplementTrie() {
        this.mainSet=new ArrayList<>();
    }

    public void insert(String word) {
        mainSet.add(word);
    }

    public boolean search(String word) {
        return mainSet.contains(word);
    }

    public boolean startsWith(String prefix) {
        for(String i:mainSet){
            if(i.startsWith(prefix))return true;
        }
        return false;
    }
}
