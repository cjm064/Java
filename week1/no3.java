package week1;

import java.util.Scanner;

public class no3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int[]counts  =new int[10];
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a*b*c;
		
		while(d>0) {
			counts[d%10]++;
			d/=10;
			if(d==0) {
				break;
			}
				
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(counts[i]);
		}
	}
}
