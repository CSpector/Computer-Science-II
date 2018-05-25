/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;
import java.util.Random;
import rpg.Arena;
/**
 *
 * @author cbs262
 */
public class Berserker extends Combatant 
{
    
    public Berserker()
    {
        health = 35;
        damageType = 1;
    }
   
    public void takeDamage(int damage, int type)
    {
        int toTake;
        if (type == 2)
        {
            toTake = 2*damage;
        }
        if (type == 3)
        {
            toTake = (damage/2);
        }
        else
        {
            toTake = damage;
        }
        
        super.setHealth(toTake);
    }
    
    public void doDamage(Combatant[] combatants)
    {
        int damage = 20;
        Random rand = new Random();
        int target = rand.nextInt(6);
        combatants[target].takeDamage(damage, damageType);
        
    }
}
