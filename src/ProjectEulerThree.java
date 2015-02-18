/**
 * E17: ProjectEulerThree
 * Created by Weng on 2/2/2015.
 */
public class ProjectEulerThree {
  /** Main method.
   * @param args argument
   */
  public static void main(String[] args) {

    largePrimeFact(100);
  }

  public static long largePrimeFact(long targetNum) {

    long divider = 2;
    long lastPF = 0;

    while (targetNum > 1) {
      while (targetNum % divider == 0) {
        System.out.print(divider + " ");
        lastPF = divider;

        targetNum = targetNum / divider;

      }
      divider++;
    }

    return lastPF;
  }
}
