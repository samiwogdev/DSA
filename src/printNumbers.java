public class printNumbers {

    public static void twoN(int n){ //0(2n)
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }

        for (int j = 0; j < n; j++){
            System.out.println(j);
        }
    }

    public static void nSqr(int n){ //o(n2)
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(i + " " + j);
                count ++;
            }
        }
        System.out.println("Number printed in " + count + " times");
    }

    }

