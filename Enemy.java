/**
 *     Enemy Class
 *
 * @author asimion
 */
package textgame;

public class Enemy {

    protected static int sCacheRez = 0;
    protected int mHealth;
    protected int mPowerAttack;
    protected int mRezistance;
    protected int mMagicRezistance;
    protected int mSpeedAttack;
    protected int mPozX;
    protected int mPozY;

    public static boolean isEnemy = true;

    public Enemy() {
        mHealth = 10;
        // mRezistance = 0;
        mPowerAttack = 2;
        // mSpeedAttack = 0;
        mMagicRezistance = 0;
        sCacheRez = 2;
    }

    public void Stats() {
        System.out.println("Power Attack " + mPowerAttack);
        System.out.println("Health " + mHealth);
        System.out.println("Rezistance " + mRezistance);
        System.out.println("Magic Rezistance " + mMagicRezistance);
        System.out.println("Speed Attack " + mSpeedAttack);
    }

    public Player Attack(Player obj) {
        //code here
        if (obj.sRezistance < this.mPowerAttack) {
            obj.sHealth = obj.sHealth - (this.mPowerAttack - obj.sRezistance);
            obj.sRezistance -= this.mPowerAttack;
            if (obj.sRezistance <= 0) {
                obj.sRezistance = obj.sCacheRez;
            }
        } else {
            obj.sRezistance = obj.sRezistance - this.mPowerAttack;
        }

        return obj;
    }

}
