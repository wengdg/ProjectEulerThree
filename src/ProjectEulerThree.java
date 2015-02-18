/**
 * E17: ProjectEulerThree
 * Created by Weng on 2/2/2015.
 */
public class ProjectEulerThree {

  /**
   * Calculate the largest prime factor of 600851475143.
   *
   * @param args argument
   */
  public static void main(String[] args) {

    System.out.print(largePrimeFact(600851475143L));
  }

  /**
   * Calculate the largest prime factor of targetNum.
   *
   * @param targetNum The number to find the largest prime factor of.
   * @return The largest prime factor.
   */
  public static long largePrimeFact(long targetNum) {

    long divider = 2;
    long lastPF = 0;

    while (targetNum > 1) {
      while (targetNum % divider == 0) {
        lastPF = divider;

        targetNum = targetNum / divider;

      }
      divider++;
    }

    return lastPF;
  }
}
