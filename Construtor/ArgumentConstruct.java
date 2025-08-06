// argument contstructor we give default value every time object create, by giving argumentvalue through parameters

// For argument constructor we can pass arguments in paranthesis so we can assign default values dynamically to each object.
class Book {

int bookId;
String bookName;
String authorName;
int publishedYear;

Book (int bookId,String bookName,String authorName,int publishedYear) {
this.bookId = bookId;
this.bookName = bookName;
this.authorName = authorName;
this.publishedYear = publishedYear;
}

void display() {
System.out.println(bookId);
System.out.println(bookName);
System.out.println(authorName);
System.out.println(publishedYear);
System.out.println();
}

} // Book class ends


class ArgumentConstruct{
public static void main(String[] args) {

Book book1 = new Book(101,"PEACE","Williams",2010);
book1.display();

Book book2 = new Book(102,"TRANSFORMER","James",2008);
book2.display();

book1.display();

}
}