import java.util.Scanner;

public class runner {

	//rough work for decide prime
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int count = 0;
		
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				count = 1;
				break;
			}//if
		}//for
		
		if(count == 1){
			System.out.println(num + " is not a prime number.");
		}//if 
		else {
			System.out.println(num + " is a prime number.");
		}//else

		scanner.close();
	}//main
}//runner