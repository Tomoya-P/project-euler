package javasolutions;

public class Problem_2 {
  public static void main(String args[]) {
    int sum = 0;
    int prev = 1;
    int next = 0;
    // First must create normal fibonacci loop
    for(int a = 2; a < 4000000;){
      if(a % 2 == 0){
        sum += a;
      }
      next = a + prev;
      prev = a;
      a = next;
    }
    System.out.println("Final sum of even numbers: " + sum);
  }
}
