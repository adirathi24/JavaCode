import java.util.Scanner;

class NCRFactorial{
public static void main(String args[]){

Scanner s1 = new Scanner(System.in);
System.out.println("Enter n");

int n;
n = s1.nextInt();

Scanner s2 = new Scanner(System.in);
System.out.println("Enter r");

int r;
r = s2.nextInt();

//nCr = n!/r! (n-r)!

int factN , factR , factNsubR ;
factN = factorial(n);
factR = factorial(r);
factNsubR = factorial(n-r);

double nCr = factN / (factR * factNsubR);
System.out.println(nCr);

}

static int factorial(int n){

int i;
int fact=1;

for(i=2; i<=n; i++ ){
fact = fact * i;
}
System.out.println(fact);
return fact;
}

}