#include <stdio.h>

void quick_sort(int arr[], int left, int right) {
    if (left >= right) {
        return;
    }

    int pivot = arr[left];
    int i = left + 1;
    int j = right;

    while (i <= j) {
        while (i <= j && arr[i] <= pivot) {
            i++;
        }
        while (i <= j && arr[j] > pivot) {
            j--;
        }
        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];                            
            arr[j] = temp;
        }
    }

    int temp = arr[left];
    arr[left] = arr[j];
    arr[j] = temp;

    quick_sort(arr, left, j - 1);
    quick_sort(arr, j + 1, right); 
}

int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    quick_sort(arr, 0, n - 1);

    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}