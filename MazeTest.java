package cs2114.mazesolver;

// -------------------------------------------------------------------------
/**
 * Class here
 *
 * @author derekhuber
 * @version Mar 22, 2016
 */
public class MazeTest
    extends student.TestCase
{
    /**
     * maze m
     */
    Maze      m;
    /**
     * cell n
     */
    MazeCell  n;
    /**
     * start
     */
    ILocation start;
    /**
     * goal
     */
    ILocation goal;


    // ----------------------------------------------------------
    /**
     * Create a new MazeTest object.
     */
    public MazeTest()
    {
        // Empty
    }


    /**
     * Get setup
     */
    public void setUp()
    {
        m = new Maze(5);
        n = MazeCell.valueOf("UNEXPLORED");
    }


    // ----------------------------------------------------------
    /**
     * Method here
     */
    public void testSize()
    {
        assertEquals(5, m.size());
    }


    // ----------------------------------------------------------
    /**
     * Method
     */
    public void testGetStartLocation()
    {
        start = new Location(0, 0);
        assertEquals(start, m.getStartLocation());
    }


    // ----------------------------------------------------------
    /**
     * Method
     */
    public void testSetStartLocation()
    {
        start = new Location(1, 1);
        m.setStartLocation(start);
        assertEquals(start, m.getStartLocation());
        m.setCell(start, MazeCell.WALL);
        m.setStartLocation(start);
        assertEquals(MazeCell.UNEXPLORED, m.getCell(start));

    }


    // ----------------------------------------------------------
    /**
     * Test goal
     */
    public void testGetGoalLocation()
    {
        goal = new Location(4, 4);
        assertEquals(goal, m.getGoalLocation());

    }


    // ----------------------------------------------------------
    /**
     * test set
     */
    public void testSetGoalLocation()
    {
        goal = new Location(1, 1);
        m.setGoalLocation(goal);
        assertEquals(goal, m.getGoalLocation());
        m.setCell(goal, MazeCell.WALL);
        m.setGoalLocation(goal);
        assertEquals(MazeCell.UNEXPLORED, m.getCell(goal));

    }


    // ----------------------------------------------------------
    /**
     * test get
     */
    public void testGetCell()
    {
        // Empty
        assertEquals(5, m.size());
        Location wall = new Location(3, 3);
        m.setCell(wall, MazeCell.WALL);
        assertEquals(MazeCell.WALL, m.getCell(wall));

    }


    // ----------------------------------------------------------
    /**
     * method
     */
    public void testSetCell()
    {
        // Empty
        assertEquals(5, m.size());
        Location wall = new Location(3, 3);
        m.setCell(wall, MazeCell.WALL);
        assertEquals(MazeCell.WALL, m.getCell(wall));
        m.setCell(wall, MazeCell.UNEXPLORED);
        assertEquals(MazeCell.UNEXPLORED, m.getCell(wall));

    }


    // ----------------------------------------------------------
    /**
     * Method
     */
    public void testSolve()
    {
        assertEquals(null, m.solve());

    }

}
