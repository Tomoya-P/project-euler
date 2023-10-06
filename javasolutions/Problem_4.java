package javasolutions;

public class Problem_4 {
  public static void main(String args[]) {

    // Method 1: Start with palindromes
    // fill array with all possible palindromes
    // from largest to smallest
    //  - check if palindrome
    //  - find it's parent numbers (quotient)
    //    a. divide by 3 digit ints
    //    b. check if it has remainder (%)

    // Method 2: Start with 3-digit numbers
    // largest to smallest
    // multiply, check if result is palindrome

    int largestPali = -1;

    for(int a = 999; a <= 0; a--){
      for(int b = 999; b <= 0; b--){
        int product = a * b;
        // check if palindrome
        if(isPalindrome(product)){
          largestPali = product;
          System.out.println("Largest palindrome: " + largestPali);
          break;
        }
      }
      System.out.println(a);
    }
  }

  // pulled from https://stackoverflow.com/questions/43516020/how-to-check-if-a-number-is-palindrome-in-java
  public static boolean isPalindrome(int integer) {
    int palindrome = integer;
    int reverse = 0;

    // Compute the reverse
    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

    // The integer is palindrome if integer and reverse are equal
    return integer == reverse; // Improved by Peter Lawrey
  } 
}

