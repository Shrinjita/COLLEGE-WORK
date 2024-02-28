#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Swap two elements in an integer array
void swapInt(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Swap two elements in a string array
void swapString(char **a, char **b) {
    char *temp = *a;
    *a = *b;
    *b = temp;
}

// Partition function for integer arrays
int partitionInt(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            swapInt(&arr[i], &arr[j]);
        }
    }
    swapInt(&arr[i + 1], &arr[high]);
    return i + 1;
}

// Partition function for string arrays
int partitionString(char *arr[], int low, int high) {
    char *pivot = arr[high];
    int i = low - 1;
    
    for (int j = low; j < high; j++) {
        if (strcmp(arr[j], pivot) < 0) {
            i++;
            swapString(&arr[i], &arr[j]);
        }
    }
    swapString(&arr[i + 1], &arr[high]);
    return i + 1;
}

// Quick Sort for integer arrays
void quickSortInt(int arr[], int low, int high) {
    if (low < high) {
        int pi = partitionInt(arr, low, high);
        for (int i = low; i <= high; i++) {
            printf("%d ", arr[i]);
        }
        printf("\n");
        
        quickSortInt(arr, low, pi - 1);
        quickSortInt(arr, pi + 1, high);
    }
}

// Quick Sort for string arrays
void quickSortString(char *arr[], int low, int high) {
    if (low < high) {
        int pi = partitionString(arr, low, high);
        for (int i = low; i <= high; i++) {
            printf("%s ", arr[i]);
        }
        printf("\n");
        
        quickSortString(arr, low, pi - 1);
        quickSortString(arr, pi + 1, high);
    }
}

int main() {
    int choice;
    printf("Choose the type of array to sort:\n");
    printf("1. Integer Array\n");
    printf("2. String Array\n");
    scanf("%d", &choice);
    
    switch(choice) {
        case 1: {
            int intArraySize;
            printf("Enter the size of the integer array: ");
            scanf("%d", &intArraySize);
            
            int intArray[intArraySize];
            printf("Enter %d elements for the integer array:\n", intArraySize);
            for (int i = 0; i < intArraySize; i++) {
                scanf("%d", &intArray[i]);
            }
            
            printf("Original Integer Array: ");
            for (int i = 0; i < intArraySize; i++) {
                printf("%d ", intArray[i]);
            }
            printf("\n");
            
            printf("Integer Array Sorting Steps:\n");
            quickSortInt(intArray, 0, intArraySize - 1);
            printf("\nSorted Integer Array: ");
            for (int i = 0; i < intArraySize; i++) {
                printf("%d ", intArray[i]);
            }
            printf("\n");
            break;
        }
        case 2: {
            int stringArraySize;
            printf("Enter the size of the string array: ");
            scanf("%d", &stringArraySize);
            
            char *stringArray[stringArraySize];
            printf("Enter %d strings for the string array:\n", stringArraySize);
            for (int i = 0; i < stringArraySize; i++) {
                stringArray[i] = (char *)malloc(100 * sizeof(char));
                scanf("%s", stringArray[i]);
            }
            
            printf("Original String Array: ");
            for (int i = 0; i < stringArraySize; i++) {
                printf("%s ", stringArray[i]);
            }
            printf("\n");
            
            printf("String Array Sorting Steps:\n");
            quickSortString(stringArray, 0, stringArraySize - 1);
            printf("\nSorted String Array: ");
            for (int i = 0; i < stringArraySize; i++) {
                printf("%s ", stringArray[i]);
            }
            printf("\n");
            
            // Free allocated memory for stringArray
            for (int i = 0; i < stringArraySize; i++) {
                free(stringArray[i]);
            }
            break;
        }
        default:
            printf("Invalid choice!\n");
    }

    return 0;
}
