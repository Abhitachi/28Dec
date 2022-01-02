package javatap;
import java.util.Scanner;
public class EvenRec {

	static void isEven(int n) {
		if(n>=2) {
			if(n%2==0) {
				System.out.println(n);
				isEven((n-1));
				
			}
			else {
				n--;
				isEven(n);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		isEven(n);
	}

}
