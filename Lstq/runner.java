import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class runner {
	public static void main(String[] args) {
		List<Double> listA = new ArrayList<Double>();
		List<Double> listB = new ArrayList<Double>();
		double result = 0;
		
		//add elements to lists
		listA.addAll(Arrays.asList(4.5, 5.1, 6.2, 7.8));
		listB.addAll(Arrays.asList(1.1, -0.1, 6.1, 3.8));
		
		//call lstq
		result = lstq(listA, listB);
		
		//expected outcome 54.61
		System.out.println(result);
	}//main
	
	//takes in 2 integer lists and returns the distance given by the sum of the square
	//residuals between the numbers in the lists i.e take the ith element of listB from the
	//ith element of listA and square the result, then sum all of those results to get distance
	public static double lstq (List<Double> listA, List<Double> listB) {
		double lstq = 0.0;
		
		//check if the 2 lists are the same size
		if (listA.size() == listB.size()){
			//loop over every element
			for (int i = 0; i < listA.size(); i ++){
				//listA(i) - listB(i)
				double temp = listA.get(i) - listB.get(i);
				//square the value
				temp = temp*temp;
				//add the value to lstq
				lstq += temp;
			}//for
		}//if
		else {
			System.out.println("Lists are not the same size!");
		}//else
		return lstq;
	}//lstq
}//runner