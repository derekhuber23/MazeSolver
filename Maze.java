package cs2114.mazesolver;

//import java.util.Stack;

// -------------------------------------------------------------------------
/**
 * Maze Class
 *
 * @author derekhuber
 * @version Mar 22, 2016
 */
public class Maze
    implements IMaze
{
    private int            size;
    /**
     * maze thing
     */
    protected MazeCell[][] board;
    private ILocation      start;
    private ILocation      goal;
    //private ILocation      current;


    // ----------------------------------------------------------
    /**
     * Create a new Maze object.
     *
     * @param size
     *            the size
     */
    public Maze(int size)
    {
        this.size = size;
        board = new MazeCell[size][size];
        start = new Location(0, 0);
        goal = new Location(size - 1, size - 1);
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                board[i][j] = MazeCell.UNEXPLORED;
            }
        }

    }


    @Override
    public int size()
    {
        return this.size;
    }


    @Override
    public ILocation getStartLocation()
    {
        return this.start;
    }


    @Override
    public void setStartLocation(ILocation location)
    {
        this.start = location;
        if (board[location.x()][location.y()] == MazeCell.WALL)
        {
            board[location.x()][location.y()] = MazeCell.UNEXPLORED;
        }

    }


    @Override
    public ILocation getGoalLocation()
    {
        return this.goal;
    }


    @Override
    public void setGoalLocation(ILocation location)
    {
        this.goal = location;
        if (board[location.x()][location.y()] == MazeCell.WALL)
        {
            board[location.x()][location.y()] = MazeCell.UNEXPLORED;
        }

    }


    @Override
    public MazeCell getCell(ILocation location)
    {
        return board[location.x()][location.y()];
    }


    @Override
    public void setCell(ILocation location, MazeCell cell)
    {
        if (location == start && cell == MazeCell.WALL)
        {
            board[location.x()][location.y()] = MazeCell.UNEXPLORED;
        }
        board[location.x()][location.y()] = cell;
    }


    @Override
    public String solve()
    {
        /**
        Stack<ILocation> stack = new Stack<ILocation>();
        current = start;
        stack.push(start);
        while (stack.size() != 0)
        {
            board[current.x()][current.y()] = MazeCell.CURRENT_PATH;
            if (current == goal)
            {
                String solution = "";
                for (int i = 0; i < stack.size(); i++)
                {
                    solution += (stack.pop()).toString();
                }
                return solution;
            }
            else if (board[(current.south()).x()][(current.south())
                .y()] == MazeCell.UNEXPLORED
                || board[(current.east()).x()][(current.east())
                    .y()] == MazeCell.UNEXPLORED
                || board[(current.north()).x()][(current.north())
                    .y()] == MazeCell.UNEXPLORED
                || board[(current.west()).x()][(current.west())
                    .y()] == MazeCell.UNEXPLORED)
            {
                if (board[(current.south()).x()][(current.south())
                    .y()] == MazeCell.UNEXPLORED)
                {
                    current.south();
                    stack.push(current);
                }
                else if (board[(current.east()).x()][(current.east())
                    .y()] == MazeCell.UNEXPLORED)
                {
                    current.east();
                    stack.push(current);
                }
                else if (board[(current.north()).x()][(current.north())
                    .y()] == MazeCell.UNEXPLORED)
                {
                    current.north();
                    stack.push(current);
                }
                else if (board[(current.west()).x()][(current.west())
                    .y()] == MazeCell.UNEXPLORED)
                {
                    current.west();
                    stack.push(current);
                }

            }
            else
            {
                board[current.x()][current.y()] = MazeCell.FAILED_PATH;
                stack.pop();
            }
        }
        return "No solution";**/
        return null;
    }

}
