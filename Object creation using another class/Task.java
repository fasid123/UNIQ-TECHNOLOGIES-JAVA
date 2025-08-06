class EmpTask {

int id;
String name;
String dept;
double salary;
double hike;


static void display(EmpTask obj){
System.out.println("details of "+obj.name);
System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.dept);
System.out.println(obj.salary);
}

static EmpTask createEmployeeObject(){
EmpTask emp = new EmpTask();
return emp;
}

static void addProperties(EmpTask obj, String str,double hike){

System.out.println("Before add "+obj.name+" Object Details");
System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.dept);
System.out.println(obj.salary);
System.out.println();

System.out.println("After add "+obj.name+" Object Details");
obj.dept = str;
double temp = obj.salary;
obj.salary =  temp + (obj.salary * (hike /100));
System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.dept);
System.out.println(hike+"Percentage Hike");
System.out.println(obj.salary);
System.out.println();

}


static void compareSalary(EmpTask obj1, EmpTask obj2) {

if (obj1.salary == obj2.salary) {
System.out.println(obj1.name+ " salary is equal to the "+obj2.name);
}
else if (obj1.salary > obj2.salary) {
System.out.println(obj1.name+ " salary is higher than "+obj2.name);
}
else {
System.out.println(obj2.name+ " salary is higher than "+obj1.name);
}


}

static void resetEmployeeDetails(EmpTask obj) {
System.out.println("-----------Reseting Value of "+obj.name+" ---------------------------");

System.out.println("Before Resetting "+obj.name+ " Details");
System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.dept);
System.out.println(obj.salary);

System.out.println();

System.out.println("After Resetting " +obj.name+ " Details");
EmpTask obk = new EmpTask();

obj.id = obk.id;
obj.name = obk.name;
obj.dept = obk.dept;
obj.salary = obk.salary;

System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.dept);
System.out.println(obj.salary);
System.out.println();


}






}


class Task{
public static void main(String[] args) {

EmpTask e1 = EmpTask.createEmployeeObject();
e1.id = 101;
e1.name = "Mohamed";
e1.dept = "Developer";
e1.salary = 12000.0;

EmpTask e2 = EmpTask.createEmployeeObject();
e2.id = 102;
e2.name = "Rajesh";
e2.dept = "Testing";
e2.salary = 13000.0;





EmpTask.display(e1);
System.out.println();

EmpTask.display(e2);
System.out.println();




e2.hike = 60.0;
EmpTask.addProperties(e2,"DevOps",e2.hike);
System.out.println();

EmpTask.compareSalary(e1,e2);
System.out.println();

EmpTask.resetEmployeeDetails(e1);
System.out.println();


}

}