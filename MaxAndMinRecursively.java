package javatap;
import java.util.Scanner;
public class MaxAndMinRecursively {
	
	static int findMin(int[] a, int m) {	
		if(m==1) return a[0];
		return Math.min(a[m-1], findMin(a,m-1));
		
	}
	
	
	static int findMax(int[] a,int m) {	
		if(m==1) return a[0];
		return Math.max(a[m-1], findMax(a,m-1));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int m=a.length-1;
		
		System.out.println(findMin(a,m));
		
		
		System.out.println(findMax(a,a.length-1));

	}
}
	

