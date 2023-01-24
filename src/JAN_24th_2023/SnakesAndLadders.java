package JAN_24th_2023;

public class SnakesAndLadders {
    //still working on it
    //solve the odd even problem!
    public int snakesAndLadders(int[][] board) {
        if(board.length*board[0].length<=6)return 1;
        int modValue=board[0].length;
        int[] rowIndex=new int[modValue];
        int place=0;
        for(int i=modValue-1;i>=0;i--){
            rowIndex[place]=i;
            place++;
        }
        int count=0;
        float tempCount=0;
        int[] result=null;
        int i=board.length-1;
        int j=0;
        for(;i>=0;i--){
            if(i%2==1){
                for(;j<modValue;j++){
                    if(board[i][j]!=-1){
                        if(tempCount<=6){
                            count++;
                        }else{
                            count+=(int)Math.ceil(tempCount/modValue);
                        }
                        tempCount=0;
                        result=calcPlace(board[i][j],modValue);
                        break;
                    }else{
                        tempCount++;
                    }
                }
            }else{
                if(j==0)j=modValue-1;
                for(;j>=0;j--){
                    if(board[i][j]!=-1){
                        if(tempCount<=6){
                            count++;
                        }else{
                            count+=(int)Math.ceil(tempCount/modValue);
                        }
                        tempCount=0;
                        result=calcPlace(board[i][j],modValue);
                        break;
                    }else{
                        tempCount++;
                    }
                }
            }
            if(result!=null){
                i=rowIndex[result[0]]+1;
                j=result[1];
                result=null;
            }
        }
        count+=Math.ceil(tempCount/modValue);
        return count;
    }
    public int[] calcPlace(int jumpDest,int modValue){
        int row=jumpDest/modValue;
        int column;
        int temp=jumpDest%modValue;
        if(row%2==0){
            column= temp != 0 ? temp - 1 : modValue - 1;
        }else{
            column=modValue-temp;
        }
        return new int[]{row,column};
    }
    public static void main(String...args){
        //int r=new SnakesAndLadders().snakesAndLadders(new int[][]{{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,35,-1,-1,13,-1},{-1,-1,-1,-1,-1,-1},{-1,15,-1,-1,-1,-1}});
        //System.out.println(r);
        int v=new SnakesAndLadders().snakesAndLadders(new int[][]{{-1,-1,-1},{-1,9,8},{-1,8,9}});
    }
}
