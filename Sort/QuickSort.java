public class QuickSort {

    public void quickSort(int[] a) {
        if (a == null || a.length < 2)
            return;
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int i, int j) {
        if (i >= j)
            return;
        int pivot = partition(a, i, j);
        quickSort(a, i, pivot - 1);
        quickSort(a, pivot + 1, j);
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
}