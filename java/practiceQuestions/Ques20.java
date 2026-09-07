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
}

public class Ques20 {
    public static void main(String[] args) {

// Problem 1
        Cylinder myCylinder = new Cylinder();

        myCylinder.setHeight(10);
        System.out.println(myCylinder.getHeight());

        myCylinder.setRadius(5);
        System.out.println(myCylinder.getRadius());
    }
}
