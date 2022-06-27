package week2;
import java.util.Scanner;

public class ex3 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 int sum = num1 + num2;
		 int sub = num1 - num2;
		 int ex = num1 * num2;
		 int sb = num1 /num2;
		 int el = num1 & num2;
		 
		 System.out.printf("%d\n", sum);
		 System.out.printf("%d\n", sub);	
		 System.out.printf("%d\n", ex);
		 System.out.printf("%d\n", sb);
		 System.out.printf("%d\n", el);
	 }
}