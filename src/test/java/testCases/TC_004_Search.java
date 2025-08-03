
<<<<<<< HEAD
public class TC_004_Search {

	
	    // Function to print N Fibonacci Number
	    static void Fibonacci(int N)
	    {
	        int n1 = 0, n2 = 1;

	        for (int i = 0; i < N; i++) {
	            // Print the number
	            System.out.print(n1 + " ");

	            // Swap
	            int n3 = n2 + n1;
	            n1 = n2;
	            n2 = n3;
	        }
	    }
	

	


public static void main(String args[])
{
    // Given Number N
    int N = 10;

    // Function Call
    Fibonacci(N);
}
}
=======
>>>>>>> 8bb3b4d7398c9c4da7619f15dfec30436641611d
