package Test_B;
public class Q1{
    public static void main(String[] args) {
        String input = "retlaohS";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the indices towards the center
            left++;
            right--;
        }
        return new String(charArray);
    }
}