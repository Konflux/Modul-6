/**
 * Class Userbase - Stores names as Strings and draws one of the stored names at random
 * 
 * @author Marius Norli
 * @version 16.01.17
 */
import java.util.Random;
import java.util.HashMap;
public class Userbase
{
    private HashMap<Integer, String> dataBase;

    private Random randGen;

    /**
     * Constructor for objects of class Userbase
     * 
     */
    public Userbase()
    {
        dataBase = new HashMap<>();

        randGen = new Random();

        //Fills the database with names
        fillBase();
    }

    /**
     * Fills the database with a list of predefined names and keys
     */
    private void fillBase()
    {
        dataBase.put(1, "Kjell");

        dataBase.put(2, "Kåre");

        dataBase.put(3, "Per");

        dataBase.put(4, "Trond");
    }

    /**
     * Returns the size of the lottery list
     * @return Returns the size of the list as an Integer
     */public int getSize()
    {
        int index = dataBase.size();

        return index;
    }

    /**
     * Randomly draws one of the users and returns it as a String
     * @return Returns the name of the winner as a String
     */
    public String draw()
    {
        Integer index = randGen.nextInt(dataBase.size());

        index ++;

        String winner = dataBase.get(index);

        return winner;
    }

    /**
     * Allows you to manually enter a new user into the lottery
     * @param name The name of the user you wish to add
     */
    public void addEntry(String name)
    {
        int index = dataBase.size();

        index ++;

        dataBase.put(index, name);
    }
    
    /**
     * Allows you to manually retreive which user is at the specified location
     * @param key The key that corresponds to a specific user
     */
    public String getEntry(int key)
    {
        String index = dataBase.get(key);
        
        return index;
    }
}
