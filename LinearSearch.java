import java.util.Scanner;
import java.util.ArrayList;
	
class LinearSearch{

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

      int keyIndex = linearSearch(numbers, key);
	System.out.println(keyIndex);


}


static int linearSearch(ArrayList<Integer> numbers, int key){
	for(int i=0; i<numbers.size(); i++){
		if(numbers.get(i) == key)
			return i;
			
	}
return -1;
}
}


