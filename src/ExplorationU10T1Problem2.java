public class ExplorationU10T1Problem2
{
    public static void main(String [] args)
    {
        System.out.println(simpleRecursiveDivision(8));
    }

    // this recursive method returns an int!
    public static int simpleRecursiveDivision(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        return num + simpleRecursiveDivision(num / 2);
    }
}
