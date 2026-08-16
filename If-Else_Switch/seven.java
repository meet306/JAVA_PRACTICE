public class seven {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("The triangle is valid");
        } else {
            System.out.println("The triangle is not valid");
        }
    }
}
