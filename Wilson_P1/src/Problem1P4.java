import java.util.Random;
import java.util.Scanner;

public class Problem1P4 {

    public static int question(int d) {
        int n1;
        int n2;
        int answer;
        int a = 0;

        Random r = new Random();
        Scanner scnr = new Scanner(System.in);
        switch(d)
        {
            case 1:
                n1 = r.nextInt(10);
                n2 = r.nextInt(10);
                System.out.println("How much is " + n1 + " times " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1*n2))
                {
                    wrong();
                    a = 0;
                    break;
                }
                else
                    correct();
                a = 1;
                break;
            case 2:
                n1 = r.nextInt(100);
                n2 = r.nextInt(100);
                System.out.println("How much is " + n1 + " times " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1*n2))
                {
                    wrong();
                    a = 0;
                    break;
                }
                else
                    correct();
                a = 1;
                break;
            case 3:
                n1 = r.nextInt(1000);
                n2 = r.nextInt(1000);
                System.out.println("How much is " + n1 + " times " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1*n2))
                {
                    wrong();
                    a = 0;
                    break;
                }
                else
                    correct();
                a = 1;
                break;
            case 4:
                n1 = r.nextInt(10000);
                n2 = r.nextInt(10000);
                System.out.println("How much is " + n1 + " times " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1*n2))
                {
                    wrong();
                    a = 0;
                    break;
                }
                else
                    correct();
                a = 1;
                break;

        }

        return a;
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
        int i;
        int q = 0;
        int c = 0;
        int d = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose a difficulty level for this session from 1-4 (1 = 1 digit, 2 = 2 digit, 3 = 3 digit, 4 = 4 digit)");
        d = scnr.nextInt();
        for( i = 0; i < 10; i++)
        {
            q = q + 1;
            c= c + question(d);
            System.out.println("" + c );
        }
        System.out.println("Your score is " + c + "/10");
        if(c < 8)
        {
            System.out.println("Please Ask Your Teacher For Extra Help.");
        }
        else if(c >= 8)
        {
            System.out.println("Congratulations, You Are Ready To Go To The Next Level!");
        }

    }

}