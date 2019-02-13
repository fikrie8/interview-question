import java.util.Scanner;

public class Iterations {

    public static void main (String[] args) {
        
    	int number;
        int head;
        int tail;
        int longest_distance = 0;
        int distance = 0;
        String decimal;
        
        System.out.println ("Enter N");
        System.out.println ("It cannot exceed 2,147,483,648");
        
        Scanner in = new Scanner (System.in);        
        number = in.nextInt ();
        if (number < 0) {
            System.out.println ("Iterations Error: N not a positive number");
        } else {
            System.out.println ("Convert to binary is: " + Integer.toString (number,2));
        }
        decimal = Integer.toString (number,2);
        System.out.println ("Decimal length : " + decimal.length ());

        for (int i = 0; i < decimal.length(); i++)
        {
        	System.out.println ("now at value : " + decimal.charAt (i));
        	if (decimal.charAt (i) == '1')
        	{
        		System.out.println ("Header");
        		head = decimal.charAt (i);
        		
        		for (int j = i + 1; j< decimal.length(); j++)
        		{
        			if ((decimal.charAt(j) == '1') && (decimal.charAt(j-1) == '0'))  
        			{
        				
        				tail = decimal.charAt (j);
            			System.out.println ("we found the tail");
            			
            			if (longest_distance == 0)
            			{
            				longest_distance = j - i;
            				System.out.println ("" + j + "-" + i);
            			} else {
            				distance = j - i;
            				
            				System.out.println ("" + j + "-" + i);
            				System.out.println ("distance : " + distance);
            				System.out.println ("longest_distance : " + longest_distance);
            				if (distance > longest_distance)
            				{
            					longest_distance = distance;
            				}
            			}
        				
        				System.out.println ("Longest distance : " + longest_distance);
        				break;
        			}
        		}
        	}
        }
        if (longest_distance > 0)
        {
        	System.out.println (" Final longest distance : " + (longest_distance - 1));
        } else {
        	System.out.println (" Final longest distance : " + longest_distance);
        }
        	
    }
}

/*Note:
 * 
 * (2147483648 (D) or 7FFF,FFFF (H)) is the maximum positive value for a 32-bit signed binary integer in computing.
 * nextInt should already handle the unwanted data type
 */

