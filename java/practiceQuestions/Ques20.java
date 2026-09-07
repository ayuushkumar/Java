package practiceQuestions;

// ======================================================
//  Q.Create a class Cylinder and use getters and
//    setters to Set its radius and height.
// ======================================================

class Cylinder{
    private int height;
    private int radius;

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }

// ======================================================
//  Q.Use Q.1 to calculate surface area and Volume
//      of the cylinder.
// ======================================================

    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }

// =======================================================
//  Q. Use a Constructor and repeat Q.1
// =======================================================
    public Cylinder(){}
    public Cylinder(int h, int r){
        height=h;
        radius=r;
    }
}

public class Ques20 {
    public static void main(String[] args) {

//  Problem 1
        Cylinder myCylinder = new Cylinder();

        myCylinder.setHeight(10);
        System.out.println(myCylinder.getHeight());

        myCylinder.setRadius(5);
        System.out.println(myCylinder.getRadius());

//  Problem 2
        System.out.print("\nSurface Area of the Cylinder is: ");
        System.out.println(myCylinder.surfaceArea());

        System.out.print("Volume of the Cylinder is: ");
        System.out.println(myCylinder.volume());

//  Problem 3
        Cylinder myCylinder2 = new Cylinder(15,20);
        System.out.println();
        System.out.println(myCylinder2.getHeight());
        System.out.println(myCylinder2.getRadius());


    }
}
