package exercise2;

public abstract class GameTester {

    private String gameName;
    boolean isFullTime;

    // Abstract method creation

    public String getGameName(String testerName)
    {
        return gameName;

    }
    public void setGameName(String gameName )
    {
        this.gameName  = gameName;
    }

    public abstract double determineSalary ();

}
