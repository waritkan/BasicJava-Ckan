public class Main {
    public static void main(String[] args) {
      int i = 1;
      int a = 1;
      while (i < 1000000) {
        i*=2;
        a++;
      }
      System.out.println("Vader have saved 1,000,000 Bath in " + a + " days.");
    }
  }