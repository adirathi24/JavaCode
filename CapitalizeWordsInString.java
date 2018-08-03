import java.util.Scanner;
import java.util.ArrayList;
	
class CapitalizeWordsInString{

public static void main(String args[]){
      
      
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a the string to reverse: ");
      String str =  in.nextLine();

    
      //System.out.println("String before reverse: "+ str);

      String capitalString= capitalString(str);
      System.out.println("String after capital: "+ capitalString);

	



}


static String capitalString(String str){

str = str.toUpperCase();
//System.out.println(str);
return str;

}

}

