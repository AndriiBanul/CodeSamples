package main.java.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Banul on 4/13/2017.
 */
public class BubbleSort {

    public int [] sort(int [] array){
        boolean isSwap = true;
        int numbOfSwaps = 0;
        while(isSwap){
            for(int i=0; i<= array.length - 2; i++){
                if(array[i]<array[i+1]){
                    int t = array[i];
                    array[i] = array[i+1];
                    array[i+1] = t;
                    isSwap = true;
                    numbOfSwaps++;
                }
            }
            if(numbOfSwaps == 0){
                isSwap = false;
            }else{
                numbOfSwaps = 0;
            }
        }
        return array;
    }

    public static void main(String [] args){
        BubbleSort bubbleSort = new BubbleSort();
        int [] arr = {15,8,21,19,5,78,123,781,98,1};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
