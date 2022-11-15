import DSA.Pointers;
import OOP.Encapsulation;

public class Test {
    public static void main(String[] args) {
//        printNumbers.twoN(10);
//        printNumbers.nSqr(10);
//        printNumbers.nCube(10);
        int[] studentAge = {23, 18, 26, 19, 20};
//        printNumbers.quadraticTimeComplexity(studentAge, 5);
//        printNumbers.fibonacci(4);
//        Pointers.printMap();

//          Pointers.noPointers();

        Encapsulation encap = new Encapsulation();

        encap.setGeekName("samson");
        encap.setGeekAge(13);
        encap.setGeekRole("Teacher");
// Direct access of geekRoll, geekAge and geekName is not possible due to encapsulation
        System.out.println(encap.getGeekRole() + " " + encap.getGeekName() + " age is " + encap.getGeekAge());
    }
}
