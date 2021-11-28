package de.devopenspace.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

/**
 * Unit test for simple JenkinsApp.
 */
class JenkinsAppTest {

  /**
   * Rigorous Test :-)
   */
  @Test
  void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  /**
   * Is this right?
   */
  @Test
  @DisabledIfEnvironmentVariable(named = "CI_SERVER", matches = ".*Jenkins.*")
  void shouldAdhereToTheRulesOfMathematics() {
    assertEquals(3, 1 + 1);
  }
}
