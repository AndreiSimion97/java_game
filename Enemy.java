/**
 *     Enemy Class
 * @author asimion
 */
package textgame;


public class Enemy {
    public static int sCacheRez = 0;
    public int mHealth;
    public int mPowerAttack;
    public int mRezistance;
    public int mMagicRezistance;
    public int mSpeedAttack;
    public int mPozX;
    public int mPozY;
    
    public static boolean isEnemy = true;
    
public Enemy(){
    this.mHealth = 10;
    this.mRezistance = 0;
    this.mPowerAttack = 2;
    this.mSpeedAttack = 0;
    this.mMagicRezistance = 0;
    this.sCacheRez = 2;
}

public void Stats(){
    System.out.println("Power Attack " + mPowerAttack);
    System.out.println("Health " + mHealth);
    System.out.println("Rezistance " + mRezistance);
    System.out.println("Magic Rezistance " + mMagicRezistance);
    System.out.println("Speed Attack " + mSpeedAttack);
}

public Player Attack(Player obj){
    //code here
   if( obj.sRezistance < this.mPowerAttack ){
        obj.sHealth = obj.sHealth - (this.mPowerAttack - obj.sRezistance); 
        obj.sRezistance -= this.mPowerAttack;
        if(obj.sRezistance <= 0){
           obj.sRezistance = obj.sCacheRez;
        }
    }else{
        obj.sRezistance = obj.sRezistance - this.mPowerAttack;
       
    }
    
    return obj;
}

}
