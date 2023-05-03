package May_2023;

public class LongestCommonPrefix {
    //Runtime: 1ms, Memory: 40.3MB
    public String longestCommonPrefix(String[] strs) {
        int len=strs[0].length();
        for(String i:strs){
            len=Math.min(len,i.length());
        }
        int i=0;
        StringBuffer buff=new StringBuffer();
        while(i<len){
            char present=strs[0].charAt(i);
            for(String s:strs){
                if(s.charAt(i)!=present){
                    return buff.toString();
                }
            }
            i++;
            buff.append(present);
        }
        return buff.toString();
    }
    //Runtime: 2ms, Memory: 40.4MB
    public String longestCommonPrefix_alternate(String[] strs) {
        if(strs[0].equals(""))return "";
        int len=strs[0].length();
        int i=0;
        StringBuffer buff=new StringBuffer();
        while(i<len){
            char present=strs[0].charAt(i);
            for(String s:strs){
                if(s.length()<=i || s.charAt(i)!=present){
                    return buff.toString();
                }
            }
            i++;
            buff.append(present);
        }
        return buff.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

}
