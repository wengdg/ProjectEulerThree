import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testing class for ProjectEulerThree.
 */
public class ProjectEulerThreeTest {

  /**
   * Calculates largest prime factor of 10 and 28.
   * @throws Exception If error occurs.
   */
  @Test
  public void testLargePrimeFact() throws Exception {
    assertEquals("testing for largest prime factor of 10", 5, ProjectEulerThree.largePrimeFact(10));
    assertEquals("testing for largest prime factor of 28", 7, ProjectEulerThree.largePrimeFact(28));
  }
}