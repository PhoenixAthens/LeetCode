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
    /*
    981. Time Based Key-Value Store
Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.

Implement the TimeMap class:

TimeMap() Initializes the object of the data structure.
void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".


Example 1:

Input
["TimeMap", "set", "get", "get", "set", "get", "get"]
[[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
Output
[null, null, "bar", "bar", null, "bar2", "bar2"]

Explanation
TimeMap timeMap = new TimeMap();
timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
timeMap.get("foo", 1);         // return "bar"
timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
timeMap.get("foo", 4);         // return "bar2"
timeMap.get("foo", 5);         // return "bar2"


Constraints:

1 <= key.length, value.length <= 100
key and value consist of lowercase English letters and digits.
1 <= timestamp <= 107
All the timestamps timestamp of set are strictly increasing.
At most 2 * 105 calls will be made to set and get.
     */
}
