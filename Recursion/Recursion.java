class Recursion {
    void add(){
        System.out.println("Hello");
        add();
    }
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.add();
        
    }
}

// method call use stack memory.

// call stack used for track the method call - intialization and destroy., once all method destroyed inside the main method, finally main method destroy.

// stack memory have stack frame, each method call using each stack frame.

// stack follows LIFO - Last In First Out.



/*
static method use - class
class or method area:
-its a META DATA OF A CLASS, it contain every static and non static method , variable details -  contains in a class.

- once we run the code, the instance method/variable use heap memory.

- stack frame stores data like : localvariable, local object reference, return address if the called method is return data type.
*/


