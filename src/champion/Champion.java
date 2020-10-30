package champion;

import weapon.*;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: asadi
 * Date: 10/26/20
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Champion {
    public String name;
    private int speed;
    protected int type;


    protected int health;
    protected int damage;
    private int stamina=100;

    public Weapon mainWeapon;
    private ArrayList<Clothing>cloth;

    public void  setMainWeapon(Weapon weapon){
        if (mainWeapon==null){
        this.mainWeapon=weapon;
        }

    }

    public void addClothToChampion(Clothing clot)  {
        this.cloth.add(clot);
        clot.owner=this;
        //asdfghjk
        //asdfghj
    }
    public Champion(String name, int speed){
        this.name=name;
        this.speed=10;
        this.type=0;
        cloth=new ArrayList<Clothing>();
    }
    public int clothCount( ){
        return cloth.size();}
    public int getHealth(){
        return health;
//        /fghjjjjjjjjjkjk
//        xcgbhjkkkkkkk
    }
    protected void attack(Champion enemy){
        enemy.health-=damage;
        stamina-=20;
        System.out.println("super class");
    }
    public void checkAndAttack(Champion enemy){
        if(stamina<=0)
        {  System.out.println("low stamina");
            return; }
        else attack(enemy);
    }
}
