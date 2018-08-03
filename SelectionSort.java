import java.util.Scanner;
import java.util.ArrayList;
	
class SelectionSort{

public static void main(String args[]){
      
      ArrayList<Integer> numbers = new ArrayList<Integer>();
 
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      String [] tokens = in.nextLine().split("\\s");
       
      for (int i = 0; i < tokens.length; i++)
         numbers.add(Integer.parseInt(tokens[i]));

      System.out.println("Array before selection sort"+numbers);

      selectionSort(numbers);
      System.out.println("Array after selection sort"+numbers);


}


static void selectionSort(ArrayList<Integer> numbers){

int temp=0;
for(int i=0; i<numbers.size(); i++){
  for(int j=1; j<numbers.size(); j++){
  if(numbers.get(i) > numbers.get(j)){
   temp = numbers.get(i);
   numbers.set(i, numbers.get(j));
   numbers.set(j, temp);
   }
   }
}
}

}

