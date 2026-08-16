public class eight {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a + b > c && b + c > a && c + a > b) {
            if(a==b && b==c){
                System.out.println("Equilateral");
            }
            else if(a==b || b==c || c==a){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        } else {
            System.out.println("The triangle is not valid");
        }
    }
}
