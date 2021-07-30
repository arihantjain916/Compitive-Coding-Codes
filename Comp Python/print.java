import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        // if you want to print string initalize it on first or if you initalize it
        // other than second position then use nextLine() before initalize the string
        // only if you want to take string including spaces.

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}