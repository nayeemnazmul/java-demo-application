import java.util.Scanner;

public class Practice1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        Practice1 obj = new Practice1();
        int max = obj.findMax(number1, number2, number3);

        System.out.println("Max number is " + max);

        System.out.println("number1 = " + number1 + ", number2 = " + number2);
        System.out.println("after swap");
        doSwap(number1, number2);

    }

    int findMax(int number1, int number2){
        int max;

        if (number1 > number2)
            max = number1;
        else
            max = number2;

        return max;
    }
    int findMax(int number1, int number2, int number3){
        int max = findMax(number1, number2);

        if (max < number3)
            max = number3;

        return max;
    }
    static void doSwap(int number1, int number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("number1 = " + number1 + ", number2 = " + number2);
    }
//    non-static findmax
//    three integer comparison
//    swap integer
}
