package Scrap;

import java.util.*;

public class MakeTheStringGreat {
    //Wrong solution: but still worth A shot
    public String makeGood(String s) {
        ArrayList<String> provided=new ArrayList<>(Arrays.asList(s.split("")));
        for(int i=0;i<provided.size();i++){
            try{
                String str=provided.get(i);
                if(str.hashCode()<=90){
                    String temp=str.toLowerCase();
                    if(provided.contains(temp)){
                        provided.set(i,null);
                        provided.set(provided.indexOf(temp),null);
                    }
                }else if(str.hashCode()>=97){
                    String temp=str.toUpperCase();
                    if(provided.contains(temp)){
                        provided.set(i,null);
                        provided.set(provided.indexOf(temp),null);
                    }
                }
            }catch(Exception ex){}
        }
        StringBuilder build=new StringBuilder();
        provided.forEach(x->{
            if(x!=null)build.append(x);
        });
        return build.toString();

    }
    public static void main(String...args){
        System.out.println(new MakeTheStringGreat().makeGood("s"));
//        String main=null;
//        System.out.println(main.hashCode());
////        String letter="W";
//        String let="A";//65
//        String lett="Z";//90
//        System.out.println(let.hashCode());
//        System.out.println(lett.hashCode());
//        System.out.println("a".hashCode());//97
//        System.out.println("z".hashCode());//122

    }
}
