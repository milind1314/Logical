import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = Integer.parseInt(sc.nextLine());

        if (isPrime(num))
        {
            System.out.println(num+" is a prime number.");
        }else {
            System.out.println(num+" is not a prime number.");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 0 || num == 1)
        {
            return false;
        }

        if (num == 2)
        {
            return true;
        }
        int count = 1;
        for (int i = 3 ; i<=num; i++)
        {
            if (num % i == 0)
            {
                count++;
            }
        }
        return count == 2;
    }
}
