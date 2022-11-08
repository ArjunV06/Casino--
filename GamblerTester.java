import java.util.*;
public class GamblerTester {

    Gambler one;
    Gambler two;
    ArrayList<Gambler> peeps = new ArrayList<Gambler>();
    public GamblerTester()
    {
        one = new Gambler("Walter");
        two = new Gambler("Jesse", 1000);
        peeps.add(one);
        peeps.add(two);

    }
    public void test()
    {
        for(Gambler g : peeps)
        {
            System.out.println(g.getDieOne());
            System.out.println(g.getDieTwo());
            System.out.println(g.getMoney());
            System.out.println(g.dieTotal());
            g.rollDice();
            g.getName();
            System.out.println(g.dieTotal());
            g.setName("WALTUH");
            System.out.println(g.getName());
            g.addMoney(5000);
            System.out.println(g.getMoney());
            g.addMoney(50000);
            System.out.println(g.toString());
            System.out.println(g.getMoney());
            g.addMoney(500000);
            System.out.println(g.getMoney());
            g.takeMoney(8000);
            System.out.println(g.getMoney());
            g.takeMoney(7000);
            System.out.println(g.getMoney());
            g.takeMoney(430000);
            System.out.println(g.getMoney());
            System.out.println(g.toString());
            
  

        }
    }
}
