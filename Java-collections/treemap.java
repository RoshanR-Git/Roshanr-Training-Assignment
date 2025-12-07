package collections;
import java.util.*;
public class treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(2, "CSE");
		map.put(3, "ECE");
		map.put(1, "IT");
		map.put(4, "Mech");
		map.put(5, "EIE");
		
		System.out.println("To verify if an element is present using Value: " + map.containsValue("ECE"));
		System.out.println("To verify if an element is present using Key: " + map.containsKey(8));
		System.out.println("To get an element from the structure: " + map.get(3));
		System.out.println("Print the elements in Ascending order:");
		
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			System.out.println("Key: " + entry.getKey()+"  Value: " + entry.getValue());
		}
		
		System.out.println();
		System.out.println("Print the elements in Descending order:");
		
		for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) 
		{
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}

}
