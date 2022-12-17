package From_17th_December;

public class RichestCustomerWealth {
    //Runtime: 0ms beats 100%, Memory: 43.5MB beats 33.52%
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        int totalMembers=accounts.length;
        for(int i=0;i<totalMembers;i++){
            int tempTotal=0;
            int[] presentGuy=accounts[i];
            for(int j=0;j<presentGuy.length;j++){
                tempTotal+=presentGuy[j];
            }
            maxWealth=Math.max(tempTotal,maxWealth);
        }
        return maxWealth;
    }
}
