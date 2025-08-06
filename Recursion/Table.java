class Table {

int i = 1; // instance attribute

void add (int x) {

System.out.println(x +" * 5 = " +(x*5));
if (i< 10) {
i++;
add(i);
}


}
public static void main(String[] args) {
Table obj = new Table(); //object creation
obj.add(1);

}
}