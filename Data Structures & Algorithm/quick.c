#include <stdio.h>
#include <string.h>

// Swap function to swap two elements
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Partition function for numbered array
int partition(int arr[], int low, int high) {
    int pivot = arr[low]; // Selecting the first element as the pivot
    int i = low + 1;
    int j = high;

    printf("\nPartitioning steps for numbered array:\n");
    printf("Pivot: %d\n", pivot);
    printf("Array before partitioning: ");
    for (int k = low; k <= high; k++) {
        printf("%d ", arr[k]);
    }
    printf("\n");

    while (1) {
        while (i <= j && arr[i] <= pivot)
            i++;
        while (i <= j && arr[j] > pivot)
            j--;
        if (i <= j) {
            swap(&arr[i], &arr[j]); // Swapping elements
            printf("Array after swapping: ");
            for (int k = low; k <= high; k++) {
                printf("%d ", arr[k]);
            }
            printf("\n");
        } else {
            break;
        }
    }

    swap(&arr[low], &arr[j]); // Placing the pivot in its correct position
    printf("Array after placing pivot: ");
    for (int k = low; k <= high; k++) {
        printf("%d ", arr[k]);
    }
    printf("\n");

    return j;
}

// Partition function for string array
int partitionStr(char *arr[], int low, int high) {
    char *pivot = arr[low]; // Selecting the first element as the pivot
    int i = low + 1;
    int j = high;

    printf("\nPartitioning steps for string array:\n");
    printf("Pivot: %s\n", pivot);
    printf("Array before partitioning: ");
    for (int k = low; k <= high; k++) {
        printf("%s ", arr[k]);
    }
    printf("\n");

    while (1) {
        while (i <= j && strcmp(arr[i], pivot) <= 0)
            i++;
        while (i <= j && strcmp(arr[j], pivot) > 0)
            j--;
        if (i <= j) {
            char *temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; // Swapping elements
            printf("Array after swapping: ");
            for (int k = low; k <= high; k++) {
                printf("%s ", arr[k]);
            }
            printf("\n");
        } else {
            break;
        }
    }

    char *temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp; // Placing the pivot in its correct position
    printf("Array after placing pivot: ");
    for (int k = low; k <= high; k++) {
        printf("%s ", arr[k]);
    }
    printf("\n");

    return j;
}

// Quick Sort function for numbered array
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

// Quick Sort function for string array
void quickSortStr(char *arr[], int low, int high) {
    if (low < high) {
        int pivotIndex = partitionStr(arr, low, high);
        quickSortStr(arr, low, pivotIndex - 1);
        quickSortStr(arr, pivotIndex + 1, high);
    }
}

int main() {
    int n, option;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Select the type of array to sort:\n");
    printf("1. Numbered Array\n");
    printf("2. String Array\n");
    scanf("%d", &option);

    switch (option) {
        case 1: {
            printf("Enter %d integers for the numbered array:\n", n);
            int num[n];
            for (int i = 0; i < n; i++) {
                scanf("%d", &num[i]);
            }

            quickSort(num, 0, n - 1);

            printf("\nSorted array for numbered array:\n");
            for (int i = 0; i < n; i++) {
                printf("%d ", num[i]);
            }
            printf("\n");

            break;
        }
        case 2: {
            printf("Enter %d strings for the string array:\n", n);
            char str[n][100]; // Assuming each string has a maximum length of 100 characters
            for (int i = 0; i < n; i++) {
                scanf("%s", str[i]);
            }

            quickSortStr(str, 0, n - 1);

            printf("\nSorted array for string array:\n");
            for (int i = 0; i < n; i++) {
                printf("%s ", str[i]);
            }
            printf("\n");

            break;
        }
        default:
            printf("Invalid option selected.\n");
            break;
    }

    return 0;
}
