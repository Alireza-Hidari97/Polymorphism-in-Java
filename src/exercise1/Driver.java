package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args)
    {


        List<Insurance> list =new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String userChoice="";

        Insurance insurance ;


        while(true)
        {
            double monthlyCost;

            System.out.println(" Stop the Application ? : 'YES/NO'");

            userChoice = scanner.nextLine();

            if(userChoice.equalsIgnoreCase("YES"))

                break;

            // Ask the user for his type of insurance

            System.out.print("What is your Type of Insurance: ");

            String insuranceType = scanner.nextLine();

            // Ask the user for his monthly payment

            System.out.print("What is your Monthly Cost: ");

            monthlyCost = scanner.nextDouble();

            scanner.nextLine();

            if(insuranceType.equalsIgnoreCase("Health"))
            {

                insurance = new Health();

                insurance.MonthlyCost(monthlyCost);

                insurance.displayInfo();

            }

            else if(insuranceType.equalsIgnoreCase("Life"))

            {

                insurance = new Life();

                insurance.MonthlyCost(monthlyCost);

                insurance.displayInfo();


            }
            else
            {
                System.out.println(" YOUR CHOICE IS INVALID, CHOOSE BETWEEN HEALTH OR LIFE");
            }


        }

    }

}
