package Recursion;
	  
public class Fib {
	 public int fibonacci(int n) {
		    if (n<0) {
		      return -1;
		    }
		    if (n==0 || n==1) {
		      return n;
		    }
		    return fibonacci(n-1) + fibonacci(n-2);
		  }
	
	public static void main(String[] args) {
	   Fib recursion = new Fib();
	   var rec = recursion.fibonacci(3);
	   System.out.println(rec);

	  } 
}
