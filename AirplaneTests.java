/*
 * AirplaneTests
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 24, 2021
 * 
 * PURPOSE: This class will be used
 * to test the methods in the Airplane
 * class. 
 */

import junit.framework.TestCase;

//Import needed for  ArrayList use
import java.util.ArrayList;

public class AirplaneTests extends TestCase 
{
  private String airline = "Air Canada";
  private int numberPassengers = 0;
  private int numberCrew = 7;
  private int cargoWeight = 4700;
  private int kmToDestination = 5842;
  private double ticketCost = 589.40;
  private String tripOrigin = "Winnipeg";
  private String destination = "Dublin";
  private ArrayList<Passenger> peopleOnBoard =  new ArrayList<Passenger>();
  private Airplane plane1 = new Airplane("Air Canada",0,7,4700,5842,589.40,"Winnipeg","Dublin");
  
  /* testGetMethods - This method will check 
   * to make sure the correct information is
   * returned from getAirline, getNumberPassengers,
   * getNumberCrew, getCargoWeight, getKmToDestination,
   * getTicketCost, getTripOrigin, and getDestination.
   */
  public void testGetMethods()
  {
    assertTrue("Airline Names do NOT match",airline.equals(plane1.getAirline()));
    assertEquals("Number of Passengers so NOT match",numberPassengers,plane1.getNumberPassengers());
    assertEquals("Number of Crew so NOT match",numberCrew,plane1.getNumberCrew());    
    assertEquals("Cargo Weights do NOT match",cargoWeight,plane1.getCargoWeight());
    assertEquals("The distance to the destinations do NOT match",kmToDestination,plane1.getKmToDestination());
    assertEquals("Ticket costs do NOT match",ticketCost,plane1.getTicketCost());
    assertTrue("Trip Origins do NOT match ",tripOrigin.equals(plane1.getTripOrigin()));
    assertTrue("Destinations do NOT match",destination.equals(plane1.getDestination()));
  }//testGetMethods
}//AirplaneTests
