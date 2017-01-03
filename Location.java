package cs2114.mazesolver;

// -------------------------------------------------------------------------
/**
 * This is class
 *
 * @author derekhuber
 * @version Mar 22, 2016
 */
public class Location
    implements ILocation
{
    private int x;
    private int y;


    // ----------------------------------------------------------
    /**
     * Create a new Location object.
     *
     * @param x
     *            is x
     * @param y
     *            is y
     */
    public Location(int x, int y)
    {
        this.x = x;
        this.y = y;
    }


    /**
     * Get x
     *
     * @return the x
     */
    public int x()
    {
        return this.x;
    }


    /**
     * Get y
     *
     * @return the y.
     */
    public int y()
    {
        return this.y;
    }


    /**
     * Get north
     *
     * @return the north.
     */
    public ILocation north()
    {
        this.y = this.y - 1;
        Location north1 = new Location(this.x, this.y);
        return north1;
    }


    /**
     * Get south
     *
     * @return the south.
     */
    public ILocation south()
    {
        this.y = this.y + 1;
        Location south1 = new Location(this.x, this.y);
        return south1;
    }


    /**
     * Get west
     *
     * @return the west.
     */
    public ILocation west()
    {
        this.x = this.x - 1;
        Location west1 = new Location(this.x, this.y);
        return west1;
    }


    /**
     * Get east
     *
     * @return the east.
     */
    public ILocation east()
    {
        this.x = this.x + 1;
        Location east1 = new Location(this.x, this.y);
        return east1;
    }


    /**
     * Get this
     *
     * @param obj
     *            object thing
     * @return the equals.
     */
    public boolean equals(Object obj)
    {
        if (obj instanceof Location)
        {
            if (this.x() == ((Location)obj).x()
                && this.y() == ((Location)obj).y())
            {
                return true;
            }
        }
        return false;
    }


    /**
     * Get string
     *
     * @return the strings.
     */
    public String toString()
    {
        String str = "(" + this.x + ", " + this.y + ")";
        return str;
    }

}
