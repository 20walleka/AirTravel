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
  private Airplane plane1 = new Airplane("Air Canada",7,5842,589.40,"Winnipeg","Dublin");
  private Airplane plane2 = new Airplane("WestJet",8,2048,147,"Winnipeg","Toronto");
  private Airplane plane3 = new Airplane("Sunwing",10,3253,456,"Winnipeg","Orlando");
  
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
  
  /*testAddAirplane - This method will test to 
   * make sure that airplanes are added correctly.
   * It will also test the printPlaneList as well.
   */
  public void testAddAirplane()
  {
    String toCompare = "Air Canada From: Winnipeg To: Dublin\nWestJet From: Winnipeg To: Toronto\nSunwing From: Winnipeg To: Orlando\n";
    System.out.print(toCompare);
    airport1.addAirplane(plane1);
    airport1.addAirplane(plane2);
    airport1.addAirplane(plane3);
    assertTrue("Added Plane Lists do not match",toCompare.equals(airport1.printPlaneList()));
  }//testAddAirplane
}//AirportTests