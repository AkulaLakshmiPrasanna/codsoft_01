import java.util.Scanner;
class ATMInterface
{
    public static void main(String[] args)
    {
        double b,w,d;
        b=100000;

        Scanner s1=new Scanner(System.in);
        while(true){
        System.out.print(" ATM ");
        System.out.println("\nPlease enter your choice ");
        System.out.print("\nChoose 1: Withdraw Money");
        System.out.print("\nChoose 2: Deposit Money");
        System.out.print("\nChoose 3: Check Balance");
        System.out.print("\nChoose 4: Exit");

        int e=s1.nextInt();
        switch(e)

        {
            case 1:
            System.out.println("Enter the money you want to withdraw:");
            w=s1.nextDouble();
            if(b>=w)
            {
                b=b-w;
                System.out.println("\nPlease collect your Amount");
            }
            else 
            {
                System.out.println("\nInsufficent Balance Avaliable");
            }
            break;

            case 2:
            System.out.println("\nEnter the amount you want to deposit");
            d=s1.nextDouble();
            b=b+d;
            System.out.println("\nYour amount is deposited successfully");
            System.out.println("\nAfter the  deposit balance Amount:"+b);
            break;

            case 3:
            System.out.println("\nCheck the Balance Amount:"+b);
            break;

            case 4:
            System.exit(0);   
        }
      }
    }
 }