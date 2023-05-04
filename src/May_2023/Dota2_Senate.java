package May_2023;
import java.util.Arrays;
public class Dota2_Senate {
    //Attempt1: fails at 74th test case (73/82)
    //A few changes
    //Runtime: 85ms, Memory: 43MB
    public String predictPartyVictory(String senate) {
        char[] main=senate.toCharArray();
        char victory='Z';
        while(victory=='Z'){

            for(int i=0;i<main.length;i++){
                char current=main[i];
                if(current!='Z'){
                    int index=-1;
                    char find=(current=='R')?'D':'R';
                    int x=0;
                    for(int j=i+1;j<main.length+i;j++){
                        if(j==main.length)x=main.length;
                        if(main[j-x]==find){
                            index=j-x;
                            break;
                        }
                    }
                    if(index>-1)main[index]='Z';
                    else{
                        victory=current;
                        break;
                    }
                }
            }
        }
        return (victory=='R')?"Radiant":"Dire";
    }
    public static void main(String...args){
        System.out.println(new Dota2_Senate().predictPartyVictory("RD"));
        System.out.println(new Dota2_Senate().predictPartyVictory("RDD"));
        System.out.println(new Dota2_Senate().predictPartyVictory("DRRDRDRDRDDRDRDR"));
        //"D R R D R D R D R D D R D R D R "
        //"D Z R D R D R D R D D R D R D R "
        //"Z Z Z Z Z Z Z Z Z D D Z D Z D D "
    }
}
