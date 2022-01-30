package Try_catch_block;


public class try_catch 
{
    public static void main(String args[]) 
    {
       
        try 
        {
            int res = 3/0;
        }
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException"); 
        }
        finally 
        {
            System.out.println("Try_Catch Completed");
        }
    }
}