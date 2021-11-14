import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
   
        System.out.print("Enter number:"); 
        int num = myObj.nextInt(); 
        myObj.close();

        if (num <= 5){
            if (num == 1)
                System.out.println("Welcome to menu 1."); 
            if (num == 2)
                System.out.println("Welcome to menu 2."); 
            if (num == 3)
                System.out.println("Welcome to menu 3."); 
            if (num == 4)
                System.out.println("Welcome to menu 4.");
            if (num == 5)
                System.out.println("Bye bye, see you tomorrow.");    
        }
        else{
            System.out.println("Not found.");  
        }
    }
}
