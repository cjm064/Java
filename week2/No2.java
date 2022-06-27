package week2;
import java.util.Scanner;

public class No2 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int factorial = sc.nextInt();
		 int result = 1;
		
		 
		 while(factorial>0) {
			result=result*factorial;
			factorial--;
			
			if(factorial==0) {
		 		break;
		 	}
		 }
		 System.out.println(result); 	
	}
}
