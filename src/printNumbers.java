public class printNumbers {

    //1. Drop Constant
    public static void twoN(int n){ //0(2n)
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }

        for (int j = 0; j < n; j++){
            System.out.println(j);
        }
    }
    //2.    n^2: O(n^2)
    public static void nSqr(int n){
        int count = 0;
        for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    System.out.println(i + " " + j ) ;
                    count++;
                }

        }
        System.out.println("Number printed in " + count + " times");
    }
    //3. Default    n^3: O()n^3
    public static void nCubeDefault(int n){
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k) ;
                    count++;
                }
            }
        }
        System.out.println("Number printed in " + count + " times");
    }

    //4. Drop the Non-dominance     n^3: O(m^2 + n)
    public static void nCube(int n){
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(i + " " + j);
                count ++;
            }
        }

        for (int k = 0; k < n; k++){
            System.out.println(k);
            count ++;
        }
        System.out.println("Number printed in " + count + " times");
    }

    }

