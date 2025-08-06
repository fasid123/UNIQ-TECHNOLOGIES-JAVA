//shallow copy - 1 object 2 references, changes affect 2 references

// deep copy - 2 objects 2 references, changes do in one references cannot affect other references.

class ShallowCopy {

//instance variable
int id;
String name;
String dept;

//default constructor
public ShallowCopy() {

}


// copy constructor
public ShallowCopy(ShallowCopy obj){

this.id = obj.id;
this.name = obj.name;
this.dept = obj.dept;

}

public void display() {
System.out.println(this.id);
System.out.println(this.name);
System.out.println(this.dept);
System.out.println();
}


public static void main(String[] args) {

ShallowCopy s1 = new ShallowCopy(); //default constructor calling - s1 object create
s1.id = 101;
s1.name = "Fasid";
s1.dept = "IT";

ShallowCopy s2 = new ShallowCopy(s1); //copy constructor calling - s2 object create // deep copy we did

ShallowCopy s3 = s1; // in this case we do shallow copy, directly assign one instance to another directly, means we cannot create new object s3, but we point same object 2 references

s3.display(); // before changes s3

s3.name = "Mohamed Fasid";

s3.display(); // after changes print s3

s1.display(); // after changes print s1,  changes affect

// why changes affect bcse s1 and s3 both are points same object/instance, so changes affect both references.
}
}
