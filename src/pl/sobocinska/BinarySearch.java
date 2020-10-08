package pl.sobocinska;

public class BinarySearch {


    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int mid;

        while(l <= r){
            mid = (l + r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }



    // Recursive way:

    public int BinarySearch(int arr[], int l, int r, int x){
        if(r >= 1){
            int mid = 1 + (r-1) / 2;

            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                return BinarySearch(arr, l,mid-1, x);
            }
            if(arr[mid] < x){
                return BinarySearch(arr, l,mid+1, x);
            }
        }
        return -1;
    }
}
