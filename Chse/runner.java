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
		
		//call chse
		listD = chse(listA, listB, listC);
		
		//[0, 1, 0, 1, 0, 0, 1, 1]
		System.out.println(listD);
	}//main
	
	//takes in three integer lists and returns a list containing the elements of listB in the
	//positions where listA is 1 and the elements of listC otherwise.
	public static List<Integer> chse(List<Integer> listA, List<Integer> listB, List<Integer> listC){
		//create return list
		List<Integer> chse = new ArrayList<Integer>();
		
		//check if the 3 lists are the same size
		if (listA.size() == listB.size() && listB.size() == listC.size()){			
			//loop over every element
			for (int i = 0; i < listA.size(); i++){
				//check if listA[i] = 1
				if (listA.get(i) == 1){
					//add listB element at i to list
					chse.add(listB.get(i));
				}//if
				else {
					//otherwise add listC element at i to list
					chse.add(listC.get(i));
				}//else
			}//for
		}//if
		else {
			System.out.println("Lists are not the same size!");
		}//else
		return chse;
	}//chse
}//runner