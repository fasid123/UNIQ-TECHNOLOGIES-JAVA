class FactorialRecursion {

// instance method 

int factorial(int n) {

if (n == 1){ //base condition for control recursion - avoid overflow
return 1;
}

return factorial(n-1) * n;  // 4! * 5, 3! * 4, 2! * 3, 1! * 2, return 1 // formula = (n-1) * n;

}

public static void main(String[] args) {

FactorialRecursion obj = new FactorialRecursion();

int fact = obj.factorial(5);

System.out.println(fact);

}

}