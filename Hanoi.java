
import java.util.Scanner;
public class Hanoi
{
    public static long moves;
    public static int towers;
    
    private static void header()
    {
        System.out.println("Vincent Lobo");
        System.out.println("M359");
        System.out.println("Tower of Hanoi");
    }
    
    public static void main()
    {
        moves = 0;
        header();
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("How many stacks would you like to solve?");
        towers = in.nextInt();
        System.out.println();
        solve(towers,'A', 'B', 'C');
        footer();
    }
    
    private static void solve(int stacks,char start, char temp, char dest)
    {
        if(stacks==1)
        {
           moves++;
           System.out.println(moves + ". " + start + " -> " + dest);
        }
        else
        {
           solve(stacks-1,start,dest,temp);
           moves++;
           System.out.println(moves + ". " + start + " -> " + dest);
           solve(stacks-1,temp,start,dest);
        }
    }
    
    private static void footer()
    {
        System.out.println("\n" + towers + " stacks takes " + moves + " moves to solve.");
    }
}
