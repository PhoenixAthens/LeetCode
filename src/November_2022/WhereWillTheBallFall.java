package November_2022;

public class WhereWillTheBallFall {
    //Runtime: 3ms beats 42.71%, Memory: 43.4MB beats 86.88%
    public static int[] findBall(int[][] grid) {
        int i=0;
        int finalIndex=grid[0].length;
        int[] answers=new int[grid[0].length];
        if(grid[0][0]==-1){
            answers[0]=-1;
            i+=1;
        }
        if(grid[0][grid[0].length-1]==1){
            answers[answers.length-1]=-1;
            finalIndex-=1;
        }

        for(;i<finalIndex;i++){
            int I_temp=i;
            for(int j=0;j<grid.length;j++){
                int SubSum=0;
                if(grid[j][I_temp]==1){
                    try{
                        SubSum=grid[j][I_temp]+grid[j][I_temp+1];
                    }catch(Exception ex){
                        answers[i]=-1;
                        break;
                    }
                }else{
                    SubSum=grid[j][I_temp]+grid[j][I_temp-1];
                }
                if(SubSum==0){
                    answers[i]=-1;
                    break;
                }else if(SubSum==2){
                    I_temp++;
                    if(I_temp>grid[0].length-1) {
                        answers[i]=-1;
                        break;
                    }
                }else{
                    I_temp--;
                    if(I_temp==0 && j!=grid.length-1 && grid[j+1][I_temp]!=1){
                        answers[i]=-1;
                        break;
                    }
                }
            }
            if(answers[i]!=-1) answers[i]=I_temp;
            //System.out.println(Arrays.toString(answers));
        }
        return answers;
    }
}
