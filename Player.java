/**
 * @author asimion
 */
package textgame;

public class Player {

    public static final boolean IS_PLAYER = true;

    protected static int sCacheRez = 0;
    protected static int sHealth;
    protected static int sAttackDamage;
    protected static int sRezistance;
    protected static int sMagicRezistance;
    protected static int sAttackSpeed;
    protected static int sPozX;
    protected static int sPozY;

    public Player() {
        sHealth = 20;
        sRezistance = 2;
        //sMagicRezistance = 0;
        sAttackDamage = 2;
        sAttackSpeed = 1;
        sPozX = 1;
        sPozY = 1;
    }

    public void Stats() {
        System.out.println("Power Attack " + sAttackDamage);
        System.out.println("Health " + sHealth);
        System.out.println("Rezistance " + sRezistance);
        System.out.println("Magic Rezistance " + sMagicRezistance);
        System.out.println("Speed Attack " + sAttackSpeed);
        System.out.println("Player pozition: " + sPozX + " " + sPozY);
    }

    public Enemy Attack(Enemy obj) {

        if (obj.mRezistance < this.sAttackDamage) {
            obj.mHealth = obj.mHealth - (this.sAttackDamage - obj.mRezistance);
            obj.mRezistance -= this.sAttackDamage;
            if (obj.mRezistance <= 0) {
                obj.mRezistance = obj.sCacheRez;
            }
        } else {
            obj.mRezistance = obj.mRezistance - this.sAttackDamage;
            /*if(obj.mRezistance <= 0){
           obj.mHealth = obj.mHealth - this.sAttackDamage; 
        }
        obj.mRezistance = 2;
             */
        }

        return obj;
    }

}
