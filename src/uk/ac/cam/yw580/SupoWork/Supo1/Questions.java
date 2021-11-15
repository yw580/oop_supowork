package uk.ac.cam.yw580.SupoWork.Supo1;

public class Questions {
    //Q5
    //Tail-Recursion Test
    public static void tailRecursionTest() {
        try {
            factorial_Rec(100_000);
        }
        catch (StackOverflowError e){
            System.out.println("As expected");
        }
        try {
            factorial_TailRec(100_000, 1);
            System.out.println("Tail recursion is optimised");
        }
        catch (StackOverflowError e){
            System.out.println("Apparently tail recursion isn't optimised");
        }

    }
    private static int factorial_Rec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial_Rec(n-1);
        }
    }
    private static int factorial_TailRec(int n, int acc)
    {
        if (n == 0 || n == 1) {
            return acc;
        } else {
            return factorial_TailRec(n-1, acc * n);
        }
    }



    // Q6
    public static int lowestCommon(long m, long n)
    {
        int i = 0;
        for (; i < 64 ; i++) {
            if (m % 2 == n % 2)
                break;
            else {
                m = m / 2;
                n = n / 2;
            }
        }
        return i != 64 ? i : -1;
    }
}