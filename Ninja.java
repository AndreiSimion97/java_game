/**
 *  Ninja Class
 *
 * @author asimion
 */
package textgame;

public class Ninja extends Enemy {

    private final String mTypeNinja;
    private final int initRezistance = mRezistance;

    public Ninja(String type, int pozX, int pozY) {
        mTypeNinja = type;
        mRezistance = 2;
        mSpeedAttack = 3;
        mPozX = pozX;
        mPozY = pozY;
    }

    @Override
    public void Stats() {
        System.out.println("Ninja " + mTypeNinja);
        System.out.println("Power Attack " + mPowerAttack);
        System.out.println("Health " + mHealth);
        System.out.println("Rezistance " + mRezistance);
        System.out.println("Magic Rezistance " + mMagicRezistance);
        System.out.println("Speed Attack " + mSpeedAttack);
    }

}
