import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
	
class BubbleSort{

public static void main(String args[]){
      
      ArrayList<Integer> numbers = new ArrayList<Integer>();
 
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      String [] tokens = in.nextLine().split("\\s");
       
      for (int i = 0; i < tokens.length; i++)
         numbers.add(Integer.parseInt(tokens[i]));

      System.out.println("Array before bubble sort"+numbers);

      bubbleSort(numbers);
      System.out.println("Array after bubble sort"+numbers);


}


static void bubbleSort(ArrayList<Integer> numbers){
int n = numbers.size();
System.out.println(n);
int temp =0;

for(int i=0; i<n; i++){
	for(int j=1; j<(n-i); j++){
	if(numbers.get(j-1)>numbers.get(j)){
		temp = numbers.get(j-1);
		numbers.set(j-1, numbers.get(j));
		numbers.set(j, temp);
	}}
}

}

}

