package InProgress.TimeBasdKey_ValueStore;
import java.util.*;
public class TimeMap {
    private static ArrayList<Integer> prev;
    private static class ObjectOfTime{
        private String key;
        private final Map<Integer,String> valueAssociatedWithKey;
        public ObjectOfTime(){
            this.valueAssociatedWithKey=new HashMap<>();
        }
        public ObjectOfTime(String key,String value,int timeStamp){
            this.key=key;
            valueAssociatedWithKey=new HashMap<>();
            valueAssociatedWithKey.put(timeStamp,value);
        }
        public void setKey(String keyValue){
            this.key=keyValue;
        }
        /*public void setValueAssociatedWithKey(int time,String value){
            if(!valueAssociatedWithKey.containsKey(time)){
                valueAssociatedWithKey.put(time,value);
            }
        }*/
        public String getValueAssociatedWithKey(int time){
            return valueAssociatedWithKey.get(time);
        }


    }
    private List<ObjectOfTime> arrayOfValues;
    public TimeMap() {
        arrayOfValues=new ArrayList<>();
        prev=new ArrayList<>();

    }
    private Map<Integer,String> getValueOfKey(String key){
        for(ObjectOfTime obj:arrayOfValues){
            if((obj.key).equals(key)){
                return obj.valueAssociatedWithKey;
            }
        }
        return null;

    }

    public void set(String key, String value, int timestamp) {
        var result=getValueOfKey(key);
        if(result==null){
            arrayOfValues.add(new ObjectOfTime(key,value,timestamp));
        }else{
            result.put(timestamp,value);
        }
        prev.add(timestamp);

    }
    public int findTheCloses(List<Integer> list,int timeStamp){
        list.sort(null);
        if(timeStamp<list.get(0)){
            return -1;
        }
        int closest=list.get(0);
        for(int i:list){
            if(i-timeStamp<=closest){
                closest=i;
            }
        }
        return closest;
    }
    public String get(String key, int timestamp) {
        for(ObjectOfTime obj:arrayOfValues){
            if((obj.key).equals(key)){
                Set<Integer> keys=obj.valueAssociatedWithKey.keySet();
                if(!keys.isEmpty()){
                    if(keys.contains(timestamp)){
                        return obj.valueAssociatedWithKey.get(timestamp);
                    }else {
                        int value = findTheCloses(prev, timestamp);
                        if (value != -1)
                            return obj.valueAssociatedWithKey.get(value);
                        else return "";
                    }
                }
            }
        }return "";
    }

    /*["TimeMap","set","get","get","set","get","get"]
            [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
    Output

    [null,null,"bar",null,null,"bar2",null]
    */
    /*first we had the timeMap object initialized
    then we used set method and passed the paramters [foo,bar,1]
    then we used get method and tried getting the value for foo 1
     */
    //the thing is that get method return the value at timeStamp before that specified number if that part. timeStamp
    //doesn't exist!!

}
