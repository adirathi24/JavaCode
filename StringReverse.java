import java.util.Scanner;
import java.util.ArrayList;
	
class StringReverse{

public static void main(String args[]){
      
      
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a the string to reverse: ");
      String str =  in.nextLine();

    
      System.out.println("String before reverse: "+ str);

      String reverseString = stringReverse(str);
      System.out.println("String after reverse using reverse method: "+ reverseString);

	String reverseString1 = stringReverseWithoutRevMethod(str);
      	System.out.println("String after reverse without using reverse method: "+ reverseString1);
	
	String reverseString2 = stringReverseEachWord(str);
      	System.out.println("String reversed after each word: "+ reverseString2);



}


static String stringReverse(String str){

StringBuilder sb = new StringBuilder(str);
sb.reverse();
return sb.toString();

}


static String stringReverseWithoutRevMethod(String str){

char ch[] = str.toCharArray();
String rev = "";

for(int i=ch.length-1; i>=0; i--){
rev += ch[i];
} 
return rev;
}


static String stringReverseEachWord(String str){

String words[] = str.split("\\s");
String reversedWords="";

for(String s:words){
StringBuilder sb = new StringBuilder(s);
sb.reverse();
reversedWords += sb.toString()+ " ";
}

return reversedWords.trim();
}

}

