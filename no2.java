package week1;

import java.util.Scanner;

public class no2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,c;	
		
		c = 1 ;
		a = sc.nextInt();
		
		
		while(true) {
			
			
			
		if(a==1) {
			System.out.printf("%d",c);
			break;
		}
		
		if(a%2 == 0) {
			a= a/2;
			c=c+1;
		}
		else{
			a= 3*a+1;
			c=c+1;
		}
	}
}

}
