package champion;

/**
 * Created with IntelliJ IDEA.
 * User: asadi
 * Date: 10/26/20
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Archer extends Champion {
    private int arrow=100;
    public int getArrow (){
        return arrow;
    }
    public Archer(String name, int speed) {
        super(name, speed);
        this.damage=50;
        this.health=200;
        this.type=1;
    }
    public void  attack(Champion enemy){
        super.attack(enemy);
        this.arrow--;
        System.out.println("Champion.Archer class");
    }
    public void  wrongAttack(){
        this.arrow--;
    }
}
