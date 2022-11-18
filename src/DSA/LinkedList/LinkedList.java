package DSA.LinkedList;

 class LinkedList {
     private Node head;
     private Node tail;
     private int length;


     public LinkedList(int value){ //constructor
         Node newNode = new Node(value);
         this.head = newNode; //loading class ppties
         this.tail = newNode;
         this.length = 1;
     }

     public void printList(){

        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        if(length == 0){
            System.out.println("list is empty");
        }
     }

     public void getHead(){
         if(head == null){
             System.out.println("Head is empty");
             return;
         }
         System.out.println("Head: " + head.value);
     }

     public void getTail(){
         if (tail == null) {
             System.out.println("Tail is empty");
             return;
         }
         System.out.println("Tail: " + tail.value);
     }

     public void getLength(){
         System.out.println("Length: " + length);
     }

     public void append(int value){
         Node newNode = new Node(value);
         if (length == 0 ){
             head = newNode;
             tail = newNode;
         }else{
             tail.next = newNode;
             tail = newNode;
         }
         length++;
     }

     public void prepend(int value){
         Node newNode = new Node(value);
         if(length == 0){
             head = newNode;
             tail = newNode;
         }else{
             newNode.next = head;
             head = newNode;
         }
         length++;
     }

     public Node removeLast(){
         if (length == 0) return null;
         Node temp  = head;
         Node pre = head;
         while(temp.next != null){
             pre = temp;
             temp = temp.next;
         }
         tail = pre;
         tail.next = null;
         length--;
         if (length == 0){
             head = null;
             tail = null;
         }
         return temp;

     }

     public Node removeFirst(){
         if (length == 0) return null;
         Node temp = head;
         head = head.next;
         temp.next = null;
         length--;
         if (length == 0){
             tail = null;
         }

         return temp;
     }

//     class Node{ //Inner class concept
//         int value;
//         Node next;
//
//         public Node(int value){
//             this.value = value;
//         }
//     }

}


