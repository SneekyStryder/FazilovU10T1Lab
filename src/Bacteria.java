import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int numInitial = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(numInitial, hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int numInitial, int hour)
    {
        if (hour == 0) {
            return numInitial;
        }

        long numLastHour = numBacteriaAlive(numInitial, hour - 1);
        return numLastHour + numLastHour * 2;
    }
}
