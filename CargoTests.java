/*
 * CargoTests
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 25, 2021
 * 
 * PURPOSE: This class will be used
 * to test the methods in the Cargo
 * class. 
 */

import junit.framework.TestCase;

//Import needed for  ArrayList use
import java.util.ArrayList;

public class CargoTests extends TestCase 
{ 
  Cargo cargo1 = new Cargo("Mail",57);
  
  /* testGetMethod - This method will check 
   * to make sure the correct information is
   * returned from getWeight
   */
  public void testGetMethod()
  {
    int weight = 57;
    
    assertEquals("The weights do NOT match",weight,cargo1.getWeight());
  }//testGetMethod
  
  /* testToStringMethod - This method will check to make
   * sure the toString method returns the anticipated String.
   */
  public void testToString()
  {
    String anticipated = "Cargo Type: Mail\nWeights: 57kg";
    
    assertTrue("Strings do NOT match",anticipated.equals(cargo1.toString()));
  }//testToString
}//CargoTests
