package algorithms;

class RunningSumArray {

    public static void main(String[] args) {
        RunningSumArray runningSumArray = new RunningSumArray();
        int nums[] = {1, 2, 3, 4};
        int result[] = runningSumArray.runningSum(nums);
        System.out.println("Running sum array: " + java.util.Arrays.toString(result));
    }

    /**
     *  solution provided by AI
     */
    public int[] runningSumAi(int[] nums) {
        int runningSum[] = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }

    /**
     *  solution provided by me
     */
    public int[] runningSum(int[] nums) {
        int output[] = new int[nums.length];
        int total = 0;
        for(int i = 0; i < nums.length;i++){
            total += nums[i];
            output[i] = total;
        }
        return output;
    }
}