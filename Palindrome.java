import java.util.Scanner;

class Palindrome{

public static void main(String args[]){


String original = "";

Scanner s = new Scanner(System.in);
System.out.println("Enter the number/string:");
original = s.nextLine();

if(isPalindrome(original))
	System.out.println(original +"is a palindrome");
else
	System.out.println(original +"is not a palindrome");

}

static boolean isPalindrome(String original){
String reverse = "";
//System.out.println(original);
int length = original.length();
//System.out.println(length);
for(int i=length-1; i>=0; i--){
	reverse = reverse + original.charAt(i);
}

if(original.equals(reverse))
	return true;
else
	return false;

}



}