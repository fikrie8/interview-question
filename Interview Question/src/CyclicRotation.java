import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {

	public static void main(String[] args) {
		
		int repetition;
		int size_array;
		int i = 0;
		int rotation_option;
		
		Scanner in = new Scanner (System.in);        
        
		System.out.println ("1. Rotate Right");
		System.out.println ("2. Rotate Left");
		rotation_option = in.nextInt ();
		if (rotation_option != 1 && rotation_option != 2)
		{
			System.out.println ("CyclicRotation Error : You can only select either 1 or 2");
			return;
		}
		System.out.println ("Enter size of array");
		size_array = in.nextInt ();
        int[] array = new int[size_array];
        System.out.println ("Enter number inside the array");
        while (i != size_array)
        {
        	array[i] = in.nextInt();
        	i++;
        }
        System.out.println ("Enter repetition");
        repetition = in.nextInt ();
        if (repetition < 0) {
            System.out.println ("CyclicRotation Error: N not a positive number");
        }
        System.out.print ("Before rotation : ");
        for (int j = 0; j< size_array;j++)
        {
        	System.out.print ("" + array[j]);
        }
        System.out.println ("");
        
        if (rotation_option == 1)
        {
        	while (repetition != 0)
        	{
        		array = RotateArrayRight (array);
        		repetition--;
        	}
        
        	System.out.print ("After right rotation :");
        	for (int j = 0; j< size_array;j++)
        	{
        		System.out.print ("" + array[j]);
        	}
        	System.out.println ("");
        } else {
        	while (repetition != 0)
            {
            	array = RotateArrayLeft (array);
            	repetition--;
            }
            
            System.out.print ("After left rotation :");
            for (int j = 0; j< size_array;j++)
            {
            	System.out.print ("" + array[j]);
            }
            System.out.println ("");
        }
	}
	
	public static int[] RotateArrayRight (int[] a) {
		  
		int tmp = 0;
		int[] new_array = new int[a.length];
		
		tmp = a[a.length - 1];
		System.out.println ("end array : " + tmp);
		for (int i=1; i < a.length; i++)
		{
			new_array[i] = a[i-1];
		}
		new_array[0] = tmp;	
		System.out.println ("Inside Rotation loop : ");
		for (int j = 0; j< new_array.length;j++)
	    {
	       	System.out.print ("" + new_array[j]);
	    }
		System.out.println ("");
		
		return new_array;
	}

	public static int[] RotateArrayLeft (int[] a) {
		  
		int tmp = 0;
		int[] new_array = new int[a.length];
		
		tmp = a[0];
		System.out.println ("starting array : " + tmp);
			
		for (int i=0; i < a.length-1; i++)
		{
			new_array[i] = a[i+1];
		}
		
		new_array[new_array.length-1] = tmp;		
		System.out.println ("Inside Rotation loop : ");
		
		for (int j = 0; j< new_array.length;j++)
	    {
	       	System.out.print ("" + new_array[j]);
	    }
		
		System.out.println ("");
		
		return new_array;
	}
}
