package exercise1;

public abstract class Insurance {

    // Fields declaration

    private String typeOfInsurance;
    private double monthlyCost;

    // Default Constructor
    public Insurance()
    {

    }
    // User defined Constructor

    public Insurance(String typeOfInsurance)
    {
        this.typeOfInsurance = typeOfInsurance;
    }

    public void MonthlyCost(double monthlyCost)
    {
        this.monthlyCost = monthlyCost;
    }


    public String getTypeOfInsurance()
    {
        return typeOfInsurance;
    }

    public double getMonthlyCost()
    {
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double costs);
    public abstract void displayInfo();

}
