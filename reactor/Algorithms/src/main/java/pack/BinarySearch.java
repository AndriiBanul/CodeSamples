package pack;

/**
 * Created by Andrii_Banul on 4/13/2017.
 */
public class BinarySearch {

    public Integer getElementIndex(int [] array, int el){
        int start = 0;
        int end = array.length -1;
        while(start <= end){
            int middle = (start + end) / 2;
            if(array[middle] == el){
                return middle;
            }
            if(el > array[middle]){
                start = middle + 1;
            } else{
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        BinarySearch binarySearch = new BinarySearch();
        int [] arr = {0,5,9,15,18,25,123,781};
        int res = binarySearch.getElementIndex(arr, 781);
        System.out.println(res);
    }
}
