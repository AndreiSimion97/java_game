/**
 *  Main Class for the Game
 * @author asimion
 */
package textgame;

import java.util.*;
import java.io.*;

public class TextGame {

public static void main(String[] args) {
  
   Enemy ninja1 = new Ninja("Master", 2, 3);
   Enemy ninja2 = new Ninja("Ucenic", 2, 4);
   Player player = new Shaman("Urgot", 3, 5);
   player.Stats();
   ninja1.Attack(player).Stats();
}
    
}
