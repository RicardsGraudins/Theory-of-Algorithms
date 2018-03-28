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
		
		//call maj
		listD = maj(listA, listB, listC);
		
		//[0, 0, 0, 1, 0, 1, 1, 1]
		System.out.println(listD);
	}//main
	
	//takes in three integer lists and returns a list containing a 1 where two or more
	//of the lists contain 1's, and 0 otherwise.
	public static List<Integer> maj(List<Integer> listA, List<Integer> listB, List<Integer> listC){
		//create return list
		List<Integer> maj = new ArrayList<Integer>();
		
		//check if the 3 lists are the same size
		if (listA.size() == listB.size() && listB.size() == listC.size()){
			int sum = 0;
			
			//loop over every element
			for (int i = 0; i < listA.size(); i++){
				//add up all the elements of the 3 lists
				sum = listA.get(i) + listB.get(i) + listC.get(i);
				//if the sum is greater than 1
				if (sum > 1){
					//add 1 to the list
					maj.add(1);
					sum = 0;
				}//if
				else {
					//add 0 to the list
					maj.add(0);
					sum = 0;
				}//else
			}//for
		}//if
		else {
			System.out.println("Lists are not the same size!");
		}//else
		return maj;
	}//maj
}//runner