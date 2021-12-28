package exercise2;

public class PartTimeGameTester extends GameTester{

    private double hourlyRate = 20;
    private double totalHours;

    // getter for total Hours

    public double getTotalHours()
    {
        return totalHours;
    }

    // Setter for Total hours
    public void setTotalHours(double totalHours)
    {
        this.totalHours = totalHours;
    }


    @Override
    public double determineSalary()
    {
        double partTimesalary = hourlyRate * totalHours;
        return partTimesalary;

    }

}
