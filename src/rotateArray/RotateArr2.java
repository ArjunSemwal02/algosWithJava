package rotateArray;

import java.util.Arrays;

public class RotateArr2 {
    // in place rotation

    public static void main(String[] args) {
        int arr[] = {6,7,8,9,0,34, 67, 45};
        System.out.println(Arrays.toString(rotation(arr, 2)) );
    }

    public static int[] rotation(int arr[], int n){

        int r = n - 1;
        int temp = 0;
        for(int l = 0; l <= (n - 1)/2; l++){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r--] = temp;
        }

        int r2 = arr.length - 1;
        int temp2 = 0;
        for(int l = n; l <= (arr.length - 1)/2; l++){
            temp2 = arr[l];
            arr[l] = arr[r2];
            arr[r2--] = temp2;
        }

        int r3 = arr.length - 1;
        int temp3 = 0;
        for(int l = 0; l <= (arr.length - 1)/2; l++){
            temp3 = arr[l];
            arr[l] = arr[r3];
            arr[r3--] = temp3;
        }


        return arr;
    }
}
