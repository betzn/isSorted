/*
isSorted.java

Write a method called isSorted that accepts an array of real numbers as
a parameter and returns true if the list is in sorted (nondecreasing) order
and false otherwise. For example, if arrays named list1 and list2 store
[16.1, 12.3, 22.2, 14.4] and [1.5, 4.3, 7.0, 19.5, 25.1,
46.2] respectively, the calls isSorted(list1) and isSorted(list2)
should return false and true respectively. Assume the array has at least
one element. A one-element array is considered to be sorted.

By Nathan Betz
*/

import java.io.*;

public class isSorted {
    
    public static void main(String args[]) {
        
        double[] list1 = {16.1, 12.3, 22.2, 14.4};
        
        double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        
        if (isSorted(list1)) {
            
			System.out.println("list1 is sorted");
			
		}
		
		else {
		    
			System.out.println("list1 is not sorted");
			
		}
		
		if (isSorted(list2)) {
		    
			System.out.println("list2 is sorted");
			
		}
		
		else {
		    
			System.out.println("list2 is not sorted");
			
		}
		
    }

    public static boolean isSorted(double[] list) {
    
        for(int i = 0; i < list.length -1; i++) {
            
            if(list[i+1] < list[i]) {
                
                return false;
                
            }
            
        }
        
        return true;
        
    }
        
}

