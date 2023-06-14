
class point2D {
    int x, y;

    public void display() {
        System.out.println("x = " + x + " y = " + y);

    }
}

class point3D extends point2D {
    int z;

    public void display1() {
        System.out.println("x = " + x + " y = " + y + " z = " + z);

    }

}

public class Inher {
    public static void main(String[] args) {
        point3D p1 = new point3D();

        p1.x = 10;
        p1.y = 20;
        p1.z = 30;
        p1.display();
        p1.display1();

    }

}
