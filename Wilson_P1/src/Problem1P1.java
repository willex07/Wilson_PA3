import java.util.Random;
import java.util.Scanner;
public class Problem1P1 {

    static void question()
    {
        int n1;
        int n2;
        int answer;
        Random r = new Random();
        Scanner scnr = new Scanner(System.in);
        n1 = r.nextInt(10);
        n2 = r.nextInt(10);
        System.out.println("How much is " + n1 + " times " + n2 + " = ? ");
        answer = scnr.nextInt();

        while(answer != (n1*n2))
        {
            System.out.println("No. Please Try Again. ");
            System.out.println("How much is " + n1 + " times " + n2 + " = ? ");
            answer = scnr.nextInt();

        }

        System.out.println("Very Good!");
    }

    public static void main(String[] args)
    {

        question();
    }

}
