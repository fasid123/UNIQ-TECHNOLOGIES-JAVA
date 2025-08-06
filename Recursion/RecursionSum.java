class RecursionSum {



int sum(int n){

if (n == 0){
return 0;
}

int ld = n % 10;

return sum(n/10) + ld;
}

public static void main(String[] args) {
RecursionSum obj = new RecursionSum();

int result = obj.sum(1234);

System.out.println(result);
}
}