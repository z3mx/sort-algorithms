package algorithms;

public class ReverseStringII {
    
    public static void main(String[] args) {
        ReverseStringII reverseStringII = new ReverseStringII();
        String s = "abcdefg";
        int k = 2;
        String result = reverseStringII.reverseStr(s, k);
        System.out.println("Reversed string: " + result);
    }

    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, charArray.length - 1);
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}
