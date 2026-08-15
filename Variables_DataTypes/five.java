import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a circle radius ");
        double r = sc.nextDouble();

        double a = 3.14*r*r;
        System.out.print("area of the circle is " + a);
    }
}
