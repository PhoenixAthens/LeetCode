package January_2023.Jan_8th_2023;

public class CheckIf_N_AndItsDoubleExist_ED2 {
    public boolean checkIfExist(int[] arr) {
        //Runtime: 2ms beats 76.39%, Memory: 41.7MB beats 85.88%
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*2==arr[j] || arr[i]/2.0==arr[j])return true;
            }
        }
        return false;
    }
}
