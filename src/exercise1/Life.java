package exercise1;

public class Life extends Insurance {

    public Life()
    {
        super("Life");
    }

    @Override
    public void setInsuranceCost(double costs)
    {
        super.MonthlyCost(costs);
    }

    @Override
    public void displayInfo()
    {
        System.out.println("\n -----------    LIFE INSURANCE     ------------ \n");
        System.out.println("\tInsurance Type: "+this.getTypeOfInsurance());
        System.out.println("\tMonthly Cost: " + this.getMonthlyCost());
        System.out.println("\n----------------------------------------------\n ");
    }

}
