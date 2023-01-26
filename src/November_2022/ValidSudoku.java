package November_2022;

import java.util.*;
public class ValidSudoku {
    //Runtime: 7ms beats 46.53%, Memory: 47.3MB beats 21.40%
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                boolean result=Make_3_X_3_Set(i,j,board,0);
                if(!result){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++){
            boolean result=Make_3_X_3_Set(i,0,board,1);
            if(!result){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            boolean result=Make_3_X_3_Set(0,i,board,2);
            if(!result){
                return false;
            }
        }
        return true;
    }
    public static boolean Make_3_X_3_Set(int row,int column,char[][] board,int setting){
        HashSet<Character> set=new HashSet<>();
        int count=0;
        if(setting==0){
            for(int i=row;i<row+3;i++){
                for(int j=column;j<column+3;j++){
                    if(board[i][j]!='.'){
                        count++;
                        set.add(board[i][j]);
                    }
                }
            }
        }else if(setting==1){
            //for row
            for(int i=0;i<9;i++){
                if(board[row][i]!='.'){
                    count++;
                    set.add(board[row][i]);
                }
            }

        }else{
            //for column
            for(int i=0;i<9;i++){
                if(board[i][column]!='.'){
                    count++;
                    set.add(board[i][column]);
                }
            }
        }
        return set.size() == count;
    }
    public static void main(String...args){
        char[][] make=new char[][]{{'5','3','.'},{'6','.','.'},{'.','9','8'}};
        char[][] bake=new char[][]{{'8','3','.'},{'6','.','.'},{'.','9','8'}};
        /*System.out.println(Make_3_X_3_Set(0,make));
        System.out.println(Make_3_X_3_Set(0,bake));*/
        System.out.println(isValidSudoku(
                new char[][]{{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}}));
        System.out.println(isValidSudoku(
                new char[][]{{'.','.','4','.','.','.','6','3','.'},
                        {'.','.','.','.','.','.','.','.','.'}
                        ,{'5','.','.','.','.','.','.','9','.'},{'.','.','.','5','6','.','.','.','.'},{'4','.','3','.','.','.','.','.','.'},{'.','.','.','7','.','.','.','.','.'},{'.','.','.','5','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}}));
    }
}
