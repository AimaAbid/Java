public class InsertArray {
    public static void main(String[] args) {
        int element = 100;
        int a[] = { 10, 20, 30, 40, 50 };
        int pos = 5;

        for (int i = a.length - 1; i > pos - 1; i--) {
            a[i] = a[i - 1];
        }

        a[pos - 1] = element;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
