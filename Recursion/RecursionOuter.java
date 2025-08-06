class RecursionOuter {

int i = 1;
void Task() {
System.out.println("Entered");
if (i < 5) {
i++;
Task();
}

System.out.println("Exit"); // once stack frame go to last step it will execute

}
public static void main(String[] args){

RecursionOuter r1 = new RecursionOuter();

System.out.println("Entered to Main");
System.out.println();

r1.Task();

System.out.println();
System.out.println("Exit from Main");

}
}