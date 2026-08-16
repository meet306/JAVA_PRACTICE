import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill;
        if(units<=100){
            bill = units *5;
        }else if(units <= 200){
            bill = (100*5)+((units-100)*100);
        }else if(units <= 300){
            bill = (100*5)+(100*7)+((units-200)*10);
        }else {
            bill = (100*5)+(100*7)+(100*10)+((units-300)*15);
        }
        System.out.println(bill);
    }
}
