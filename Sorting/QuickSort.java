package Sorting;

public class QuickSort {
    public static void quick(int[] arr, int low, int high){
        if(low < high){
            int pIndex = sorting(arr, low,  high);
            quick(arr, low, pIndex-1);
            quick(arr, pIndex+1, high);
        }
    }

    public static int sorting(int[] arr, int low, int high){
        int i= low, j = high;
        int pivot = arr[low];
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low-1) {
                j--;
            }
            if(i<j){
                swap(arr, i , j);
            }
        }
        swap(arr, j, low);
        return j;
    }

    public static void swap(int[] arr, int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,21};
        quick(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
