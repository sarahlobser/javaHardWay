/* Assignment from Graham Mitchell: 
 * https://programmingbydoing.com/a/copying-arrays.html
 *
 * Create an array of ten integers
 * Fill the array with ten random numbers (1-100)
 * Copy the array into another array of the same capacity
 * Change the last value in the first array to a -7
 * Display the contents of both arrays
 */

public class ArraysCopy {
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] acopy = new int[10];
		int i;
		for(i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100+1);
		}
		for(i = 0; i < a.length; i++) {
			acopy[i] = a[i];
		}
		
		a[a.length-1] = -7;
		
		System.out.print("Array 0: ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nArray 1: ");
		for (i = 0; i < acopy.length; i++) {
			System.out.print(acopy[i] + " ");
		}
		
		System.out.println();
	}
}
