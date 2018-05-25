/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;
import rpg.Arena;

/**
 *
 * @author cbs262
 */
public class Combatant 
{
    int health;
    int damageType;
    
    public Combatant()
    {
        health = 0;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setHealth(int damage)
    {
        health -= damage;
    }
    
    public boolean checkAlive()
    {
        if (health <= 0)
        {
            return false;
        }
        return true;
    }
    
}
