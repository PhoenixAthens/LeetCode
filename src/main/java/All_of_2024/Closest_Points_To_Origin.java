package All_of_2024;
import java.util.*;

public class Closest_Points_To_Origin {
    public class Max_Heap{
        private LinkedList<int[]> mainArray;
        public Max_Heap(){
            mainArray=new LinkedList<>();
        }
        public boolean isEmpty(){
            return mainArray.isEmpty();
        }
        public int size(){
            return mainArray.size();
        }
        private int getParent(int index){
            return Math.floorDiv(index-1,2);
        }
        public void addElement(int[] value){
            mainArray.add(value);
            int index=size()-1;
            while(index>0){
                int parent=getParent(index);
                int[] parentCord = mainArray.get(parent);
                int[] childCord = mainArray.get(index);
                double parentDist = Math.sqrt(parentCord[0]*parentCord[0]+parentCord[1]*parentCord[1]);
                double childDist = Math.sqrt(childCord[0]*childCord[0]+childCord[1]*childCord[1]);

                if(parentDist< childDist){
                    mainArray.set(parent, childCord);
                    mainArray.set(index,parentCord);
                }else break;
                index=parent;
            }
        }
        private int maxChild(int index){
            if(index*2+2 >= size()) return index*2+1;
            int[] leftCord =mainArray.get(index*2+1);
            int[] rightCord = mainArray.get(index*2+2);
            double leftCordDist = Math.sqrt(leftCord[0]*leftCord[0]+leftCord[1]*leftCord[1]);
            double rightCordDist = Math.sqrt(rightCord[0]*rightCord[0]+rightCord[1]*rightCord[1]);
            if(leftCordDist>rightCordDist)return index*2+1;
            return index*2+2;

        }
        public int[] ExtractMax(){
            int[] max = mainArray.remove(0);
            if(size()!=0) {
                mainArray.add(0,mainArray.remove(size()-1));
                int index = 0;
                while (index * 2 < size() - 1) {
                    int child = maxChild(index);
                    int[] childCord = mainArray.get(child);
                    int[] indexCord = mainArray.get(index);
                    double childCordDist = Math.sqrt(childCord[0]*childCord[0]+childCord[1]*childCord[1]);
                    double indexCordDist = Math.sqrt(indexCord[0]*indexCord[0]+indexCord[1]*indexCord[1]);
                    if ( childCordDist > indexCordDist) {
                        mainArray.set(child, indexCord);
                        mainArray.set(index, childCord);
                    } else break;
                    index = child;
                }
            }
            return max;
        }
        public int[] getMax(){
            return mainArray.get(0);
        }
    }
    //Runtime: 75ms, Memory: 54.59MB
    public int[][] kClosest(int[][] points, int k) {
        TreeMap<Double, ArrayList<int[]>> distances = new TreeMap<>();
        for(int[] coordinates : points){
            double dist = Math.sqrt(coordinates[0]*coordinates[0] + coordinates[1]*coordinates[1]);
            ArrayList<int[]> nuts = distances.getOrDefault(dist,new ArrayList<>());
            nuts.add(coordinates);
            distances.put(dist, nuts);
        }
        int[][] result = new int[k][2];
        int j=0;
        for(double i: distances.keySet()){
            if(j >= k)break;
            for(int[] sets: distances.get(i)){
                result[j]=sets;
                j++;
            }
        }
        return result;
    }
    public int[][] kClosest_2(int[][] points, int k) {
        Max_Heap make = new Max_Heap();
        for(int[] cr: points){
            make.addElement(cr);
        }
        int[][] result = new int[k][2];
        Stack<int[]> maxims = new Stack<>();
        maxims.push(make.ExtractMax());
        int i = 0;
        while(i<k){
            result[i] = maxims.pop();
            i++;
        }
        return result;
    }
    //35ms, 55.96MB
    public int[][] kClosest_3(int[][] points, int k) {
        HashMap<Double, ArrayList<int[]>> distances = new HashMap<>();
        double[] dists = new double[points.length];
        int i=0;
        for(int[] coordinates : points){
            double dist = Math.sqrt(coordinates[0]*coordinates[0] + coordinates[1]*coordinates[1]);
            ArrayList<int[]> nuts = distances.getOrDefault(dist,new ArrayList<>());
            nuts.add(coordinates);
            distances.put(dist, nuts);
            dists[i]=dist;
            i++;
        }
        Arrays.parallelSort(dists);
        int[][] result = new int[k][2];
        int j=0;
        for(double d: dists){
            if(j >= k)break;
            for(int[] sets: distances.get(d)){
                result[j]=sets;
                j++;
            }
        }
        return result;
    }

    public static void main(String...args){
        int[][] check1 = new int[3][2];
        check1[0]=new int[]{3,3};
        check1[1]=new int[]{5,-1};
        check1[2]=new int[]{-2,4};
        new Closest_Points_To_Origin().kClosest_2(check1,2);
        int[][] check2 = new int[2][2];
        check2[0] = new int[]{1,0};
        check2[1] = new int[]{0,1};
        new Closest_Points_To_Origin().kClosest(check1,2);
    }
}
