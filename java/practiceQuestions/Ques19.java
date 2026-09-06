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

// ==========================================================
//  Q. Create a class cellphone with method to print
//     "ringing...", "vibrating..." etc.
// ==========================================================

class cellPhone{
    public void calling(){
        System.out.println("Calling...");
    }
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
}

// ==============================================================
//  Q. Create a class square with method to initialize its side
//     calculate its area and perimeter.
// ==============================================================

class square {
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
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

//  Problem 2
        cellPhone lava = new cellPhone();
        System.out.println();
        lava.calling();
        lava.ringing();
        lava.vibrating();

//  Problem 3
        square sq = new square();
        System.out.println();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
