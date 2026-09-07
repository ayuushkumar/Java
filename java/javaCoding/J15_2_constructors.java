package javaCoding;

// Constructors - a member function used to initialize an object while creating it.

class Employee2{
    private int id;
    private String name;


    public Employee2(){
        id = 67;
        name = "Employee2";
    }

// Constructors can be overloaded just like other methods in java.
    public Employee2(String myName, int myId){
        id = myId;
        name = myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}

public class J15_2_constructors {
    public static void main(String[] args) {

//      Employee2 emp2 = new Employee2();

        Employee2 emp = new Employee2("Ayush",7);

//        emp.setName("Ayush");
//        emp.setId(100);

        System.out.println(emp.getName());
        System.out.println(emp.getId());

    }
}
