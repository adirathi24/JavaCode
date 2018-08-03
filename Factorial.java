import java.util.Scanner;

class Factorial{

public static void main(String args[]){


Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int n= s.nextInt();

int factorial = factorialIs(n);
System.out.println(factorial);

}

static int factorialIs(int n){

if(n==0){
return 1;
}
else{
return(n*factorialIs(n-1));
}

}



}