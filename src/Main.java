import champion.*;
import weapon.*;

/**
 * Created with IntelliJ IDEA.
 * User: asadi
 * Date: 10/27/20
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==POWERRENGER==");
        Champion c1=new Support("rostam",10);
        Champion c2=new Archer("Arash",10);
        Helmet h=new Helmet();
        c1.addClothToChampion(h);
        Weapon s1=new Sword("divine sword");
        Weapon s2=new Sword("lunar sword");
        c1.setMainWeapon(s1);
        c1.setMainWeapon(s2);
        System.out.println(c1.clothCount());
    }
}
