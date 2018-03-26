import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class runner {
	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		
		//add to lists
		listA.addAll(Arrays.asList(1, 0, 1, 0, 1, 1, 1, 0));
		listB.addAll(Arrays.asList(1, 1, 1, 1, 0, 0, 0, 0));
		
		//expected outcome: 5
		int distance = hammingDistance(listA, listB);
		System.out.println("Hamming Distance: " + distance);
	}//main
	
	//takes in two integer lists and returns the number of positions in which they differ
	public static int hammingDistance(List<Integer> listA, List<Integer> listB){
		int distance = 0;
		//check if both lists are the same size
		if (listA.size() == listB.size()){
			//loop over every element
			for (int i = 0; i < listA.size(); i++){
				//if the elements are not the same increment distance
				if (!listA.get(i).equals(listB.get(i))){
					distance++;
				}//if
			}//for
		}//if
		else {
			System.out.println("Lists are different sizes!");
		}//else
		return distance;
	}//hammingDistance
}//runner