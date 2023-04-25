package April_2023;
//Smallest Number in Infinite Set
//Date: April 25th 2023
public class SmallestInfiniteSet {
    //Runtime: 26ms beats 43.6%, Memory: 43.2MB
    private final int[] set;
    public SmallestInfiniteSet() {
        set = new int[1001];
    }
    public int popSmallest() {
        for(int i=0;i<1001;i++){
            if(set[i]==0){
                set[i]-=1;
                return i;
            }
        }
        return -1;
    }
    public void addBack(int num) {
        if(set[num]<0)set[num]=0;
    }
}
