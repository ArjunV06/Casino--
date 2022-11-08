public class Die
{
    private int num;
    private int sides;
    Die()
    {
        sides = 6;
        num = sides;
    }
    Die(int sides_)
    {
        sides=sides_;
        num = sides;
        
        
    }
    public void roll()
    {
        num = (int)(Math.random()*sides)+1;
    }
    public int getSides()
    {
        
        return sides;
    }
    
    public int see()
    {
        
        return num;
    }
    
    public void seeDisplay()
    {
        System.out.println("You rolled a: " + num);

    }
    public void changeSides(int newSide)
    {
        sides = newSide;
    }
    public String toString()
    {
        String returner ="NUM = ";
        returner+=num;
        returner+="\nSIDES = ";
        returner+=sides;
        return returner;
    }
}