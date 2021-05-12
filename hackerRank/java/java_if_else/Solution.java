import java.util.Scanner;

public class Solution{
	private static final Scanner SCANNER = new Scanner(System.in);
	
	private static final String WEIRD_NUMBER_TOKEN = "Weird";
	private static final String NOT_WEIRD_NUMBER_TOKEN = "Not Weird";

	public static void main(String[] args){
		int n = SCANNER.nextInt();
		if(n%2 == 0){
			// even number
			if(n<5){
				System.out.println(NOT_WEIRD_NUMBER_TOKEN);
			}else if(n<21){
				System.out.println(WEIRD_NUMBER_TOKEN);
			}else{
				System.out.println(NOT_WEIRD_NUMBER_TOKEN);
			}
		}else{
			System.out.println(WEIRD_NUMBER_TOKEN);
		}
		SCANNER.close();
	}
}
