import java.util.Locale;
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String in = sc.nextLine();
        System.out.println(in+" is a vowel : "+vowelCheck(in));
    }

    private static boolean vowelCheck(String name) {
    return name.toLowerCase().matches(".*[aeiou].*");
    }
}
