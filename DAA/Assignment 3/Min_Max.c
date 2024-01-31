#include <stdio.h>

struct MinMax {
    int min;
    int max;
};

struct MinMax find_min_max(int arr[], int low, int high) {
    struct MinMax result, left, right;
    int mid;

    // Base case: If the array has only one element
    if (low == high) {
        result.min = arr[low];
        result.max = arr[low];
        return result;
    }

    // If the array has two elements
    if (high == low + 1) {
        result.min = (arr[low] < arr[high]) ? arr[low] : arr[high];
        result.max = (arr[low] > arr[high]) ? arr[low] : arr[high];
        return result;
    }

    // If the array has more than two elements, divide it into two halves
    mid = (low + high) / 2;
    left = find_min_max(arr, low, mid);
    right = find_min_max(arr, mid + 1, high);

    // Combine the results of two halves
    result.min = (left.min < right.min) ? left.min : right.min;
    result.max = (left.max > right.max) ? left.max : right.max;

    return result;
}

int main() {
    int arr[] = {3, 1, 7, 9, 2, 5, 6, 4};
    int n = sizeof(arr) / sizeof(arr[0]);

    struct MinMax result = find_min_max(arr, 0, n - 1);

    printf("Smallest element: %d\n", result.min);
    printf("Largest element: %d\n", result.max);

    return 0;
}
