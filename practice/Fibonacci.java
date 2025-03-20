public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(10);
    }

    private static void printFibonacci(int num) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i=1 ; i<=num ; i++)
        {
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
