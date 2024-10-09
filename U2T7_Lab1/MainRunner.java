import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String word1 = scan.nextLine();
    System.out.print("Enter second string: ");
    String word2 = scan.nextLine();

    int length1 = word1.length();
    int length2 = word2.length();
    if (length1 > length2) {
        System.out.println(word1 + " is longer");
    } else
    System.out.println(word2 + " is longer");

    System.out.println("First half: " + word1.substring(0, length1/2));
    System.out.println("Second half: " + word1.substring(length1/2));
    System.out.println("First half: " + word2.substring(0, length2/2));
    System.out.println("Second half: " + word2.substring(length2/2));

    if (word1.indexOf(word2) == -1) {
    System.out.println(word2 + " is NOT found in " + word1);
    } else
    System.out.println(word2 + " is found in " + word1 + " at index " + word1.indexOf(word2));

    scan.close();
    }
}
