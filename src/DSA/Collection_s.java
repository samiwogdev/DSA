package DSA;

import java.util.*;

public class Collection_s {

    public static Collection noDataTypeColl(){ // Datatype not specified
        Collection values = new ArrayList();   // Collection is an interface, Arraylist is the class that implement it
        values.add(23);
        values.add("Bucket");
        return values;
    }

    public static Collection dataTypeColl(){
        Collection< Integer> val = new ArrayList<Integer>();
        val.add(7);
        val.add(78);
        return val;
    }

    public static List noDataList(){ //List-Arraylist is an interface
        List list = new ArrayList();
        list.add("Samson"); // support duplicate value
        list.add("Samson");
        return list;
    }

    public static List dataTypeList(){ //List-vector
        List<Double> vec = new Vector<>();
        vec.add(6.0);
        vec.add(6.8);
        return vec;
    }

    public static Queue dataTypeQueue(){ //Queue- priorityQueue
        Queue<String> que = new PriorityQueue<String>();
        que.add("December");
        que.add("January");
        return que;
    }

    public static Deque dataTypeDeque(){ // Deque-ArrayDeque
        Deque<Integer> deq = new ArrayDeque<Integer>();
        deq.add(34);
        deq.add(54);
        return  deq;
    }

    public static Set dataTypeHashset(){ // Set- HashSet
        Set<String> hash = new HashSet<String>();
        hash.add("bobo");
        hash.add("baby");
        return hash;
    }

    public static Set linkedhash(){
        Set<String> link = new LinkedHashSet<>();
        link.add("blue");
        link.add("car");
        return link;
    }

    public static Map hashmap(){ //map - hashmap
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Dayo");
        map.put(1, "Shile");
        return map;
    }

    public static Map treeMap(){
        Map<String, Integer> tree = new TreeMap<>();
        tree.put("English", 78);
        tree.put("Maths", 79);
        return tree;
    }


    public static void main(String [] args){
//        System.out.println(noDataTypeColl());
//        System.out.println(dataTypeColl());
//        System.out.println(noDataList());
//        System.out.println(dataTypeList());
//        System.out.println(dataTypeQueue());
//        System.out.println(dataTypeDeque());
//        System.out.println(dataTypeHashset());
//        System.out.println(linkedhash());
//        System.out.println(hashmap());
        System.out.println(treeMap());
    }
}
