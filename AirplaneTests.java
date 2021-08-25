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
  private int cargoWeight = 0;
  private int kmToDestination = 5842;
  private double ticketCost = 589.40;
  private String tripOrigin = "Winnipeg";
  private String destination = "Dublin";
  private Passenger passengerTest1 =new Passenger("Jane","Green","Canadian","Winnipeg","Dublin",47);
  private Passenger passengerTest2 =new Passenger("Jill","Green","Canadian","Winnipeg","Dublin",45);
  private Passenger passengerTest3 =new Passenger("Marvin","Adams","Irish","Winnipeg","Dublin",67);
  private ArrayList<Passenger> peopleOnBoard =  new ArrayList<Passenger>();
  private Airplane plane1 = new Airplane("Air Canada",7,5842,589.40,"Winnipeg","Dublin");
  private Cargo cargo1 = new Cargo("Passenger Bags",5678);
  private Cargo cargo2 = new Cargo("Mail",494325);
  
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
  
  /* testToStringMethod - This method will check to make
   * sure the toString method returns the anticipated String.
   */
  public void testToString()
  {
    String anticipated = "Airline: "+airline+"\nDeparting From: "+tripOrigin+" Arriving: "+destination+"\nPassengers: "+numberPassengers+" Crew: "
      +numberCrew+"\nCargo Weight: "+cargoWeight+" Distance to Destination: "+kmToDestination+"km"+String.format("\nCost of Ticket: $%4.2f",ticketCost)+"\n";
    
    assertTrue("Strings do NOT match",anticipated.equals(plane1.toString()));
  }//testToString
  
  /* testAddPassenger - This method will test the addPassenger methods
   * in the Airplane class.
   */
  public void testAddPassenger()
  {
    String compareTo = "Jane Green\nJill Green\nMarvin Adams\nHannah McLean\nAnita Kumar\nNoah Vogel";
    
    //Add Passengers 
    plane1.addPassenger(passengerTest1);
    plane1.addPassenger(passengerTest2);
    plane1.addPassenger(passengerTest3);
    plane1.addPassenger("Hannah", "McLean", "British", "Winnipeg", "Dublin", 33);
    plane1.addPassenger("Anita", "Kumar", "Canadian", "Winnipeg", "Dublin", 24);
    plane1.addPassenger("Noah", "Vogel", "German", "Winnipeg", "Dublin", 56);
    
    assertTrue("List is incorrect",compareTo.equals(plane1.passengerManifest()));
  }//testAddPassenger
  
  /* testAddCargo - This method will test the addCargo method
   * in the Airplane class.
   */
  public void testAddCargo()
  {
    int compareTo1 = 5678;
    
    plane1.addCargo(cargo1);
    
    assertEquals("Cargo Weight is not equal", compareTo1, plane1.getCargoWeight());
    
    plane1.addCargo(cargo2); //This should not be added since it will be over the MAX_WEIGHT
    
    //Check that it wasn't updated
    assertEquals("Cargo Weight is not equal", compareTo1, plane1.getCargoWeight());  
  }//testAddCargo
}//AirplaneTests
