import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class runner {
	
	//rough work for collatz-list
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		List<Integer> listo = new ArrayList<Integer>();
		
		//add the num to the list before any calculations
		listo.add(num);
		
		//keep going until the num is 1
		while(num != 1){
			//check if num is even, if it divide by 2
			if(num % 2 == 0){
				num = num / 2;
				//add to list
				listo.add(num);
			}
			else {
				//if num is not even its odd, multiply by 3 and add 1
				num = num * 3 + 1;
				//add to list
				listo.add(num);
			}
		}
		
		System.out.println("\nList Contents:");
		System.out.println("================");
		
		//print out all elements of listo
		for (int i = 0; i < listo.size(); i++) {
			System.out.println(listo.get(i));
		}
		
		scanner.close();
	}//main
}//runner