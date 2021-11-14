public class Main {
     
    public static void main(String[] args) {
        int ts = 9;
        Table(ts);
    }
     
    public static void Table(int ts) {
        System.out.format("     |");
        for(int i = 0; i<=ts;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
         
        for(int i = 0 ;i<=ts;i++) {
            System.out.format("%4d |",i);
            for(int a=0;a<=ts;a++) {
                System.out.format("%4d",i*a);
            }
            System.out.println();
        }
    }
     
}
