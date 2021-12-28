package exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term)
    {

        super(mortgageNumber, customerName, amount, interestRate, term);

        //setting the interest rate to 1% over
        setInterestRate(getInterestRate() + 2);

    }



    @Override
    public String toString()
    {
        String message =

                "Type: Personal Mortgage "+
                        " \n------------------------------------------------- " +
                        "\nMortgage Information: \n" + getMortgageInfo() +
                        " \n------------------------------------------------- ";

        return message;

    }

}
