package algorithms;

public class RotateArray {

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        rotateArray.rotate2(nums, k);
        System.out.println("Rotated array: " + java.util.Arrays.toString(nums).replace(" ", ""));
    }
    
    public void rotate(int[] nums, int k) {
        int lastItem;
        for(int i = 0;i <= k;i++){
            System.out.println("Step :" + (k) + ": " + java.util.Arrays.toString(nums));
            lastItem = nums[nums.length - 1];
            nums = moveArrayRight(nums, lastItem);
        }
    }

    public int[] moveArrayRight(int[] arrayInt, int toMove){
        int[] newArray = new int[arrayInt.length];
        newArray[0] = toMove;
            for(int i=1;i<arrayInt.length;i++){
                newArray[i]=arrayInt[i-1];
            }
        return newArray;
    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length; // Handle cases where k is greater than array length
        reverse(nums, 0, nums.length - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Reverse the remaining elements
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateCloud(int[] nums, int k) {
        for(int i = 0;i < k;i++){
            //System.out.println("reading nums: "+ i +" : " + java.util.Arrays.toString(nums));
            int[] newArray = new int[nums.length];
            newArray[0] = nums[nums.length-1];
            for(int j = 1;j < nums.length;j++){
                newArray[j]=nums[j-1];
            }
            nums = newArray;
        }
        System.out.println(java.util.Arrays.toString(nums).replace(" ", ""));
    }
}
