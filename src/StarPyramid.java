public class StarPyramid {
    static char star = '*';
    static int line = 5;
    public static void main(String args[]){
        starone();
        startwo();
        starthree();
    }

    static void starone(){
        int starcount = 1;
        for(int i=1; i <= line; i++){
            for(int j=1; j <= line - i; j++)
                System.out.print(" ");

            int k = 1;
            while(k <= starcount){
                System.out.print("*");
                k++;
            }

            starcount++;

            System.out.println();
        }
        System.out.println();
    }

    static void startwo(){
        int starcount = line;
        for(int i=1; i <= line; i++){
            int k = 2;
            while(k <= i){
                System.out.print(" ");
                k++;
            }

            int j = 1;
            while(j <= starcount){
                System.out.print("*");
                j++;
            }
            starcount--;

            System.out.println();
        }
        System.out.println();
    }

    static void starthree(){
        int spacecount = line - 1;

        for(int i=1; i <= line; i++){
            int k = 1;
            while(k <= spacecount){
                System.out.print(" ");
                k++;
            }
            spacecount--;

            int j = i;
            while(j >= 1) {
                System.out.print("* ");
                j--;
            }

            System.out.println();
        }

        for(int i=1; i<= line; i++)
        {
            for(int j=0; j < i; j++){
                System.out.print(" ");
            }

            for(int j=0; j < line -i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
    }
}
//     *
//    ***
//   *****
//    ***
//     *
