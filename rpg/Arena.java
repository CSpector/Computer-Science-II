package rpg;

import java.util.ArrayList;
import java.util.Random;

class Arena {
    public ArrayList<Combatant> combatants = new ArrayList();
    public Arena() {
    }

    public void add(Combatant contestant) 
    {
        combatants.add(contestant);
    }

    public void playRound() {
    }

    public String getDescription() {
    }

    public Combatant getWinner() {
    }

    // Private
    private void checkVictor() {
    }

}
