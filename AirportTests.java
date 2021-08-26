/*
 * AirportTests
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 25, 2021
 * 
 * PURPOSE: This class will be used
 * to test the methods in the Airport
 * class. 
 */

import junit.framework.TestCase;

//Import needed for  ArrayList use
import java.util.ArrayList;

public class AirportTests extends TestCase 
{
  private Airport airport1 = new Airport(34,"CYWG");
  
  /* testGetSetMethods - This method
   * will be used to test getWindSpeed,
   * setWindSpeed, and getAirportCode.
   */
  public void testGetSetMethods()
  {
    int windGet = 34;
    int windSet = 27;
    String airportCodeGet = "CYWG";
      
    assertEquals("Winds from get method do not match",windGet,airport1.getWindSpeed());
    airport1.setWindSpeed(windSet);
    assertEquals("Winds from set method do not match",windSet,airport1.getWindSpeed());
    assertTrue("Airport Codes do not match",airportCodeGet.equals(airport1.getAirportCode()));
  }//testGetSetMethods
}//AirportTests