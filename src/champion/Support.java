package champion;

/**
 * Created with IntelliJ IDEA.
 * User: asadi
 * Date: 10/26/20
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Support extends Champion {
    public Support(String name, int speed) {
        super(name, speed);
        this.damage=30;
        this.health=500;
        this.type=2;
    }
    public void attack(Champion enemy){
        super.attack(enemy);
        System.out.println("Champion.support class");
    }

}
