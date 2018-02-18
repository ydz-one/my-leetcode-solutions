import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(12321)); // expected: true
		System.out.println(isPalindrome(467764)); // expected: true
		System.out.println(isPalindrome(3453)); // expected: false
	}

	/**
	 * This method determines whether an int is a palindrome or not.
	 * @param x an integer
	 * @return true if x is a palindrome, false otherwise
	 */
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        
        if (x / 10 == 0){
            return true;
        }
        
        List<Integer> digits = new ArrayList<>();
        
        while(x > 0){
            int digit = x % 10;
            digits.add(digit);
            x -= digit;
            x /= 10;
        }
        
        int leftPointer = 0;
        int rightPointer = digits.size() - 1;
        
        while (leftPointer < rightPointer){
            if (digits.get(leftPointer) == digits.get(rightPointer)){
                leftPointer++;
                rightPointer--;
            } else {
                return false;
            }
        }
        return true;
    }
}
