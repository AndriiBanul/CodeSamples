package main.java.pack;

import java.util.Arrays;

/**
 * Created by Andrii_Banul on 4/13/2017.
 */
public class QuickSort {
    public int [] sort(int [] arr){
        int mid = (arr.length - 1) / 2;
        System.out.println("mid = " + mid);
        for(int i = 0; i<= arr.length - 1; i++){
            int leftValue = i;
            int rightValue = arr.length - 1 - i;
            if(arr[mid]<arr[leftValue]){
                this.moveToTheRight(mid, leftValue, arr);
            }
            if(arr[mid]>arr[rightValue]){
                moveToTheLeft(mid, rightValue, arr);
            }
        }
        return arr;
    }

    public void moveToTheRight(int front, int el, int [] arr){
        int startEl = arr[el];

        for(int i = el; i<=front-1; i++){
            arr[i] = arr[i+1];
        }
        arr[front]=startEl;
    }

    public void moveToTheLeft(int front, int el, int [] arr){
        int mid = arr[el];

        for(int i = el ; i>front; i--){
            arr[i] = arr[i-1];
        }
        arr[front]=mid;
    }


    public static void main(String [] args){

        int [] arr = {9,7,22,1,4,15,21};
        QuickSort quickSort = new QuickSort();
/*
        quickSort.moveToTheLeft(2, 5, arr);
        quickSort.moveToTheRight(3, 1, arr);
*/
        quickSort.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
