package practiceQuestions;

// ==================================================================
//  Q. Create a class Employee with following properties and methods.
//      Salary(property)(int)
//      name(property)(String)
//      getSalary(method returning int)
//      getName(method returning String)
//      setName(method changing name)
// ==================================================================

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class Ques19 {
    public static void main(String[] args) {

//  Problem 1
        Employee emp = new Employee();
        emp.setName("Ayush");
        emp.salary = 5000;

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

    }
}
