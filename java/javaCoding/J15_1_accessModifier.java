package javaCoding;

// Access Modifiers
// Specifier where a property/methiad is accessible
// There are four types of access modifiers in Java
// Private
// Default --> don't have to write anything.
// Protected
// Public


class MyEmployee{
    private String name;    // Using Private access modifier
    private int id;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }
}

public class J15_1_accessModifier {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();

//        emp.name = "Ayush";
//        emp.id = 7;           // Throws error because of private access modifier.

        emp.setName("Ayush");
        emp.setId(7);
        System.out.println(emp.getName());
        System.out.println(emp.getId());

    }
}
