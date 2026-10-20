import java.util.Scanner;

public class IT26102638_Lab4Q3
{

    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = input.nextInt();

        String result = (num > 0)? "Positive" : (num < 0)? "Negative" : "Zero";

        System.out.println(result);
    }

}