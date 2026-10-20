import java.util.Scanner;

public class IT26102638_Lab4Q2{

    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
        float exam_mark, lab_mark;
        float exam_perc, lab_perc;

        System.out.println("Enter your exam marks out of 100: ");
        exam_mark = input.nextInt();

        if(exam_mark > 100){
            System.out.println("Invalid exam mark, terminating program.");
            return;
        }

        System.out.println("Enter lab submission marks out of 100: ");
        lab_mark = input.nextInt();

        if(lab_mark > 100){
            System.out.println("Invalid lab mark, terminating program.");
            return;
        }

        System.out.println("Enter percentage given for the exam: ");
        exam_perc = input.nextInt();

        System.out.println("Enter percentage given for the lab submissions: ");
        lab_perc = input.nextInt();

        if(exam_perc + lab_perc > 100){
            System.out.println("Percentages must add upto 100. Terminating program");
            return;
        }

        float final_mark;
        final_mark = (exam_perc/100 * exam_mark)+(lab_perc/100 * lab_mark);
        System.out.println("Final exam mark is: " + final_mark);
    }
}