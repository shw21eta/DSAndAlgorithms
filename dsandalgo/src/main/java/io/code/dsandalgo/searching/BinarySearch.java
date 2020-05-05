package io.code.dsandalgo.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element) {
        int index = -1;
        int left = 0, right = arr.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (element == arr[mid]) {
                index = mid;
                break;
            }

            if (element < arr[mid]) {
                right = mid - 1;
                mid = (left + right) / 2;
            } else {
                left = mid + 1;
                mid = ((left + right) / 2) % arr.length;
            }
        }
        return index;
    }

    public static int binarySearchRecursive(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (x < arr[mid]) {
                return binarySearchRecursive(arr, l, mid-1, x);
            }
            return binarySearchRecursive(arr, mid+1, r, x);
        }
        return -1;
    }
}
