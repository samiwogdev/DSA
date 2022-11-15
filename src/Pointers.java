import java.util.HashMap;

public class Pointers {

    static void printMap(){
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("age", 11);
        map2 = map1; //map2 points to the same exact hashmap in memory

        map1.put("age", 89);
        map1.put("quantity", 70);
        System.out.println(map1);
        System.out.println(map2);
    }

    static void noPointers(){
        int num1 = 6;
        int num2 = num1;
        num1 = 7;
        System.out.println(num1);
        System.out.println(num2);
    }
}
