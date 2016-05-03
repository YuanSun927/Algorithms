/**
 * Select the kth number.
 * 
 * @author Yuan Sun
 *
 */
public class RandomizedSelect {

    public int select(int[] a, int k) {
        if (a == null || a.length == 0 || k >= a.length)
            return -1;
        return select(a, k, 0, a.length - 1);
    }

    private int select(int[] a, int k, int i, int j) {
        int pivot = partition(a, i, j);
        if (pivot == k)
            return a[k];
        if (pivot < k)
            return select(a, k, pivot + 1, j);
        return select(a, k, i, pivot - 1);
    }

    private int partition(int[] a, int i, int j) {
        int pivot = i;
        for (int k = i; k < j; k++) {
            if (a[k] < a[j]) {
                swap(a, k, pivot);
                pivot++;
            }
        }
        swap(a, pivot, j);
        return pivot;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Select s = new Select();
        int[] a = new int[] {9, 2, 5, 1, 3, 4, 4, 7, 8, 6, 10, 3};
        for (int i = 0; i < a.length; i++) {
            int num = s.select(a, i);
            System.out.println(num);
        }
    }

}