package cs2114.mazesolver;

// import java.lang.reflect.Array;

// -------------------------------------------------------------------------
/**
 * Class here
 *
 * @author derekhuber
 * @version Mar 22, 2016
 */
public class LocationTest
    extends student.TestCase
{
    /**
     * location l
     */
    Location l;
    /**
     * location i
     */
    Location i;
    /**
     * maze m
     */
    Maze     m;


    // ----------------------------------------------------------
    /**
     * Create a new LocationTest object.
     */
    public LocationTest()
    {
        // Empty
    }


    /**
     * Get setup
     */
    public void setUp()
    {
        l = new Location(5, 5);
        i = new Location(5, 5);
    }


    // ----------------------------------------------------------
    /**
     * test x
     */
    public void testX()
    {
        assertEquals(5, l.x());
    }


    // ----------------------------------------------------------
    /**
     * test y
     */
    public void testY()
    {
        assertEquals(5, l.y());
    }


    // ----------------------------------------------------------
    /**
     * test north
     */
    public void testNorth()
    {
        l.north();
        assertEquals(4, l.y());
    }


    // ----------------------------------------------------------
    /**
     * test south
     */
    public void testSouth()
    {
        l.south();
        assertEquals(6, l.y());
    }


    // ----------------------------------------------------------
    /**
     * test east
     */
    public void testEast()
    {
        l.east();
        assertEquals(6, l.x());
    }


    // ----------------------------------------------------------
    /**
     * test west
     */
    public void testWest()
    {
        l.west();
        assertEquals(4, l.x());
    }


    // ----------------------------------------------------------
    /**
     * test equals
     */
    public void testEquals()
    {
        assertEquals(true, l.equals(i));
        i.east();
        assertEquals(false, l.equals(i));
        assertEquals(false, l.equals(m));
    }


    // ----------------------------------------------------------
    /**
     * test to string
     */
    public void testToString()
    {
        String str = "(5, 5)";
        assertEquals(str, l.toString());
    }
}
