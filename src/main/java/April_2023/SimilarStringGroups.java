package April_2023;

import java.util.*;

public class SimilarStringGroups {
    //Fails at 60/73
    public int numSimilarGroups(String[] strs) {
        ArrayList<ArrayList<String>> collection=new ArrayList<>();
        collection.add(new ArrayList<>(Arrays.asList(strs[0])));
        for(int i=1;i<strs.length;i++){
            int len=strs[i].length();
            char[] tempStrArr=strs[i].toCharArray();
            boolean flag=true;
            blockStat:
            for(ArrayList<String> arrTemp:collection){
                for(String str:arrTemp){
                    if(str.length()==len){
                        char[] fromCollection=str.toCharArray();
                        boolean comp=StringCompare(fromCollection,tempStrArr,len);
                        if(comp){
                            arrTemp.add(strs[i]);
                            flag=false;
                            break blockStat;
                        }
                    }
                }
            }
            if(flag){
                collection.add(new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        return collection.size();
    }
    public boolean StringCompare(char[] a,char[]b,int len){
        int diffCount = 0;
        int firstDiffIndex = -1;
        for (int i = 0; i < len; i++) {
            if (a[i] != b[i]) {
                diffCount++;
                if (diffCount == 1) {
                    firstDiffIndex = i;
                } else if (diffCount == 2) {
                    if (a[firstDiffIndex] != b[i] || a[i] != b[firstDiffIndex]) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String...args){
        //var value1=new SimilarStringGroups().numSimilarGroups(new String[]{"tars","rats","arts","star"});
        //var value2=new SimilarStringGroups().numSimilarGroups(new String[]{"omv","ovm"});
        int value3=new SimilarStringGroups().numSimilarGroups(new String[]{"kccomwcgcs","socgcmcwkc","sgckwcmcoc","coswcmcgkc","cowkccmsgc","cosgmccwkc","sgmkwcccoc","coswmccgkc","kowcccmsgc","kgcomwcccs"});
        int value4=new SimilarStringGroups().numSimilarGroups(new String[]{"abc","acb","bac"});
        System.out.println(value3);
    }
    /* Bing's solution: 114ms beats 44.66%, Memory: 43MB beats 5.73%
    * class Solution {
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (StringCompare(strs[i].toCharArray(), strs[j].toCharArray(), strs[i].length())) {
                    union(parent, i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == i) {
                count++;
            }
        }
        return count;
    }
    public boolean StringCompare(char[] a,char[]b,int len){
        int diffCount = 0;
        int firstDiffIndex = -1;
        for (int i = 0; i < len; i++) {
            if (a[i] != b[i]) {
                diffCount++;
                if (diffCount == 1) {
                    firstDiffIndex = i;
                } else if (diffCount == 2) {
                    if (a[firstDiffIndex] != b[i] || a[i] != b[firstDiffIndex]) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    private void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if (rootX != rootY) {
            parent[rootX] = rootY;
        }
    }
}
    *
    *
    * */
}
