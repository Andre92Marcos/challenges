import java.util.Scanner;

public class Solution{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = 3;
		for(int i = 0; i<n;i++){
			int myInt = scanner.nextInt();
			System.out.println(myInt);
		}
		scanner.close();
	}
}
