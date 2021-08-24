/*
 * PassengerTests
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 23, 2021
 * 
 * PURPOSE: This class will be used
 * to test the methods in the Passenger
 * class. 
 */

import junit.framework.TestCase;

public class PassengerTests extends TestCase 
{
    private String lastName = "Smith";
    private String firstName = "Josh";
    private String nationality = "Canadian";
    private String tripOrigin = "Winnipeg";
    private String destination = "Dublin";
    private int age = 47; 
    private Passenger passenger1 = new Passenger("Josh","Smith","Canadian","Winnipeg","Dublin",47);
    
  /* testToStringMethod - This method
   * will check to make sure the toString
   * method returns the correct result. 
   */
  public void testToStringMethod() 
  {
    String wantedString = null;
    
    //Create the String to use in the test
    wantedString = "Name: "+lastName+", "+firstName+"\n";
    wantedString += "Age: "+age+"\n";
    wantedString += "Nationality of Passenger: "+nationality+"\n";
    wantedString += "Trip Origin: "+tripOrigin+"\n";
    wantedString += "Trip Destination: "+destination+"\n";

    assertTrue("The Strings do NOT match",wantedString.equals(passenger1.toString()));
  }//testToStringMethod
  
  /* testGetMethods - This method will check 
   * to make sure the correct information is
   * returned from getPassengerName, getAge,
   * getNationality, getTripOrigin, and getDestination.
   */
  public void testGetMethods()
  {
    assertTrue("Passenger Names do NOT match",(firstName+" "+lastName).equals(passenger1.getPassengerName()));
    assertEquals("Passenger Ages do NOT match",age,passenger1.getAge());
    assertTrue("Nationalities do NOT match",nationality.equals(passenger1.getNationality()));    
    assertTrue("Trip Origins do NOT match",tripOrigin.equals(passenger1.getTripOrigin()));
    assertTrue("Destinations do NOT match",destination.equals(passenger1.getDestination()));
  }//testGetMethods
  
  /* testChangeDestination - This method will check
   * to make sure the destination of the passenger will
   * update correctly. 
   */
  public void testChangeDestination()
  {
    //Change destination for test
    destination = "Berlin";
    passenger1.changeDestination("Berlin");
    
    assertTrue("The destination was NOT changed",destination.equals(passenger1.getDestination()));
  }//testChangeDestination
}//PassengerTests
