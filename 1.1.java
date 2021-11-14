import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
   
    System.out.print("Enter value:"); 
    int num = myObj.nextInt();
    myObj.close();   
    if (num < 500) {
        System.out.println("Your value is too low"); 
    }else {
        System.out.println("Your value is high enough");   
    }     
  }
}