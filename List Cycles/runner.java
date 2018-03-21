import java.util.ArrayList;
import java.util.List;

public class runner {
	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		
		//add elements to listA
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);
		
		//copy listA
		listB.addAll(listA);
		
		//pass listA to lcycle
		//[1, 2, 3, 4, 5] -> [2, 3, 4, 5, 1]
		listA = lcycle(listA);
		
		//pass listB to rcycle
		//[1, 2, 3, 4, 5] -> [5, 1, 2, 3, 4]
		listB = rcycle(listB);
		
		System.out.println("lcycle: " + listA);
		System.out.println("rcycle: " + listB);
	}//main
	
	//takes in a list as input and returns a list cyclically shifted one place to the left
	public static List<Integer> lcycle(List<Integer> intList){
		int temp = intList.get(0); //get the first element of the list
		intList.remove(0); //remove the first element from the list
		intList.add(temp); //add temp to the end of the list
		return intList; //return new list
	}//lcycle
	
	//takes in a list as input and returns a list cyclically shifted one place to the right
	public static List<Integer> rcycle(List<Integer> intList){
		int temp = intList.get(intList.size() - 1); //get the last element of the list
		intList.remove(intList.size() - 1); //remove the last element of the list
		intList.add(0, temp); //add temp to the front of the list 
		return intList; //return new list
	}//rcycle
}//runner