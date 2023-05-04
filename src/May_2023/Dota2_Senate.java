package May_2023;
import java.util.Arrays;
public class Dota2_Senate {
    //Attempt1: fails at 74th test case (73/82)
    //A few changes
    //Runtime: 85ms, Memory: 43MB
    //A few more changes
    //Runtime: 57ms, Memory: 42.4MB
    public String predictPartyVictory(String senate) {
        char[] main=senate.toCharArray();
        while(true){
            for(int i=0;i<main.length;i++){
                char current=main[i];
                if(current!='Z'){
                    boolean flag=true;
                    char find=(current=='R')?'D':'R';
                    int x=0;
                    for(int j=i+1;j<main.length+i;j++){
                        if(j==main.length)x=main.length;
                        if(main[j-x]==find){
                            main[j-x]='Z';
                            flag=false;
                            break;
                        }
                    }
                    if(flag) return (current=='R')?"Radiant":"Dire";
                }
            }
        }
    }
    //Runtime: 3ms, Memory: 42.2MB
    public String predictPartySummary_Alternate(String senate){
        char[] senators=senate.toCharArray();
        boolean flag1=true;
        boolean flag2=true;
        int temperature=0;
        while(flag1 && flag2){
            flag1=false;
            flag2=false;
            for(int i=0;i<senators.length;i++){
                if(senators[i]=='R'){
                    if(temperature<0){
                        senators[i]=0;
                    }else{
                        flag1=true;
                        temperature++;
                    }

                }else if(senators[i]=='D'){
                    if(temperature>1){
                        senators[i]=0;
                    }else{
                        flag2=true;
                        temperature--;
                    }

                }
            }
        }
        return flag1?"Radiant":"Dire";
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
