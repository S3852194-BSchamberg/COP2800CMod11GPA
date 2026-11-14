// InvalidBirdDataException.java
// Brandon Schamberg
// 11/14/2026
// Exception file for Palmer Penguins

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
   public InvalidBirdDataException(String message) {
      super(message);
   }
}