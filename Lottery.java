
/**
 * Class Lottery - Allows you to enter and draw a random user in the form of a lottery
 * 
 * @author Marius Norli 
 * @version 16.01.17
 */
import java.util.Random;
import java.util.HashMap;
public class Lottery
{
    Userbase dataBase = new Userbase();

    public Lottery()
    {
        
    }

    /**
     * Draws a random user from the the database
     * @return Returns the name of the winner as a String
     */
    public String Draw()
    {
        String index = dataBase.draw();
        
        return index;     
    }
    
    /**
     * Allows you to manually enter a new user into the lottery
     * @param name The name of the user you wish to add
     */
    public void addEntry(String name)
    {
        dataBase.addEntry(name);
    }
    
    /**
     * Returns the size of the lottery list
     * @return Returns the size of the list as an Integer
     */
    public int getSize()
    {
        int size = dataBase.getSize();
        
        return size;
    }
}
