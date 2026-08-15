package operators;
import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a + b * c;
        System.out.println(d);
    }
}
