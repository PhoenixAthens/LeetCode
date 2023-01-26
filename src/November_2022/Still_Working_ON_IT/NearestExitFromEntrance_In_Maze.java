package November_2022.Still_Working_ON_IT;

import java.util.*;
public class NearestExitFromEntrance_In_Maze {
    public static int nearestExit(char[][] maze, int[] entrance) {
        int path=0;
        ArrayList<Integer> paths=new ArrayList<>();
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                if(maze[i][j]=='.'){
                    path+=1;
                    paths.add(trace(new int[]{i,j},entrance,maze,path));
                }
            }
        }
        paths.sort(null);
        return paths.get(0);
    }
    public static int trace(int[] present,int[] destination,char[][] main,int path){
        int firstSector=present[0];
        int secondSector=present[1];
        if(present==destination) return path;
        else {
            for (int i = present[0]; i < destination[0]; i++) {
                if (main[i][present[1]] == '+'){
                    break;
                }else{
                    path++;
                    firstSector++;
                }
            }
            if (firstSector == destination[0]) {
                for (int i = present[1]; i < destination[1]; i++) {
                    if (main[firstSector][i] == '+') {
                        break;
                    } else {
                        path++;
                        secondSector++;
                    }
                }
                if (secondSector == destination[1]) {
                    return path;
                }
            } else {
                return 0;
            }
        }
        return path;
    }
    public static void main(String...args){
        System.out.println(nearestExit(new char[][]{{'+','+','+'},{'.','.','.'},{'+','+','+'}},new int[]{1,0}));
    }
}