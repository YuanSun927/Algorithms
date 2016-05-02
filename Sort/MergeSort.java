public class MergeSort {
    
    public void mergeSort(int[] a) {
        if (a == null || a.length < 2)
            return;
        int[] temp = new int[a.length];
        mergeSort(a, temp, 0, a.length - 1);
    }

    private void mergeSort(int[] a, int[] temp, int low, int high) {
        if (high <= low)
            return;
        int mid = low + ((high - low) >> 1);
        mergeSort(a, temp, low, mid);
        mergeSort(a, temp, mid + 1, high);
        merge(a, temp, low, mid, high);
    }

    private void merge(int[] a, int[] temp, int low, int mid, int high) {
        for (int k = low; k <= high; k++) {
            temp[k] = a[k];
        }
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid)
                a[k] = temp[j++];
            else if (j > high)
                a[k] = temp[i++];
            else
                a[k] = temp[i] < temp[j] ? temp[i++] : temp[j++];
        }
    }

}