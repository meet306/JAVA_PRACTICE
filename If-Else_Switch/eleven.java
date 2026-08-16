public class eleven {
    public static void main(String[] args) {
        int a = 12;
        char op = '*';
        int b = 4;
        switch(op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
