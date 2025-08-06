class Employee {

int id;
String name;
String dept;


static void display(Employee obj){
System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.dept);
}

static Employee createEmployeeObject(){
Employee emp = new Employee();
return emp;
}

static void copy(Employee emp1, Employee emp2){
emp1.id = emp2.id;
emp1.name = emp2.name;
emp1.dept = emp2.dept;

}


}

class Details {

public static void main(String[] args) {

Employee e1 = Employee.createEmployeeObject();
e1.id = 101;
e1.name = "Mohamed";
e1.dept = "Developer";

Employee e2 = Employee.createEmployeeObject();
e2.id = 102;
e2.name = "Rajesh";
e2.dept = "Testing";

Employee e3 = Employee.createEmployeeObject();
Employee.copy(e3, e2);


Employee e4 = Employee.createEmployeeObject();


Employee.display(e1);
System.out.println();

Employee.display(e2);
System.out.println();

Employee.display(e3);
System.out.println();

Employee.display(e4);


}
}
