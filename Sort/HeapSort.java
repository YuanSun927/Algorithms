public class HeapSort {
    
    public void heapSort(int[] a) {
        if (a == null || a.length < 2)
            return;
        int end = a.length - 1;
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            maxHeapify(a, i, end);
        }
        while (end > 0) {
            swap(a, 0, end);
            maxHeapify(a, 0, --end);
        }
    }

    private void maxHeapify(int[] a, int i, int end) {
        while (left(i) <= end) {
            int j = left(i);
            if (j + 1 <= end && a[j + 1] > a[j])
                j++;
            if (a[i] >= a[j])
                break;
            swap(a, i, j);
            i = j;
        }
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}