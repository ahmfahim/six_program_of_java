public class Constractor {
    int x;
  
    public Constractor(int y) {
      x = y;
    }
    public static void main(String[] args) {
    Constractor myObj = new Constractor(5);
      System.out.println(myObj.x);
    }
  }