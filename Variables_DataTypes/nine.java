import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit ");
        double f = sc.nextDouble();
        double c = (f-32)*(5.0/9.0);
        System.out.println("temperature in celsius is " + c);
    }
}
