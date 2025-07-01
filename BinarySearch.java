public class BinarySearch{

    public static void main(String[] args){
        int nums[] = {1,3,5,7,9,11,12,14};
        int left = 0;
        int right = nums.length - 1;
        int target = 12;

        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                break;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}