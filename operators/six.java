package operators;
import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int r = a - (a/b)* b;
        System.out.println(r);

        
    }
}
