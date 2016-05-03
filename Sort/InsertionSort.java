public class InsertionSort {
    
    public void insertSort(int[] a) {
        if (a == null || a.length < 2)
            return;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    for (int k = i; k > j; k--) {
                        a[k] = a[k - 1];
                    }
                    a[j] = temp;
                }
            }
        }
    }
}