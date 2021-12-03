package de.devopenspace.jenkins;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 * Hello world.
 */
public class JenkinsApp {

  private static final Logger log = System.getLogger("JenkinsApp");

  public static void main(final String[] args) {
    final var name = "Workshop";
    log.log(Level.INFO, "Hello " + name + "!");
  }
}
