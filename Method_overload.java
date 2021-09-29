public class Method_overload {
    void sum(int a, int b){
        System.out.println(a + b);
    }
    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
    
    public static void main(String[] args) {
        Method_overload obj = new Method_overload();
        obj.sum(10, 12);
        obj.sum(10,12,14);
    }
}