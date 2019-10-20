import java.util.Random;
import java.util.Scanner;

public class Problem1P2 {

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
            if(answer != (n1*n2))
            {
                wrong();
                System.out.println("How much is " + n1 + " times " + n2 + " = ? ");
                answer = scnr.nextInt();
            }

            }
            correct();

    }
    static void correct()
    {
        Random r = new Random();
        int c;
        c = r.nextInt(4);
        switch(c)
        {
            case 0:
                System.out.println("Very Good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Keep up the Good Work!");
                break;
            case 3:
                System.out.println("Nice Work!");
                break;
        }
    }
    static void wrong()
    {
        Random r = new Random();
        int w;
        w = r.nextInt(4);
        switch(w)
        {
            case 0:
                System.out.println("No. Please Try Again.");
                break;
            case 1:
                System.out.println("Wrong. Try Once More.");
                break;
            case 2:
                System.out.println("Don't Give Up!");
                break;
            case 3:
                System.out.println("No. Keep Trying.");
                break;
        }
    }

    public static void main(String[] args)
    {
       question();
    }

}

