import java.util.Scanner;


public class Solution{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(scanner.hasNextLine()){
			i++;
			System.out.println(i + " " + scanner.nextLine());
		}
	}
}
