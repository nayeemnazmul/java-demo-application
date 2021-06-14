public class BijoyDibosh {
    public static void main(String args[]){
        int u = 5;
        for (int i = 1; i < 10; i+=2) {
            for (int j = 1; j < u; j++) {
                System.out.print(" ");
            }
            u--;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
