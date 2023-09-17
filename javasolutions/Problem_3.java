package javasolutions;

// NOTE - Algorithm works for 13195, but 600851475143 is too large to brute force and therefore test (without optimization)
public class Problem_3 {
  public static void main(String[] args) {
    // Brute force method
    // Find all prime factors in the target number and return the highest
    // All prime factors (except 2) are odd numbers

    // long targetNumber = 13195L;
    long targetNumber = 600851475143L;
    long largestFactor = -1;
    Boolean isPrime = true;

    // 1. check all numbers leading up to targetNumber.
    // 2. IF they are a factor (remainder = 0) of targetNumber, check if it's prime.
    // 3. set it as largest prime factor, then continue iterating.
    for(long a = 2; a < targetNumber; a++){
      // if it divides evenly into targetNumber (no remainder), it's a factor.
      if(targetNumber % a == 0){
        isPrime = true;
        // check if factor is a prime number
        for(long b = 2; b < a; b++){
          // if factor (int a) is divisible by any number besides 1 and itself, it is NOT prime.
          if(a % b == 0){
            isPrime = false;
            break;
          }
        }
        if(isPrime == true){
          largestFactor = a;
        }
      }     
    }
    System.out.println("Largest prime factor: " + largestFactor);
  }
}
