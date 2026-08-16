public class ten {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if((a>b && a<c) || (a<b && a>c)){
            System.out.println("a is the middle element");
        }else if((b>a && b<c) || (b<a && b>c)){
            System.out.println("b is the middle element");
        }else{
            System.out.println("c is the middle element");
        }
    }
}
