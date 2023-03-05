public class ExpSearch {

    private static int binarySearch(double[] arr, double reqEl, int l, int r) {
        while (l<= r) {
            int m = l + (r-l)/2;
            double el = arr[m];
            if(reqEl == el) {
                return m;
            }
            if (el < reqEl) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
    static int Search(double[] arr, double reqEl) {
        int border = 1;
        while (border < arr.length && arr[border] < reqEl) {
            border *= 2;
        }
        int l = border/2;
        int r = Math.min(border, arr.length - 1);
        return binarySearch(arr, reqEl, l, r);
    }
}
