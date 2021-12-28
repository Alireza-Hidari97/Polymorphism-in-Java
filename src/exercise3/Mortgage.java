package exercise3;

public abstract class Mortgage implements MortgageConstants{

    private int mortgageNumber;
    private String customerName;
    private double amount;
    private double interestRate;
    private int term;

    // Getter for MortgageNumber

    public int getMortgageNumber()
    {
        return mortgageNumber;
    }
    // Setter for MortgageNumber

    public void setMortgageNumber(int mortgageNumber)
    {
        this.mortgageNumber = mortgageNumber;
    }

    // Getter for CustomerName
    public String getCustomerName()
    {
        return customerName;
    }
    // Setter for CustomerName

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    // Getter for Amount of Mortgage
    public double getAmount()
    {
        return amount;
    }
    // Setter for Amount of mortgage

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    // Getter for CustomerName
    public double getInterestRate()
    {
        return interestRate;
    }
    // Setter for CustomerName
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
    // Getter for term of mortgage
    public int getTerm()
    {
        return term;
    }
    // Setter for Term of mortgage

    public void setTerm(int term)
    {
        this.term = term;
    }
    // Constructor

    public Mortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term)
    {

        super();

        this.mortgageNumber = mortgageNumber;

        this.customerName = customerName;

        if(amount <= MAXAMOUNT)

            this.amount = amount;

        else

            this.amount =MAXAMOUNT;

        this.interestRate = interestRate;


        if (term == 1)
        {
            this.term = SHORTTERM;
        }
        else if (term == 3)
        {
            this.term = MIDTERM;
        }
        else if (term == 5)
        {
            this.term = LONGTERM;
        }
        else
        {
            System.out.println(" Invalid input, please choose between 1 or 3 or 5");

        }


    }
    // Method creation of Get Mortgage information

    public String getMortgageInfo()
    {

        return "Bank name: "+ BANK_NAME + "|" + "\nMortgage Number : " + mortgageNumber + "| " +
                "\nCustomer Name : " + customerName + "| " +
                "\nAmount : " + amount + "| " +
                "\nInterest Rate : " + interestRate + "| " +
                "\nTerm = " + term ;
    }




}
