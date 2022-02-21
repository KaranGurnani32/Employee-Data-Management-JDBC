package staticmethodcalling;

public class Student {
    String getDetails() {
        return "inside get details static method";
    }
}

class TestClass {
    public static void main(String[] args) {
        //calling static method of another class using class name.method name
//        Student.getDetails();

        Student s = new Student();
        s.getDetails();
    }
}
