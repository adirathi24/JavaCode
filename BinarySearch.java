import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
	
class BinarySearch{

public static void main(String args[]){
      
      ArrayList<Integer> numbers = new ArrayList<Integer>();
 
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      String [] tokens = in.nextLine().split("\\s");
       
      for (int i = 0; i < tokens.length; i++)
         numbers.add(Integer.parseInt(tokens[i]));

      System.out.println("Array is "+numbers);
	Scanner in1 = new Scanner(System.in);
	System.out.println("Please enter a key to search");
	int key = in1.nextInt();
	
	Collections.sort(numbers);
	System.out.println("Sorted Array: " +numbers);
	int last = 0;
	last = (numbers.size())-1;

      int keyIndex = binarySearch(numbers, 0, last, key);
	if(keyIndex == -1)
	System.out.println("Element not found!");
	else
	System.out.println("Element found at index: "+keyIndex);

}


static int binarySearch(ArrayList<Integer> numbers, int first, int last, int key){
	
	if(last >= first){
	int mid = (first + last)/2;
	
	if(numbers.get(mid) == key){
	return mid;
	}
	
	if(numbers.get(mid) > key){
	return binarySearch(numbers, first, mid-1, key);
	}else{
	return binarySearch(numbers, mid+1, last, key);
	}
	
	}
return -1;
}

}


