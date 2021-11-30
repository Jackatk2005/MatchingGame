public class DifficultyChecker
{
    private String difficulty;
    private int num;

    public DifficultyChecker(String d)
    {
        difficulty = d;
    }

    public int check()
    {
        if(difficulty.equalsIgnoreCase("easy"))
        {
            num = 1;
        } 
        else if(difficulty.equalsIgnoreCase("medium"))
        {
            num = 2;
        }
        else if(difficulty.equalsIgnoreCase("hard"))
        {
            num = 3;
        }
        return num;
    }
}