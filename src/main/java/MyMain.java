import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        
        if (list.size() == 1 || i == list.size() - 1){
            return true;
        }
        if (list.get(i) > list.get(i + 1)) {
            return false;
        }
        else { 
            return isSortedRec(list, i + 1);
        }

    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        
        if (i == array.length){
            if (count == total){
                return true;
            }
            else {
                return false;
            }
        }
        if (arr[i] == x){
            return(hasCountCopiesRec(arr, x, count++, i++, total++));
        }
        else {
            return(hasCountCopiesRec(arr, x, count, i++, total++));
        }

    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        
        if (upperBound >= lowerBound && lowerBound < arr.length - 1) { 
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if (arr[mid] == num){
                return true;
            }
            if (arr[mid] > num){
                return binarySearchRec(arr, num, lowerBound, mid - 1);
            }
            else {
                return binarySearchRec(arr, num, mid + 1, upperBound);
            }
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        System.out.println(isSorted(lst));
        int[] intArray = new int[4];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 2;
        intArray[3] = 6;
    }
}
