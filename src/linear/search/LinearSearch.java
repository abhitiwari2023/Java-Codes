package linear.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {21, 44, 56, 78, 34, 90, 86, 90}; // homogeneous items only in array
        int target = 44; // integer type target
        int answer = linearSearch(arr, target); // storing the return int value in the int answer variable
        System.out.println(answer); // print the final answer
    }

    static int linearSearch(int[] arr, int target) {
        //check that the array is not empty
        if (arr.length == 0) // if array having zero length then return -1
            return -1;

        // by using for loop we are iterating over each and every element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) // if the current index having the same object or copy of that then return the index number
                return i;
        }

        // if the given target not found in the Array so return -1 by default case
        return -1;
    }
}
