package exercise;
import java.util.ArrayList;
public class List {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
        
        // Adding elements to object of List interface
        // Custom inputs
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1); 	// Print the elements inside the object

        // Now creating another object of the List 
        // interface implemented ArrayList class
        // Declaring object of integer type
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(4);
        l2.add(2);
        System.out.println(l2);
        l1.addAll(1, l2);		// Will add list l2 from 1 index
        System.out.println(l1);
//        // Removes element from index 1
//        l1.remove(1);	 // Printing the updated List 1
//        System.out.println(l1);
//        // Prints element at index 3 in list 1
//        // using get() method
//        System.out.println(l1.get(3));
//        // Replace 0th element with 5
//        // in List 1
//        l1.set(0, 2);
//        System.out.println(l1); // Again printing the updated List 1
        int size = l1.size();
        System.out.println(size);
//        for(int i=0; i<size; i++)
//        {
//        	for(int j=i+1; j<size; j++)
//        	{
//        		if(l1.get(i)==l1.get(j) && l1.get(j)<5)
//        		{
//        		System.out.print(l1.get(j)+" ");
//        		}
//        	}
//        }
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        for(int i=0; i<size; i++)
        {
        if(!l3.contains(l1.get(i)))
        	{
        	l3.add(l1.get(i));
        	}
        }
        System.out.println(l3);
	}
}
