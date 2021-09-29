public class Hello {
    public static void main(String [] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        if (a > b && a > c) {
            System.out.println("A is large");
        }
        else if (b > a && b > c) {
            System.out.println("B is large");
        }
        else {
            System.out.println("c is large");
        }
    }
}