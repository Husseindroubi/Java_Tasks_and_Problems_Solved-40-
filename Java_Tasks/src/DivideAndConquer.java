public class DivideAndConquer {
    static int recursion(int[] arr, int min, int max) {
        if (min == max) { //if the subArray elements are 1, then return one of them
            return arr[max];
        }
        int mid = (min + max)/2;
        int arr1 = recursion(arr, min, mid);
        int arr2 = recursion(arr, mid + 1, max);

        return Math.max(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] array = {6, 64, 88, 8, 12, 1, 100, 10, 33, 18, 26, 24, 51, 36, 13, 15};
        int arrayMid = (array.length/2)-1;

        int max1 = recursion(array, 0, arrayMid);
        System.out.println("Max number of array left: " + max1);
        int max2 = recursion(array, arrayMid+1, array.length-1);
        System.out.println("Max number of array right: " + max2);
        int maximal = recursion(array, 0, array.length-1);
        System.out.println("Max number of the whole array: " + maximal);

    }
}
