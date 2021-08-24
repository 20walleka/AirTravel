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
  /* testToStringMethod - This method
   * will check to make sure the toString
   * method returns the correct result. 
   */
  public void testToStringMethod() 
  {
    String wantedString = null;
    String lastName = "Smith";
    String firstName = "Josh";
    String nationality = "Canadian";
    String tripOrigin = "Winnipeg";
    String destination = "Dublin";
    int age = 47;
    
    Passenger passenger1 = new Passenger("Josh","Smith","Canadian","Winnipeg","Dublin",47);
    
    wantedString = "Name: "+lastName+", "+firstName+"\n";
    wantedString += "Age: "+age+"\n";
    wantedString += "Nationality of Passenger: "+nationality+"\n";
    wantedString += "Trip Origin: "+tripOrigin+"\n";
    wantedString += "Trip Destination: "+destination+"\n";

    assertTrue("The Strings do NOT match",wantedString.equals(passenger1.toString()));
  }//testToStringMethod
}//PassengerTests
