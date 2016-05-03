public class BinarySearch {

    public int search(int[] a, int target) {
        if (a == null || a.length == 0 || !isSorted(a))
            return -1;
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (target == a[mid])
                return mid;
            if (target < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private boolean isSorted(int[] a) {
        if (a == null || a.length == 0)
            return false;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        BinarySearch bs = new BinarySearch();
        int pos = bs.search(a, 5);
        if (pos == -1) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found. Pos=" + pos);
        }
    }
}