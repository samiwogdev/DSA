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

    //4. Drop the Non-dominance     n^3: O(m^2 + n) = o(n^2)
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

    //n^2: O(n^2)
    static void quadraticTimeComplexity(int ages[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.printf("%d = %d\n", ages[i], ages[j]);
            }
        }
    }

    static int fibonacci(int num)
    {
        if (num <= 1){
            return num;
        }else {
            return fibonacci(num - 2) + fibonacci(num - 1);
        }
    }

    public static void fibonacciExample(int count){
        int n1=0, n2=1, n3, i;

        System.out.print(n1+" "+n2);//printing 0 and 1
        for(i=2; i<count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        }

}

