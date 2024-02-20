package linear.search;

/**
 * In the first example we are returning boolean value
 * In This We are going to return boolean value
 *
 * @author Abhishek Tiwari
 */
public class LinerSearch1DEx2 {
    public static void main(String[] args) {
        int[] arr = {21, 44, 56, 78, 34, 90, 86, 90}; // homogeneous items only in array
        int target = 44; // integer type target
        boolean answer = linearSearch(arr, target); // storing the return  value in the boolean answer variable
        System.out.println(answer); // print the final answer
    }

    static boolean linearSearch(int[] arr, int target) {
        //check that the array is not empty
        if (arr.length == 0) // if array having zero length then return -1
            return false;

        // by using for loop we are iterating over each and every element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) // if the current index having the same object or copy of that then return the index number
                return true;
        }

        // if the given target not found in the Array so return -1 by default case
        return false;
    }
}