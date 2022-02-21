package singleton;

public class Singleton {

    public static void main(String[] args) {

        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();

        String statement = obj1.toString();

        System.out.println(statement);
    }
}

class Abc {
    String name = "Karan";
    //to create singleton class
    //create static instance of class(object) in the class itself
    static Abc obj = new Abc();

    //create private default constructor
    private Abc() {

    }

    //create a static method with getInstance name which returns classname datatype
    public static Abc getInstance() {
        return obj;
    }

    @Override
    public String toString() {
        return "Abc{" +
                "name='" + name + '\'' +
                '}';
    }
}


