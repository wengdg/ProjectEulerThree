/**
 * E17: ProjectEulerThree
 * Created by Weng on 2/2/2015.
 */
public class ProjectEulerThree {
  public static void main(String[] args){

    long targetNum = 600851475143L;
    long divider = 2;
    long lastPF = 0;

    while(targetNum > 1){
      while(targetNum%divider == 0){
        System.out.print(divider + " ");
        lastPF = divider;

        targetNum = targetNum/divider;

      }
      divider++;
    }

    System.out.printf("\nLargest Prime Factor is %d", lastPF);
  }
}
