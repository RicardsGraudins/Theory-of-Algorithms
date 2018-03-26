import java.util.ArrayList;
import java.util.List;

public class runner {
	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		
		//add to list
		listA.add(1);
		listA.add(0);
		listA.add(1);
		listA.add(0);
		listA.add(1);
		listA.add(1);
		listA.add(1);
		listA.add(0);
		
		//call hammingWeight
		int num = hammingWeight(listA);
		//expected outcome: 5
		System.out.println(num);
	}//main
	
	//takes in a list and returns the number of non zero elements
	public static int hammingWeight(List<Integer> intList){
		int num = 0;
		for (Integer val: intList){
			if (val != 0){
				num++;
			}//if
		}//for
		return num;
	}//hammingWeight
}//runner