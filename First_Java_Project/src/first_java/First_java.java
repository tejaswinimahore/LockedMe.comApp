package first_java;
import java.util.Iterator;
import java.util.Scanner;
public class First_java {

	public static void main(String[] args) {
		int  n,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number = ");
		 n = sc.nextInt();
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
			}
		}
		System.out.println(temp==0 ? "Prime Number" : "NOt Prime Number");

	}

}
