package exercise3;

public class BusinessMortgage extends Mortgage{

    public BusinessMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term)
    {
        super(mortgageNumber, customerName, amount, interestRate, term);

        //setting the interest rate to 1% over
        setInterestRate(getInterestRate() + 1);
    }
    public String toString()
    {
        String message2 =

                "Type: Business Mortgage "  +
                        " \n------------------------------------------------- " +
                        "\nMortgage Information: \n" + getMortgageInfo() +
                        " \n------------------------------------------------- ";

        return message2;

    }


}
