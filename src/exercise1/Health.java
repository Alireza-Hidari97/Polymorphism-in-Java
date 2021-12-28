package exercise1;

public class Health extends Insurance{

    public Health()
    {
        super("Health");
    }

    @Override
    public void setInsuranceCost(double costs)
    {
        super.MonthlyCost(costs);
    }

    @Override
    public void displayInfo()
    {
        System.out.println("\n-----------   HEALTH INSURANCE    ------------\n ");
        System.out.println("\t Insurance Type: "+this.getTypeOfInsurance());
        System.out.println("\t Monthly Cost: " + this.getMonthlyCost());
        System.out.println("\n---------------------------------------------- \n");
    }


}
