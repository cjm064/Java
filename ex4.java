package week2;
import java.util.Scanner;

public class ex4 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 
		 if(num1<num2) {
			 System.out.printf("<");
		 }
		 if(num1==num2) {
			 System.out.printf("==");
		 }
		 if(num1>num2) {
			 System.out.printf(">");
		 }
		
	 }
}