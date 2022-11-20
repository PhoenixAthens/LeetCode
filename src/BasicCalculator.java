import java.util.*;
public class BasicCalculator {
    //131ms, memory:63.7MB
    private int index=0;
    public int calculate(String s) {
        s=s.trim();
        try{
            return Integer.parseInt(s);
        }catch(Exception ex){
            ArrayList<String> main=new ArrayList<>();
            //main.add(0,"(");
            String[] fromS=s.split("");
            boolean flag=false;
            int hold=0;
            for(int i=0;i<s.length();i++){
                String present=fromS[i];
                if(present.equals(" ")){
                    continue;
                }
                if(present.equals("+")||present.equals("-")||present.equals("(")||present.equals(")")){
                    main.add(present);
                    flag=false;
                    hold++;
                }else{
                    if(flag){
                        String last=main.get(hold-1);//if you remove early braces make this hold-1
                        last+=present;
                        main.set(hold-1,last);
                    }else{
                        main.add(present);
                        flag=true;
                        hold++;
                    }
                }
            }
            //main.add(")");
            return borderQuality(main);
        }
    }
    public int borderQuality( ArrayList<String> main){
        int result=0;
        for(;index<main.size();index++){
            String present=main.get(index);
            if(present.equals("+")){
                String next=main.get(index+1);
                if(next.equals("(")){
                    index+=2;
                    result+=borderQuality(main);
                }else{
                    result+=Integer.parseInt(main.get(index+1));
                    index++;
                }
            }else if(present.equals("-")){
                String next=main.get(index+1);
                if(next.equals("(")){
                    index+=2;
                    result-=borderQuality(main);
                }else{
                    result-=Integer.parseInt(main.get(index+1));
                    index++;
                }
            }else if( present.equals("(")){
                index+=1;
                result+=borderQuality(main);
            }else if(present.equals(")")){
                return result;
            }else{
                result+=Integer.parseInt(main.get(index));
            }
        }
        return result;
    }

    public static void main(String...args){
        System.out.println(new BasicCalculator().calculate("(6)-(8)-(7)+(1+(6))")); //-2 -7 +7
    }
}
