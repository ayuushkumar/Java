package javaCoding;

class air{
    public int oxygen(){
        return 7;
    }
    public void carbon(){
        System.out.println("I am carbon from air");
    }
}

class water extends air{

    public void Hydrogen(){
        System.out.println("Ice");
    }

    //  Method overriding
    //  If the child class implements the same method present in the parent class again.

    @Override
    public void carbon(){
        System.out.println("I am carbon from water");
    }
}


public class J16_3_methodOverriding {
    public static void main(String[] args) {
        air air = new air();
        air.carbon();

        water water = new water();
        water.carbon();

    }
}
