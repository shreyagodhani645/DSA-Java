public class Countsort{

    static int findMax(int[] arr){
            int mx = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > mx){
                    mx = arr[i];
                }
            }
            return mx;
        }
    public static void main(String[] args){
        int[] arr = {6,5,2,4,13,20};

        int max = findMax(arr);

        // 0 0 0 0 0 0
        // 0 1 0 1 1 1

        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int k = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k] = i;
                k++;
            }
        }

        System.out.println("Sorted array: ");
        for(int arrs : arr){
            System.out.print(arrs + " ");
            
        }
    }
}