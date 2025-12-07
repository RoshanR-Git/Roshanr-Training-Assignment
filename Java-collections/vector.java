package collections;

import java.util.*;
public class vector {

	public static void main(String[] args) 
	{
		Vector<Integer> vector = new Vector<>();
		vector.add(100);
		vector.add(120);
		vector.add(150);
		vector.add(200);
		for(int i=0;i<vector.size();i++)
		{
			System.out.print(vector.get(i) + " ");
		}
		System.out.println();
		System.out.println("The element in the respective index 3: " + vector.get(3));
		System.out.println("To search for the Element : "+ vector.contains(100));
		System.out.println("To remove a specific element: "+vector.remove(2));
		
		System.out.println("The elements that are present in the vectror: ");
		for(int i=0;i<vector.size();i++)
		{
			System.out.print(vector.get(i) + " ");
		}

	}

}
