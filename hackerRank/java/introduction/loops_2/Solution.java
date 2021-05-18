import java.util.Scanner;

public class Solution{

	private static final Scanner SCANNER = new Scanner(System.in);
	

	public static void main(String[] args){

		int times = SCANNER.nextInt();
		for(int i = 0; i<times; i++){
			int a = SCANNER.nextInt();
			int b = SCANNER.nextInt();
			int n = SCANNER.nextInt();
			int result = a;
			String printResult = "";
			for(int s= 0; s<n; s++){
				result += (int)Math.pow(2,s)*b;
				printResult = printResult + result+ " ";
			}
			System.out.println(printResult.trim());
		}
	}
}
