/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mehmet
 */
public class Hoare {
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
 
        while (true) {
            // Find leftmost element greater
            // than or equal to pivot
            do {
                i++;
            } while (arr[i] < pivot);
 
            // Find rightmost element smaller
            // than or equal to pivot
            do {
                j--;
            } while (arr[j] > pivot);
 
            // If two pointers met.
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // swap(arr[i], arr[j]);
        }
    }
 
    /* The main function that
       implements QuickSort
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    static void sort(int[] arr, int low, int high)
    {
        if (low < high) {
            /* pi is partitioning index,
            arr[p] is now at right place */
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            sort(arr, low, pi);
            sort(arr, pi + 1, high);
        }
    }
 
}
