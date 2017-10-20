/**
 * @author asimion
 */
package textgame;


public class Player {
    public static final boolean IS_PLAYER = true;
    
    public static int sCacheRez = 0;
    public static int sHealth;
    public static int sAttackDamage;
    public static int sRezistance;
    public static int sMagicRezistance;
    public static int sAttackSpeed;
    public static int sPozX;
    public static int sPozY;
    
public Player(){
    this.sHealth = 20;
    this.sRezistance = 2;
    this.sMagicRezistance = 0;
    this.sAttackDamage = 2;
    this.sAttackSpeed = 1;
    this.sPozX = 1;
    this.sPozY = 1;
}

public void Stats(){
    System.out.println("Power Attack " + sAttackDamage);
    System.out.println("Health " + sHealth);
    System.out.println("Rezistance " + sRezistance);
    System.out.println("Magic Rezistance " + sMagicRezistance);
    System.out.println("Speed Attack " + sAttackSpeed);
    System.out.println("Player pozition: " + sPozX + " " + sPozY);
}

public Enemy Attack(Enemy obj){
    
    if( obj.mRezistance < this.sAttackDamage ){
        obj.mHealth = obj.mHealth - (this.sAttackDamage - obj.mRezistance); 
        obj.mRezistance -= this.sAttackDamage;
        if(obj.mRezistance <= 0){
           obj.mRezistance = obj.sCacheRez;
        }
    }else{
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
