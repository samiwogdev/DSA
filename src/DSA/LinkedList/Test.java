package DSA.LinkedList;

public class Test {
    public static void main(String [] args){
        LinkedList list = new LinkedList(2);
        list.append(3);
        list.append(4);
        list.prepend(1);
//        list.removeLast();

//        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.getTail();
//        list.getHead();
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//               list.getHead();
//               list.getTail();
//        System.out.println( list.get(2).value + "\n");
        list.printList();
        System.out.println("\n");
        list.set(1, 20);
        list.insert(0, 100);
        list.printList();
   }
}
