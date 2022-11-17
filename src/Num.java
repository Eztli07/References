public class Num
{
    private int value;
    //------------------------------------------------------------
    //  Sets up the num object, storing an initial value.
    //------------------------------------------------------------
    public Num (int update)
    {
        value = update;
    }
    //------------------------------------------------------------
    //  Returns the stored integer value
    //------------------------------------------------------------
    public int getValue ()
    {
        return value;
    }
    //------------------------------------------------------------
    //  Sets the stored value to the newly specified value
    //------------------------------------------------------------
    public void setValue (int update)
    {
        value = update;
    }
    //------------------------------------------------------------
    //  Returns the shared integer value as a string
    //------------------------------------------------------------
    public String toString ()
    {
        return value + "";
    }
}
