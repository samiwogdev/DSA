package DSA.LinkedList;

public class Test {
    public static void main(String [] args){
        LinkedList list = new LinkedList(2);
        list.append(3);
//        list.append(4);
        list.prepend(1);
//        list.removeLast();

//        list.getHead();
//        list.getTail();
//        list.getLength();
        list.printList();
//        list.getTail();
//        list.getHead();
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//               list.getHead();
//               list.getTail();
        System.out.println( list.get(2).value);
   }
}
