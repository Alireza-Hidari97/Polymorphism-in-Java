package exercise2;
import java.sql.Time;
import java.util.Scanner;


public class ConsoleApp {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n ---------------------------------------------------------- \n");
            System.out.println(" Please enter the type of Game tester that you want to create  ");
            System.out.println("P: for part time");
            System.out.println("F: for full time");

            String userChoice = scan.nextLine();
            if(userChoice.equalsIgnoreCase("P"))
            {
                PartTimeGameTester partTime = new PartTimeGameTester();
                System.out.print("Please Enter The name of the tester: ");
                String testerName  = scan.nextLine();
                partTime.setGameName(testerName);

                System.out.print("Enter The total hour of the Part-Time tester: ");
                double hours = Double.parseDouble(scan.nextLine());
                partTime.isFullTime = false;
                partTime.setTotalHours(hours);
                System.out.println("\n The Salary of "+ partTime.getGameName(testerName) + " As a Part-time Tester is : $"+ partTime.determineSalary() );
                System.out.println("\n ---------------------------------------------------------- \n");

            }
            else if(userChoice.equalsIgnoreCase("F"))
            {
                FullTimeGameTester fullTime = new FullTimeGameTester();
                System.out.print("Please Enter The name of the tester: ");
                String testerName  = scan.nextLine();
                fullTime.setGameName(testerName);

                fullTime.isFullTime = true;
                System.out.println("The Salary of "+ fullTime.getGameName(testerName) + " As a Full-time Tester is : $"+ fullTime.determineSalary() );
                System.out.println("\n ---------------------------------------------------------- \n");
            }
            else
            {
                System.out.println("Your Choice is Invalid, Please, try again !!!");
                continue;
            }
            System.out.println("Do you want to continue (YES/NO)");
            String nextChoice = scan.nextLine();
            if(nextChoice.equalsIgnoreCase("YES"))
            {
                continue;
            }
            else
            {
                return;
            }
        }


    }

}
