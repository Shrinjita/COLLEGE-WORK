#include <stdio.h>

// Function to find minimum and maximum in an array
void findMinAndMax(int arr[], int low, int high, int *min, int *max) {
    if (low == high) {
        *min = arr[low];
        *max = arr[low];
        return;
    }

    if (high == low + 1) {
        if (arr[low] < arr[high]) {
            *min = arr[low];
            *max = arr[high];
        } else {
            *min = arr[high];
            *max = arr[low];
        }
        return;
    }

    int mid = (low + high) / 2;
    int min1, min2, max1, max2;

    findMinAndMax(arr, low, mid, &min1, &max1);
    findMinAndMax(arr, mid + 1, high, &min2, &max2);

    *min = (min1 < min2) ? min1 : min2;
    *max = (max1 > max2) ? max1 : max2;
}

// Function to find second minimum and second maximum in an array
void findSecondMinAndMax(int arr[], int n) {
    int min, max;
    findMinAndMax(arr, 0, n - 1, &min, &max);

    int second_min = max;
    int second_max = min;

    for (int i = 0; i < n; i++) {
        if (arr[i] != min && arr[i] != max) {
            if (arr[i] < second_min)
                second_min = arr[i];
            if (arr[i] > second_max)
                second_max = arr[i];
        }
    }

    printf("Second minimum: %d\n", second_min);
    printf("Second maximum: %d\n", second_max);
}

int main() {
    int arr[] = {10, 5, 3, 8, 15, 7, 20};
    int n = sizeof(arr) / sizeof(arr[0]);
    findSecondMinAndMax(arr, n);
    return 0;
}
