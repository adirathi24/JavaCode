class AdditionVariableLength{

public static void main(String args[]){
Sum obj = new Sum();
int x = obj.sum(10,20,30,40);
System.out.println("sum is:" + x);
}

}


class Sum{

public int sum(int ... a){
int result = 0;
for(int i=0; i<a.length; i++){
result += a[i];
}
return result;
}

}