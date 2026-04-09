package algorithms;

import java.sql.Timestamp;
import java.util.Arrays;

class MergeSortedExercise {

    public static void main(String[] args) {
        MergeSortedExercise mergeSortedExercise = new MergeSortedExercise();
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Start time: " + timestamp);
        mergeSortedExercise.merge(nums1, 3, nums2, 3);
            Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
        System.out.println("End time: " + timestamp2);
         int nums3[] = {1,2,3,0,0,0};
        int nums4[] = {2,5,6};
        Timestamp timestamp3 = new Timestamp(System.currentTimeMillis());
        System.out.println("Start time: " + timestamp3);
        mergeSortedExercise.merge2(nums3, 3, nums4, 3);
            Timestamp timestamp4 = new Timestamp(System.currentTimeMillis());
        System.out.println("End time: " + timestamp4);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int leftArray[] = Arrays.copyOfRange(nums1, 0, m);
        int rightArray[] = Arrays.copyOfRange(nums2, 0, n);
        int newNums1[] = new int[leftArray.length + rightArray.length];

        //System.out.println("the size of new Array is "+newNums1.length);
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                newNums1[k++] = leftArray[i++];
            } else {
                newNums1[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            newNums1[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            newNums1[k++] = rightArray[j++];
        }
        System.arraycopy(newNums1, 0, nums1, 0, newNums1.length);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int n1=m-1;
        int n2=n-1;
        int res=n+m-1;
        while(n1>=0 && n2>=0){
            if(nums1[n1]>=nums2[n2]){
                nums1[res]=nums1[n1];
                n1--;
            }
            else{
                nums1[res]=nums2[n2];
                n2--;
            }
            res--;
        }
         while (n2 >= 0) {
            nums1[res] = nums2[n2];
            n2--;
            res--;
        }
        
    }
}