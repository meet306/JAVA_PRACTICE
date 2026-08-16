import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int a = sc.nextInt();

        System.out.print("Enter your number: ");
        int b = sc.nextInt();

        System.out.print("Enter your number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }   
        
    }
}
