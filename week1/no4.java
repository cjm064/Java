package week1;

import java.util.Scanner;

public class no4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int n = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            s += s;
 
            if (s.contains(st))
                a++;
        }
        System.out.println(a);
        sc.close();
    }
}


