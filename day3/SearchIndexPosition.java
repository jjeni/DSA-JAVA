package day3;

public class SearchIndexPosition {
    static int searchIndex(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        
        while(left<right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid -1;
            }
            else {
                left = mid +1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7, 8, 23};
        System.out.println(searchIndex(arr, 3));
    }
}
