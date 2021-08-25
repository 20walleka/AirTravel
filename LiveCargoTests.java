/*
 * LiveCargoTests
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 25, 2021
 * 
 * PURPOSE: This class will be used
 * to test the methods in the LiveCargo
 * class. 
 */

import junit.framework.TestCase;

//Import needed for  ArrayList use
import java.util.ArrayList;

public class LiveCargoTests extends TestCase 
{ 
  LiveCargo cargo1 = new LiveCargo("Live Cargo",10,"Dog","Family Pet");
  
  /* testToStringMethod - This method will check to make
   * sure the toString method returns the anticipated String.
   */
  public void testToString()
  {
    String anticipated = "Cargo Type: Live Cargo\nWeights: 10kg\n Species: Dog Purpose of Travel: Family Pet";
    
    assertTrue("Strings do NOT match",anticipated.equals(cargo1.toString()));
  }//testToString
}//LiveCargoTests
