import java.util.Arrays;
import java.util.Scanner;

public class OddOccurance {

	public static void main(String[] args) {
		int size_array;
		int i = 0;
		int occurance;
		int occurance_count = 0;
		
	    System.out.println("Enter array size in even number");
	    Scanner in = new Scanner(System.in);
	    size_array = in.nextInt();
	     
	    if (size_array % 2 == 0)
	    {
	    	System.out.println("OddOccurance Error : The number cannot be even.");
	    	//We need odd because the occurance need combination in odd number then plus with 1  = odd
	    	return;
	    }
	    
	    int[] array = new int[size_array];
	    System.out.println ("Enter number inside the array");
	    while (i != size_array)
        {
        	array[i] = in.nextInt();
        	i++;
        }
	    Arrays.sort(array);
	    head:
	    for (i = 0;i<array.length;i++)
	    {
	    	occurance = array[i];
	    	System.out.println ("checking for occurance : " + occurance);
	    	tail:
	    	for (int j=i+1;j<array.length;j++)
	    	{
	    		if (array[j] == occurance)
	    		{
	    			occurance_count++;
	    		
	    			System.out.println ("found occurance : " + occurance);
	    		}
	    		
	    		if (array[j] != occurance)
	    		{
	    			System.out.println ("Finish checking the occurance number");
	    			System.out.println ("total occurance_count : " + occurance_count);
	    			break tail;
	    		}
	    	}
	    	if (occurance_count % 2 == 0)
	    	{
	    		occurance_count = 0;
	    	} else {
	    		
	    	}
	    }

	}

}
