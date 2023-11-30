package April_2023;
//Smallest Number in Infinite Set
//Date: April 25th 2023
public class SmallestInfiniteSet {
    //Runtime: 24ms beats 43.6%, Memory: 43MB beats 88.67%
    //After Some Changes
    //Runtime: 10ms beats 99.43%, Memory: 43.4MB beats 41.36%
    private final int[] set;
    private int startFrom=1;
    public SmallestInfiniteSet() {
        set = new int[1001];

    }
    public int popSmallest() {
        for(int i=startFrom;i<1001;i++){
            if(set[i]==0){
                set[i]=-1;
                startFrom=i;
                return i;
            }
        }
        return -1;
    }
    public void addBack(int num) {
        if(set[num]<0){
            if(num<startFrom)startFrom=num;
            set[num]=0;
        }
    }
}
