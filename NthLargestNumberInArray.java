import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
	
class NthLargestNumberInArray{

public static void main(String args[]){
      
      ArrayList<Integer> numbers = new ArrayList<Integer>();
 
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      String [] tokens = in.nextLine().split("\\s");
       
      for (int i = 0; i < tokens.length; i++)
         numbers.add(Integer.parseInt(tokens[i]));

      //System.out.println("Array is "+numbers);
	Scanner in1 = new Scanner(System.in);
	System.out.println("Please enter nth largest number to search");
	int nth= in1.nextInt();
	
	Collections.sort(numbers);
	//System.out.println("Sorted Array: " +numbers);
	int size= 0;
	size= (numbers.size());
	System.out.println("Size is:" +size);

      int largestNumber= nthLargestNumber(numbers,nth, size);
	System.out.println(nth+ " largest Number is: "+ largestNumber);

}


static int nthLargestNumber(ArrayList<Integer> numbers, int nth, int size){
	int largestNumber =0;
	largestNumber = numbers.get(size - nth);
	return largestNumber;
	
}

}


