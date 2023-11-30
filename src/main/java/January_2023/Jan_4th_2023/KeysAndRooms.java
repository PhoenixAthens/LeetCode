package January_2023.Jan_4th_2023;
import java.util.*;
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //Runtime: 15ms, beats 5%, Memory: 45.8MB beats 5.97%
        //Not the optimal solution!!
        HashSet<Integer> canOpen=new HashSet<>(List.of(0));
        for(int j=0;j<7;j++){
            for(int i=0;i<rooms.size();i++){
                if(canOpen.contains(i)){
                    canOpen.addAll(rooms.get(i));
                }


            }
        }
        return canOpen.size()==rooms.size();
    }
    public static void main(String...args){
        List<List<Integer>> l=new ArrayList<>();
        l.add(new ArrayList<>(List.of(1)));
        l.add(new ArrayList<>(List.of(2)));
        l.add(new ArrayList<>(List.of(3)));
        l.add(new ArrayList<>());
        List<List<Integer>> l2=new ArrayList<>();
        //[6,7,8,1,9,2,3,5,]
        l2.add(new ArrayList<>(List.of(6,7,8)));//0
        l2.add(new ArrayList<>(List.of(5,4,9)));//1
        l2.add(new ArrayList<>(List.of()));//2
        l2.add(new ArrayList<>(List.of(8)));//3
        l2.add(new ArrayList<>(List.of(4)));//4
        l2.add(new ArrayList<>(List.of()));//5
        l2.add(new ArrayList<>(List.of(1,9,2,3)));//6
        l2.add(new ArrayList<>(List.of(7)));//7
        l2.add(new ArrayList<>(List.of(6,5)));//8
        l2.add(new ArrayList<>(List.of(2,3,1)));//9
        System.out.println(new KeysAndRooms().canVisitAllRooms(l));
        System.out.println(new KeysAndRooms().canVisitAllRooms(l2));

    }
}
