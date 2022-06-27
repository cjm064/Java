package week2;
import java.util.Scanner;


public class No1 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);


		 
		 int n = sc.nextInt();
		 int positive = 0; 
		 
		 while(n>0) {
		
		 
			if(n==0) {
					break;
			 	}
		 
			else{
				int num = sc.nextInt();
			 
				if(num>0) {
					positive++;
				}
				n--;
			}
			
		 }
		 System.out.println(positive);
	
}
	 
}