public class LoopTask {
    static int FRIDAY = 1;
    static int DEAD = 9;
    public static void main(String args[]){
        int day = 1;
        while (day < 11) {
            System.out.println("Day " + day + " Starts");

            if(day == DEAD) break;

            System.out.println("Now it is day " + day);

            if (day == 6 || day == 7) {
                day++;
                continue;
            }

            System.out.println("Prayer");
            System.out.println("Eating");

            if(day != FRIDAY)
                System.out.println("Job");

            if(day == 3)
                System.out.println("Need to go bank");

            System.out.println("Personal Time");
            System.out.println("Sleep");

            day++;
        }
    }
}
