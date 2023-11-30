package InProgress;

import javax.print.DocFlavor;
import java.util.*;
public class WordSearch_II {
    public static List<String> findWords(char[][] board, String[] words) {
        ArrayList<String> Words=new ArrayList<>(Arrays.asList(words));
        HashSet<String> found=new HashSet<>();
        for(int i=0;i< board.length;i++){
            StringBuilder array=new StringBuilder();
            int I_temp=i;
            int j=0;
            extracted(board, Words, found, i, array, I_temp, j);
            //extracted(board,Words,found,i,array,I_temp,j,72);
        }
        for (int i = 0; i < board.length; i++) {
            StringBuilder array = new StringBuilder();
            int I_temp = i;
            int j = board[0].length - 1;
            extracted2(board, Words, found, i, array, I_temp, j);
        }

        return new ArrayList<>(found);
    }

    private static void extracted(char[][] board, ArrayList<String> Words, HashSet<String> found, int i, StringBuilder array, int I_temp, int j) {
        while(I_temp < board.length && j < board[0].length){
            array.append(board[I_temp][j]);
            StringBuilder temp2=new StringBuilder(array);
            if(Words.contains(array.toString()) || Words.contains(temp2.reverse().toString())){
                found.add(array.toString());
            }
            I_temp++;
            if(I_temp == board.length){
                I_temp = i;
                j++;
                array =new StringBuilder();
                for(int iota = 0; iota< j; iota++){
                    array.append(board[I_temp][iota]);
                }
            }

        }
    }
    private static void extracted2(char[][] board, ArrayList<String> Words, HashSet<String> found, int i, StringBuilder array, int I_temp, int j) {
        while(I_temp < board.length && j >=0){
            array.append(board[I_temp][j]);
            StringBuilder temp2=new StringBuilder(array);
            System.out.println(array +"+++:+++"+temp2.reverse());
            if(Words.contains(array.toString()) || Words.contains(temp2.reverse().toString())){
                found.add(array.toString());
            }
            I_temp++;
            if(I_temp == board.length){
                I_temp = i;
                j--;
                array =new StringBuilder();
                for(int iota = board[0].length-1; iota>j; iota--){
                    array.append(board[I_temp][iota]);
                }
            }

        }
    }

    public static void main(String...args){
        System.out.println(findWords(new char[][]{{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}},new String[]{"oath","pea","eat","rain"}));
    }

}
