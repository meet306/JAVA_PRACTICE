package operators;
import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int smallest = (a<b) ? a : b;
        System.out.println(smallest);


    }
    
}
