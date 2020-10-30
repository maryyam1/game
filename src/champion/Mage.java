package champion;

/**
 * Created with IntelliJ IDEA.
 * User: asadi
 * Date: 10/26/20
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mage extends Champion {

    public Mage(String name, int speed) {
        super(name, speed);
        this.damage=300;
        this.health=200;
    }
    public void attack(Champion enemy){
        super.attack(enemy);

    }
    public void help(Champion friend){
        friend.health=friend.type==1?200:500;
    }
}
