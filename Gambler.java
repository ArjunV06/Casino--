public class Gambler {
    private Die one;
    private Die two;
    private int money;
    private String name;
    public Gambler(String name_)
    {
        name=name_;
        one=new Die();
        two = new Die();
        money = 50;
    }
    public Gambler(String name_, int money_)
    {
        name=name_;
        money=money_;
        one = new Die();
        two = new Die();
    }

    public Die getDieOne()
    {
        return one;
    }
    public Die getDieTwo()
    {
        return two;
    }
    public int getMoney()
    {
        return money;
    }
    public int dieTotal()
    {

        return(one.see()+two.see());
    }
    public String getName()
    {
        return name;
    }
    public void rollDice()
    {
        one.roll();
        two.roll();
    }
    public void setName(String name_)
    {
        name=name_;
    }
    public void addMoney(int money_)
    {
        money+=money_;
    }
    public void takeMoney(int money_)
    {
        money-=money_;
    }
    public String toString()
    {
        String output="Name: " + name + "\nMoney: " + money + "\nDie1: " + one.see() + "\nDie2: " + two.see();
        return output;
    
    }

}
