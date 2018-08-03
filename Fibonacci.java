class Fibonacci{
public static void main(String args[]){

int count=10;
int n1=0;
int n2=1;
int n3=0;

System.out.println(n1 + " " +n2);

for(int i=2; i<count; ++i){
n3 = n1 + n2;
System.out.println(" "+n3);
n1 = n2;fi
n2 = n3;
}

}

}