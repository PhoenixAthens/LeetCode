package April_2023;

public class BulbSwitcher {
    //Memory+Time Limit Exceeded
    //Memory exceeded when using [int]
    //Time exceeded when using [byte]
    public int bulbSwitch(int n) {
        if(n<2)return n;
        byte[] nums=new byte[n];
        for(int i=2;i<=n;i++){
            for(int j=i-1;j<n;j+=i){
                if(nums[j]==0)nums[j]=1;
                else nums[j]=0;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)count++;
        }
        return count;
    }
    public static void main(String...args){
        System.out.println(new BulbSwitcher().bulbSwitch(0));
        System.out.println(new BulbSwitcher().bulbSwitch(1));
        System.out.println(new BulbSwitcher().bulbSwitch(2));
        System.out.println(new BulbSwitcher().bulbSwitch(3));
        System.out.println(new BulbSwitcher().bulbSwitch(4));
        System.out.println(new BulbSwitcher().bulbSwitch(5));

    }
}
