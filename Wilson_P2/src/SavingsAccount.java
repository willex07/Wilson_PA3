public class SavingsAccount
{
    static private double annualInterestRate;
    private double savingBalance;

    public SavingsAccount(double savingBalance)
        {
            this.savingBalance=savingBalance;
        }

    public double getSavingBalance()
        {
            return this.savingBalance;
        }

    public void calculateMonthlyInterest()
        {
            double monthlyI;
            monthlyI= (this.savingBalance * annualInterestRate / 12);
            this.savingBalance += monthlyI;
        }
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }


    public static void main(String[] args)
    {
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2= new SavingsAccount (3000.0);
        SavingsAccount.modifyInterestRate (0.04);
        System.out.println("Balance For Saver 1");
        System.out.println("---------------------------------");
        for(int i=0; i<12; i++)
        {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1)+"= "+ String.format("%.2f",saver1.getSavingBalance()));
        }
        System.out.println("---------------------------------");
        System.out.println("Balance for Saver 2");
        System.out.println("---------------------------------");
        for(int i=0; i<12; i++)
        {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1)+"= "+ String.format("%.2f",saver2.getSavingBalance()));
        }
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("---------------------------------");
        System.out.println("Saver 1 interest rate changed to 0.05");
        System.out.println("---------------------------------");
        for(int i=0; i<12; i++)
        {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+"= "+ String.format("%.2f",saver1.getSavingBalance()));
        }
        System.out.println("---------------------------------");
        System.out.println("Saver 2 interest rate changed to 0.05");
        System.out.println("---------------------------------");
        for(int i=0; i<12; i++)
        {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1 )+"= "+ String.format("%.2f",saver2.getSavingBalance()));
        }

    }
}