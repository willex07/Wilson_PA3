import java.util.Random;
import java.util.Scanner;

public class Problem1P3 {

    public static int question()
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


        if(answer != (n1*n2))
        {
            wrong();
            return 0;
        }
        else
            correct();
        return 1;
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
        for( i = 0; i < 10; i++)
        {
            q = q + 1;
            c= c + question();
            System.out.println("" + c + "/10");
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
