/*
 * To change his license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DungeonCrawlStart;

/**
 * The hero class is an extension of the being class and is the main character in the game
 *
 * @author Chandler Parker
 */
public class Hero extends Being
{
    int strength = 10;
    public int health = 20;
    String name = "Hero";
    
    /**
     * The attack method attacks the monster by dropping the health of the monster by the attack of the hero 
     * 
     * @param m = Monster Object
     * @return the monsters health after it has been reduced
     */
    public int attack(Monster m)
    {
        m.health = m.health - this.strength;
        
        return m.health;
    }
    /**
     * Gets the heros health 
     * 
     * @return Hero Objects health
     */
    public int getHealth()
    {
        return this.health;
    }
    /**
     * Simple print method that creates a emotocon of a hero
     * 
     */
    public void emtoHero()
    {
        //20
        System.out.println("      _,.");
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,");
        System.out.println("  \\_| |`-._/||          ,'|");
        System.out.println("    |  `-, / |         /  /");
        System.out.println("    |     || |        /  /");
        System.out.println("     `r-._||/   __   /  /");
        System.out.println(" __,-<_     )`-/  `./  /");
        System.out.println("'  \\   `---'   \\   /  /");
        System.out.println("    |           |./  /");
        System.out.println("    /           //  /");
        System.out.println("\\_/' \\         |/  /");
        System.out.println(" |    |   _,^-'/  /");
        System.out.println(" |    , ``  (\\/  /_");
        System.out.println("  \\,.->._    \\X-=/^");
        System.out.println("  (  /   `-._//^`");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("          ()");
        
    }
}


