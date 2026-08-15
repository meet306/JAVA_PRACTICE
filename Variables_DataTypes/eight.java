import java.util.Scanner;;
public class eight {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the temperature in celsius ");
       double c = sc.nextDouble();
       double f = (c*(9.0/5.0))+32;
       System.out.println("temperature in fahrenheit is " + f);
    }
}
