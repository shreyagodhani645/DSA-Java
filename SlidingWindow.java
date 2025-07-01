public class SlidingWindow{
    public static void main(String[] args){
        int[] arr = {2,9,31,-4,21,7};

        int wSum = 0;
        int mSum = -1;
        int k = 3;
        for(int i = 0; i < k; i++){
            wSum = wSum + arr[i];
        }
        for(int i = k; i < arr.length; i++){
            wSum = wSum - arr[i-k] + arr[i];
            mSum = Math.max(mSum,wSum);
        }

        System.out.println(mSum);
    }
}