import java.util.Scanner;
public class ten {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter a amount ");
        int p = sc.nextInt();

        System.out.print("enter a intrest");
        int r = sc.nextInt();

        System.out.print("enter a time period ");
        int t = sc.nextInt();

        int si = (p*r*t)/100;
        System.out.print("simple interest is " + si);



    }
}
