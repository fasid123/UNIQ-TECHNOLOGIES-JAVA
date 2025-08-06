
class Student {
    String name;
    int id;
    String dept;
    
    //just object create
    static Student createStudentObject() {
        Student obj1 = new Student();
        obj1.id = 101;
        obj1.name = "hi";
        obj1.dept = "it";
        return obj1;
    }
    
}
class Main {
    
    
    public static void main(String[] args) {
    
    Student m1 = Student.createStudentObject();
    System.out.println(m1.id);

    
    
    
    }
}