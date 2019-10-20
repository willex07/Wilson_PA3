import java.util.Random;
import java.util.Scanner;

public class Problem1Final {

    public static int addition(int d) {
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
                System.out.println("How much is " + n1 + " plus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1+n2))
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
                System.out.println("How much is " + n1 + " plus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1+n2))
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
                System.out.println("How much is " + n1 + " plus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1+n2))
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
                System.out.println("How much is " + n1 + " plus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1+n2))
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

    public static int subtraction(int d) {
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
                System.out.println("How much is " + n1 + " minus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1-n2))
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
                System.out.println("How much is " + n1 + " minus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1-n2))
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
                System.out.println("How much is " + n1 + " minus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1-n2))
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
                System.out.println("How much is " + n1 + " minus " + n2 + " = ? ");
                answer = scnr.nextInt();
                if(answer != (n1-n2))
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
    public static int multiplication(int d) {
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
    public static int division (int d) {
        double n1;
        double n2;
        double answer;
        int a = 0;

        Random r = new Random();
        Scanner scnr = new Scanner(System.in);
        switch(d)
        {
            case 1:
                n1 = r.nextInt(10);
                n2 = r.nextInt(10);
                System.out.println("How much is " + n1 + " divided by " + n2 + " = ? ");
                answer = scnr.nextDouble();
                if(answer != (n1/n2))
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
                System.out.println("How much is " + n1 + " divided by " + n2 + " = ? ");
                answer = scnr.nextDouble();
                if(answer != (n1/n2))
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
                System.out.println("How much is " + n1 + " divided by " + n2 + " = ? ");
                answer = scnr.nextDouble();
                if(answer != (n1/n2))
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
                System.out.println("How much is " + n1 + " divided by " + n2 + " = ? ");
                answer = scnr.nextDouble();
                if(answer != (n1/n2))
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
        int type = 0;
        int random;
        char cont = 'y';
        Random r = new Random();
        Scanner scnr = new Scanner(System.in);
        while(cont == 'y')
        {
            System.out.println("Choose a difficulty level for this session from 1-4 (1 = 1 digit, 2 = 2 digit, 3 = 3 digit, 4 = 4 digit)");
            d = scnr.nextInt();
            System.out.println("Choose which type of arithmetic you would like to practice.(1 = addition, 2 = subtraction, 3 = multiplication, 4 = division, 5 = random)");
            type = scnr.nextInt();
            for (i = 0; i < 10; i++) {
                switch (type) {
                    case 1:
                        q = q + 1;
                        c = c + addition(d);
                        System.out.println("" + c);
                        break;
                    case 2:
                        q = q + 1;
                        c = c + subtraction(d);
                        break;
                    case 3:
                        q = q + 1;
                        c = c + multiplication(d);
                        break;
                    case 4:
                        q = q + 1;
                        c = c + division(d);
                        break;
                    case 5:
                        random = r.nextInt(4);
                        switch (random) {
                            case 0:
                                q = q + 1;
                                c = c + addition(d);
                                break;
                            case 1:
                                q = q + 1;
                                c = c + subtraction(d);
                                break;
                            case 2:
                                q = q + 1;
                                c = c + multiplication(d);
                                break;
                            case 3:
                                q = q + 1;
                                c = c + division(d);
                                break;
                        }
                }
            }
            System.out.println("Your score is " + c + "/10");
            if (c < 8) {
                System.out.println("Please Ask Your Teacher For Extra Help.");
            } else if (c >= 8) {
                System.out.println("Congratulations, You Are Ready To Go To The Next Level!");
            }
            System.out.println("Would you like to continue? (y/n)");
            cont = scnr.next().charAt(0);
        }

        System.out.println("Goodbye!");

    }

}
