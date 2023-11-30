package July_2023;

import java.util.HashMap;

public class TopologicalSorting_DFS {
    public static HashMap<Character,Integer>  topologicalSorter(HashMap<Character,char[]> adjList) {
        HashMap<Character, Integer> indexMap = new HashMap<>();
        int numberOfVertices = adjList.size();
        int[] visited = new int[numberOfVertices];
        int[] labelCurrent = {numberOfVertices};
        int[] visitedIndex = {0};
        for (char i : adjList.keySet()){
            if (visited[i - 97] == 0) {
                TopSort(i, adjList, labelCurrent, indexMap, visited, visitedIndex);
            }
        }
        return indexMap;
    }
    public static void TopSort(char currentChar,HashMap<Character,char[]> adjList,int[] labelCurrent,HashMap<Character,Integer> indexMap,int[] visited,int[] visitedIndex){
        visited[currentChar-97]=++visitedIndex[0];
        for(char i:adjList.get(currentChar)){
            if(visited[i-97]==0){
                TopSort(i,adjList,labelCurrent,indexMap,visited,visitedIndex);
            }else if(!indexMap.containsKey(i)){
                System.out.println("Cycle detected! Cyclic graph cannot be topologically sorted!");
                System.exit(-1);
            }
        }
        indexMap.put(currentChar,labelCurrent[0]--);
    }
    public static void main(String...args){
        HashMap<Character,char[]> adjacencyList = new HashMap<>();
        adjacencyList.put('a',new char[]{'d','e'});
        adjacencyList.put('b',new char[]{'c','a','f'});
        adjacencyList.put('c',new char[]{'a','d'});
        adjacencyList.put('d',new char[]{'g'});
        adjacencyList.put('e',new char[]{'d','g'});
        adjacencyList.put('f',new char[]{'e','g'});
        adjacencyList.put('g',new char[]{});
        System.out.println(topologicalSorter(adjacencyList));//{a=4, b=1, c=3, d=6, e=5, f=2, g=7}

        HashMap<Character, char[]> adjList_2 = new HashMap<>();
        adjList_2.put('a',new char[]{'b'});
        adjList_2.put('b',new char[]{'c','e'});
        adjList_2.put('c',new char[]{'d'});
        adjList_2.put('d',new char[]{});
        adjList_2.put('e',new char[]{'d'});
        System.out.println(topologicalSorter(adjList_2));//{a=1, b=2, c=4, d=5, e=3}

        HashMap<Character, char[]> adjList_3 = new HashMap<>();
        adjList_3.put('a',new char[]{'c','e'});
        adjList_3.put('b',new char[]{'a','d'});
        adjList_3.put('c',new char[]{'b','d','a'});
        adjList_3.put('d',new char[]{});
        adjList_3.put('e',new char[]{'b','d'});
        System.out.println(topologicalSorter(adjList_3));//Cycle detected! Cyclic graph cannot be topologically sorted!
    }

}
