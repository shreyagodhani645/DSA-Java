public class Bubblesort{

    public static void main(String[] args){
        int nums[] = {6,5,3,7,2,12,34};
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]= temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for(int num : nums){
            System.out.print(num + " ");
            
        }
    }
}