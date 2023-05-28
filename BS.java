public class BS {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 7, 8, 9 };

        int ub = a.length - 1;
        int lb = 0;

        int mid = (ub + lb) / 2;

        int ele = 1;

        while (lb <= ub) {
            if (a[mid] == ele) {
                System.out.println("Element found at index " + mid);
                break;
            }

            else if (a[mid] < ele) {
                lb = mid + 1;
                mid = (lb + ub) / 2;

            }

            else {
                ub = mid - 1;
                mid = (lb + ub) / 2;

            }
        }
        if (lb > ub) {
            System.out.println("Element not found");
        }

    }

}
