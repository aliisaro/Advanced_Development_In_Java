package Module5_MultithreadingAndUnitTesting.Part4.Task1_PalindromeChecker;

public class PalindromeChecker {
    public String transformInput(String input) {
        return input.toLowerCase().replaceAll("[^a-zA-Z]", ""); //remove non-letters
    }
    public boolean checkPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
    public boolean isPalindrome(String str) {
        String transformed = transformInput(str);

        if (checkPalindrome(transformed)) {
            return true;
        } else {
            return false;
        }
    }

}
