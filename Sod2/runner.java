import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class runner {
	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		List<Integer> listC = new ArrayList<Integer>();
		List<Integer> listD = new ArrayList<Integer>();
		
		//add elements to lists
		listA.addAll(Arrays.asList(0, 0, 0, 0, 1, 1, 1, 1));
		listB.addAll(Arrays.asList(0, 0, 1, 1, 0, 0, 1, 1));
		listC.addAll(Arrays.asList(0, 1, 0, 1, 0, 1, 0, 1));
		
		//call sod2
		listD = sod2(listA, listB, listC);
		
		//[0, 1, 1, 0, 1, 0, 0, 1]
		System.out.println(listD);		
	}//main
	
	//takes in three integer lists and returns a list containing a 1 where the number of 1's in a
	//given position in x, y, z contains an odd number of 1's, and 0 otherwise.
	public static List<Integer> sod2(List<Integer> listA, List<Integer> listB, List<Integer> listC){
		//create return list
		List<Integer> sod2 = new ArrayList<Integer>();
		
		//check if the 3 lists are the same size
		if (listA.size() == listB.size() && listB.size() == listC.size()){
			int sum = 0;
			
			//loop over every element
			for (int i = 0; i < listA.size(); i++){
				//add up all the elements of the 3 lists
				sum = listA.get(i) + listB.get(i) + listC.get(i);
				//if modulus remainder is 0, number is even
				if (sum % 2 == 0){
					//add 0 to list
					sod2.add(0);
					sum = 0;
				}//if
				else {
					//otherwise number is odd, add 1 to list
					sod2.add(1);
					sum = 0;
				}//else
			}//for
		}//if
		else {
			System.out.println("Lists are not the same size!");
		}//else
		return sod2;
	}//sod2
}//runner