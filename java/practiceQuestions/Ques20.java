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

// ============================================================
//  Q.Overload a Constructor used to initialize a rectangle of
//      length 4 and breath 5 for using custom parameters
// ============================================================

class Rectangle{
    private int length;
    private int breath;

    public Rectangle(){
        length=4;
        breath=5;
    }

    public Rectangle(int l, int b){
        length=l;
        breath=b;
    }

    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
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

//  Problem 4
        Rectangle myRectangle = new Rectangle();
        System.out.println();
        System.out.println(myRectangle.getLength());
        System.out.println(myRectangle.getBreath());

        Rectangle myRectangle2 = new Rectangle(20,30);
        System.out.println();
        System.out.println(myRectangle2.getLength());
        System.out.println(myRectangle2.getBreath());

    }
}
