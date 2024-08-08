package Sorting;

import java.util.ArrayList;

public class MergeSort {
    static void mergesort(int[] a, int low, int high){
        //if single element is passed then return
        if(low == high) return;

        int mid = (low+high)/2;

        //create subarrays 
        mergesort(a, low, mid);
        mergesort(a, mid+1, high);

        //merge function
        merge(a, low, mid, high);
    }

    static void merge(int[] a, int low, int mid, int high){
        //using extra space to store the sorted elements
        ArrayList<Integer> b = new ArrayList<>();
        int left = low;
        int right = mid+1;

        //addding elements in ascending order
        while(left<=mid && right<=high){
            if(a[left] <= a[right]){
                b.add(a[left]);
                left++;
            }else{
                b.add(a[right]);
                right++;
            }
        }

        //for extra elements if the subarray length more than the other one
        while(left<=mid){
            b.add(a[left]);
            left++;
        }
        while(right<=high) {
            b.add(a[right]);
            right++;
        }

        //swaping the array elements with the sorted array elements
        for(int i=low;i<=high;i++){
            a[i] = b.get(i-low);
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{4,3,2,1};
        mergesort(a, 0, a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
