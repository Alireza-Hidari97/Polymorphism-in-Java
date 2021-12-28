package exercise3;
import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args)
    {

        Mortgage[] mortgages = new Mortgage[3];

        int choice;

        int number=0;

        String name="";

        double amount=0.0;

        double interestRate=0.0;

        int term;

        Scanner scan = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {

            System.out.println("\n Please Choose the type of  Mortgage:");

            System.out.println("1.Personal");
            System.out.println("2.Business");
            System.out.println(" \n------------------------------------------------- ");


            choice = scan.nextInt();

            if(choice==1)
            {

                System.out.print(" Enter Mortgage Number: ");

                number = scan.nextInt();

                System.out.print("\n Enter Customer's name: ");

                name = scan.next();

                System.out.print("\n Enter Mortgage amount: ");

                amount = scan.nextDouble();

                System.out.print("\n Enter the  interest Rate: ");

                interestRate = scan.nextDouble();

                System.out.print("\n Enter the number of term in years: ");

                term = scan.nextInt();

                Mortgage newPersonalMortgage =new PersonalMortgage(number,name,amount,interestRate,term);

                mortgages[i]= newPersonalMortgage;

                System.out.println(" \n------------------------------------------------- ");
            }

            if(choice == 2)
            {

                System.out.print(" Enter Mortgage Number: ");

                number=scan.nextInt();

                System.out.print("\n Enter Customer's name: ");

                name=scan.next();

                System.out.print("\n Enter Mortgage amount: ");

                amount=scan.nextDouble();

                System.out.print("\n Enter the  interest Rate: ");

                interestRate = scan.nextDouble();

                System.out.print("\n Enter the number of term in years: ");

                term = scan.nextInt();

                Mortgage newBusinessMortgage =new BusinessMortgage(number,name,amount,interestRate,term);

                mortgages[i]= newBusinessMortgage;

                System.out.println(" \n------------------------------------------------- ");

            }

        }

        for(int i=0;i<3;i++)

        {
            System.out.println(mortgages[i].toString());
            System.out.println(" \n------------------------------------------------- ");
        }
    }

}
