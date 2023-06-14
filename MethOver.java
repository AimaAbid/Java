public class MethOver {
    int s1, s2, s3;

    MethOver(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    MethOver(int s3) {
        this(0, 0, s3);

    }

    public static void main(String[] args) {
        MethOver m = new MethOver(2);
        System.out.println(m.s1 + "  " + m.s2 + " " + m.s3);

    }

}
