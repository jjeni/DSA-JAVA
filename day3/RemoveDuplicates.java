package day3;
public class RemoveDuplicates {
    static int removeDuplicates(int[] arr){
        int i=0;
        int n = arr.length;
        for(int j=1; j<n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
