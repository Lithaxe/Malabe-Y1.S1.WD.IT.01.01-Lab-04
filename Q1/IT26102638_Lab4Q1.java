import java.util.Scanner;

public class IT26102638_Lab4Q1
{

    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = input.nextInt();

        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }


    }

}


