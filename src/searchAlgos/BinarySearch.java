package searchAlgos;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {6,7,8,9};
        System.out.println(binarySearchAlgo(arr, 8));
    }

    public static int binarySearchAlgo(int arr[], int elem){

        int start = 0, end = arr.length - 1;

        for(int i = start; i <= end; i++){
            int mid = (start + end)/2;

//          if(elem == arr[mid]) return mid;
            if(arr[i] == elem) return i;
            else if(elem < arr[mid]) end = mid - 1;
            else start = mid + 1;

        }
        return -1;
    }

}
