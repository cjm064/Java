package week2;
import java.util.Scanner;

public class No3 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 int binary = sc.nextInt();
		 int exponent = 0; 
		 int result =0 ;
		 int decimal;
		 while(binary>0) {
				
			 	if(binary%10==1) {
			 		decimal = (int)Math.pow(2, exponent);
			 		result = result + decimal;
			 		exponent++;
			 		binary/=10;

			 		
			 	}
			 	if(binary%10==0) {
					binary/=10;
					exponent++;


				}

			 	}
		 	System.out.println(result);
		 	}
	 }

		
			 	
		 
		 

	

