/** Shaman Class
 * @author asimion
 */
package textgame;

public class Shaman extends Player{
    public static int sAbilityPower;
    public static String sName;
   
public void Stats(){
    System.out.println("Player name:"+ sName);
    System.out.println("Power Attack " + sAbilityPower);
    System.out.println("Health " + sHealth);
    System.out.println("Rezistance " + sRezistance);
    System.out.println("Magic Rezistance " + sMagicRezistance);
    System.out.println("Speed Attack " + sAttackSpeed);
    System.out.println("Player pozition: " + sPozX + " " + sPozY);
}    
    
public Shaman(String name, int pozX, int pozY){
    sName = name;
    sPozX = pozX;
    sPozY = pozY;
    sAbilityPower = 2;
}

public Enemy Attack(Enemy obj){
    
    if( obj.mRezistance < this.sAbilityPower ){
        obj.mHealth = obj.mHealth - (this.sAbilityPower - obj.mRezistance); 
        if(obj.mRezistance <= 0){
            obj.mRezistance = obj.sCacheRez;
        }
    }else{
        obj.mRezistance = obj.mRezistance - this.sAbilityPower;
    }
    
    return obj;
}

}
