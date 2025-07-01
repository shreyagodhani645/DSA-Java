public class SelectionSort{

    public static void main(String[] args){
        int nums[] = {3,5,12,34,5,2};
        int size = nums.length;
        int temp = 0;
        int midIndex = -1;

        for(int i = 0; i < size -1; i++){
            midIndex = i;
            for(int j = i+1; j < size; j++){
                if(nums[midIndex] > nums[j]){
                    midIndex = j;
                }
                temp = nums[midIndex];
                nums[midIndex]= nums[i];
                nums[i] = temp;
            }
        }
        System.out.println("Sorted array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}