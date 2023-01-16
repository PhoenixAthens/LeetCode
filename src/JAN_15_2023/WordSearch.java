package JAN_15_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class WordSearch {
    //works for 39/85 test cases!
    //still needs work
    public boolean exist(char[][] board, String word) {
        if((board[0].length*board.length)<word.length())return false;
        int pointer=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    char[][] copy= Arrays.copyOf(board,board.length);
                    copy[i][j]='#';
                    pointer++;
                    if(findIf(copy,word,pointer,j,i)==word.length())return true;

                }
            }
        }
        return false;
    }
    public int findIf(char[][] board, String word, int pointer, int currentX, int currentY){
        if(pointer==word.length())return pointer;
        if(currentX<board[0].length-1 && currentX>0) {
            if (board[currentY][currentX - 1] == word.charAt(pointer)) {
                //board[currentY][currentX - 1]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                board[currentY][currentX - 1]='#';
                /*return */findIf(makeNew,word,pointer,currentX-1,currentY);
                /*int result=findIf(board,word,pointer,currentX-1,currentY);
                if(result==word.length())return result;
                else{
                    currentX-=1;

                }*/
            }
            if (board[currentY][currentX + 1] == word.charAt(pointer)) {
                //board[currentY][currentX + 1]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                makeNew[currentY][currentX + 1]='#';
                /*return */findIf(makeNew,word,pointer,currentX+1,currentY);
                /*int result=findIf(board,word,pointer,currentX+1,currentY);
                if(result==word.length())return result;
                else{
                    currentX+=1;

                }*/
            }
        }else if(currentX==board[0].length-1){
            if (board[currentY][currentX - 1] == word.charAt(pointer)) {
                //board[currentY][currentX - 1]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                makeNew[currentY][currentX - 1]='#';
                /*return */findIf(makeNew,word,pointer,currentX-1,currentY);
                /*int result=findIf(board,word,pointer,currentX-1,currentY);
                if(result==word.length())return result;
                else{
                    currentX-=1;
                }*/
            }
        }else if(currentX==0){
            if (board[currentY][currentX + 1] == word.charAt(pointer)) {
                //board[currentY][currentX + 1]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                makeNew[currentY][currentX + 1]='#';
                /*return */findIf(makeNew,word,pointer,currentX+1,currentY);
                /*int result=findIf(board,word,pointer,currentX+1,currentY);
                if(result==word.length())return result;
                else{
                    currentX+=1;

                }*/
            }
        }
        if(currentY<board.length-1 && currentY>0){
            if(board[currentY-1][currentX]==word.charAt(pointer)){
                //board[currentY-1][currentX]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                makeNew[currentY-1][currentX]='#';
                /*return */findIf(makeNew,word,pointer,currentX,currentY-1);
                /*int result=findIf(board,word,pointer,currentX,currentY-1);
                if(result==word.length())return result;
                else{
                    currentY-=1;
                }*/
            }
            if(board[currentY+1][currentX]==word.charAt(pointer)){
                //board[currentY+1][currentX]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                makeNew[currentY+1][currentX]='#';
                /*return */findIf(makeNew,word,pointer,currentX,currentY+1);
                /*int result=findIf(board,word,pointer,currentX,currentY+1);
                if(result==word.length())return result;
                else{
                    currentY+=1;
                }*/
            }
        }else if(currentY==board.length-1){
            if(board[currentY-1][currentX]==word.charAt(pointer)){
                //board[currentY-1][currentX]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                makeNew[currentY-1][currentX]='#';
                /*return */findIf(makeNew,word,pointer,currentX,currentY-1);
                /*int result=findIf(board,word,pointer,currentX,currentY-1);
                if(result==word.length())return result;
                else{
                    currentY-=1;

                }*/
            }
        }else if(currentY==0){
            if(board[currentY+1][currentX]==word.charAt(pointer)){
                //board[currentY+1][currentX]='#';
                pointer++;
                char[][] makeNew=Arrays.copyOf(board,board.length);
                makeNew[currentY+1][currentX]='#';
                /*return */findIf(makeNew,word,pointer,currentX,currentY+1);
                /*int result=findIf(board,word,pointer,currentX,currentY+1);
                if(result==word.length())return result;
                else{
                    currentY+=1;

                }*/
            }
        }
        return pointer;
    }
    public static void main(String...args){
        boolean rel=new WordSearch().exist(new char[][]{{'A','B','C','D'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
        System.out.println(rel);//expected true
        boolean rel2=new WordSearch().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"SEE");
        System.out.println(rel2);//expected true
        boolean rel3=new WordSearch().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCB");
        System.out.println(rel3);//expected false
        boolean rel4=new WordSearch().exist(new char[][]{{'A','B'},{'C','D'}},"ABCD");
        System.out.println(rel4);//expected false;
        boolean rel5=new WordSearch().exist(new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}},"ABCESEEEFS");
        System.out.println(rel5);//expected true
    }
    /* The code that works for 39 test cases but fails at rel5
    class Solution {
    public boolean exist(char[][] board, String word) {
        if((board[0].length*board.length)<word.length())return false;
        int pointer=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    char[][] copy= Arrays.copyOf(board,board.length);
                    copy[i][j]='#';
                    pointer++;
                    if(findIf(copy,word,pointer,j,i)==word.length())return true;

                }
            }
        }
        return false;
    }
    public int findIf(char[][] board, String word, int pointer, int currentX, int currentY){
        if(pointer==word.length())return pointer;
        if(currentX<board[0].length-1 && currentX>0) {
            if (board[currentY][currentX - 1] == word.charAt(pointer)) {
                board[currentY][currentX - 1]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX-1,currentY);
                if(result==word.length())return result;
                else{
                    currentX-=1;

                }
            }
            if (board[currentY][currentX + 1] == word.charAt(pointer)) {
                board[currentY][currentX + 1]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX+1,currentY);
                if(result==word.length())return result;
                else{
                    currentX+=1;

                }
            }
        }else if(currentX==board[0].length-1){
            if (board[currentY][currentX - 1] == word.charAt(pointer)) {
                board[currentY][currentX - 1]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX-1,currentY);
                if(result==word.length())return result;
                else{
                    currentX-=1;
                }
            }
        }else if(currentX==0){
            if (board[currentY][currentX + 1] == word.charAt(pointer)) {
                board[currentY][currentX + 1]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX+1,currentY);
                if(result==word.length())return result;
                else{
                    currentX+=1;

                }
            }
        }
        if(currentY<board.length-1 && currentY>0){
            if(board[currentY-1][currentX]==word.charAt(pointer)){
                board[currentY-1][currentX]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX,currentY-1);
                if(result==word.length())return result;
                else{
                    currentY-=1;
                }
            }
            if(board[currentY+1][currentX]==word.charAt(pointer)){
                board[currentY+1][currentX]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX,currentY+1);
                if(result==word.length())return result;
                else{
                    currentY+=1;
                }
            }
        }else if(currentY==board.length-1){
            if(board[currentY-1][currentX]==word.charAt(pointer)){
                board[currentY-1][currentX]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX,currentY-1);
                if(result==word.length())return result;
                else{
                    currentY-=1;

                }
            }
        }else if(currentY==0){
            if(board[currentY+1][currentX]==word.charAt(pointer)){
                board[currentY+1][currentX]='#';
                pointer++;
                int result=findIf(board,word,pointer,currentX,currentY+1);
                if(result==word.length())return result;
                else{
                    currentY+=1;

                }
            }
        }
        return pointer;
    }
}
    * */
}

