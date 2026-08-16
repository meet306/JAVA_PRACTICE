import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary  = sc.nextInt();
        double tax;
        if(salary <= 250000){
            tax = 0;
        }else if(salary <=500000){
            tax = (salary - 250000)* 0.05;
        }else if(salary <= 1000000){
            tax = (250000*0.05) + (salary-500000) * 0.20;
        }else{
            tax = (250000*0.05) + (500000 *0.20) + (1000000 * 0.30);
        }
        System.out.println(tax);
    }
}
