package week1;
import java.util.Scanner;


public class no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		

		
		while(true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
		if(a==0&&b==0&&c==0) {
			break;
		
		}
		if(a==0) {
			 a = c/b;
			System.out.printf("%d %d %d\n",a, b, c);
		}
		if(b==0) {
			b = c/a;
			System.out.printf("%d %d %d\n",a, b, c);
		}
		if(c==0) {
	 		 c = a*b;
				System.out.printf("%d %d %d\n",a, b, c);
		}
		
	
		}
	}
}

