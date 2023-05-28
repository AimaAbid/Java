public class DelArray {
    public static void main(String[] args) {

        int a[] = { 10, 40, 30, 80, 60, 20 };
        int ele = 30;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {

                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];

                }
                break;

            }

        }

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

    }
}