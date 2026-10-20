package palindromeNumber;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(232));   // true
        System.out.println(solution.isPalindrome(-121));  // false
        System.out.println(solution.isPalindrome(10));    // false
    }
}