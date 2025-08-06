//copy constructor is also like parameterized constructor but in this constructor we pass object as a argument.

// we can use many constructor in a single class like default, parametrized, copy.

// we can create object using many constructor.

// constructor overloading : same constructor name, argument based it can differ.

class CopyConstructor {

// instance variable

int bookId;
String bookName;
String authorName;


//default constructor

public CopyConstructor() {

}

// copy constructor   - deep copy

public CopyConstructor (CopyConstructor obj){
this.bookId = obj.bookId;
this.bookName = obj.bookName;
this.authorName = obj.authorName;
}

// parameterized constructor

public CopyConstructor (int x) {

}

public CopyConstructor (int x, int y) {

}

public CopyConstructor (String str) {

}



public void display() {
System.out.println(this.bookId);
System.out.println(this.bookName);
System.out.println(this.authorName);
}



public static void main(String[] args) {

CopyConstructor c1 = new CopyConstructor(); // default constructor calling
c1.bookId = 101;
c1.bookName = "Money makes Perfect";
c1.authorName = "James";

c1.display();

CopyConstructor c2 = new CopyConstructor(c1); // copy constructor calling

c2.display(); // before changes

c2.authorName = "John";

c2.display(); // after changes

// we copy c1 object details to c2, if we change some details to c2 it cannot reflect to c1. bcse we only copy the copy from one instance and assign to another instance.
// if we want reflect one changes affect other we do shallow copy, we wll learn that in upcoming session.

c1.display();

}
}
