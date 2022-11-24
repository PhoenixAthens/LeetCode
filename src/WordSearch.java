import java.util.*;
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int p=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(p)){
                    board[i][j]='.';
                    p++;
                }else if(p>0 && (i!= board.length-1 && j>0) && board[i + 1][j - 1] == word.charAt(p)){
                    board[i][j]='.';
                    i+=1;
                    j-=1;
                    p++;
                }else if(p>0 && i!=0 && board[i-1][j]==word.charAt(p)){
                    board[i][j]='.';
                    i-=1;
                    p++;
                }else if(p>0 && j>1 && board[i][j-2]==word.charAt(p)){
                    board[i][j]='.';
                    j-=2;
                    p++;
                }//else if(p>0 && j>0 && board[i][j])
                if(p==word.length()){
                    break;
                }
            }
        }
        if(p!=word.length()) return false;
        return true;
    }
    /*public static boolean directional(int i,int j, char[][] board, int present, String word){
        int deep=present;
        for(int row=i;row<board.length;row++){
            for(int column=j;column<board[0].length;column++){
                if(board[row][column]==word.charAt(deep)){
                    System.out.println(present);
                    present++;
                }else if(board[row+1][column-1]==word.charAt(deep)){
                    row+=1;
                    deep++;
                }else if(row!=0 && board[row-1][column]==word.charAt(deep)){
                    row-=1;
                }else if(column>1 && board[row][column-2]==word.charAt(deep)){
                    column-=2;
                }else{
                    return false;
                }
            }
        }
        if(deep==word.length()-1)return true;
        else return false;
    }*/
    public static void main(String...args){
        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
        System.out.println(exist(new char[][]{{'A','B'}},"BA"));//,{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));

    }
}
