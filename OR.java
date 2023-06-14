class Point2D {
    int x, y;

    void display(int x, int y) {
        System.out.println("x = " + x + " y = " + y);
    }
}

class Point3D extends Point2D {
    int z;

    void display(int x, int y, int z) {
        System.out.println("x = " + x + " y = " + y + " z = " + z);

    }

}

public class OR {

    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();

        p1.display(1, 2);
        p2.display(1, 2, 3);
        p2.display(1, 2);

    }

}
