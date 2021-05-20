import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private static final int B;
	private static final int H;
	private static boolean flag;
	static{
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		flag = (B>0 && H > 0 );
		try{

			if(!flag){
				throw new Exception("Breadth and height must be positive");
			}
		}catch(Exception e){
			System.out.println(e);
		}	
	}

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

