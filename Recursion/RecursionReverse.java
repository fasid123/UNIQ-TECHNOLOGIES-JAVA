class RecursionReverse {

int rever = 0;

int reverse (int n) {

if(n == 0){
return 0;
}

int ld = n % 10;
rever = rever * 10 + ld;
reverse(n/10);

return rever;

}

public static void main(String[] args) {
RecursionReverse obj = new RecursionReverse();

int rev = obj.reverse(1234);
System.out.println(rev);

}

}