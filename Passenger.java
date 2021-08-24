/*
 * Passenger
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 23, 2021
 * 
 * PURPOSE: This class will hold
 * information about a passenger.
 */

public class Passenger
{
  //Instance Variables
  private String firstName;
  private String lastName;
  private String nationality;
  private String tripOrigin;
  private String destination;
  private boolean flightTransfer; 
  private int age;
  
  /* Constructor - This constructor will be passed the parameters
   * firstName, lastName, nationality, tripOrigin, destination,
   * flightTransfer, and age. 
   */
  public Passenger(String firstName, String lastName, String nationality, String tripOrigin, String destination, boolean flightTransder, int age)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nationality = nationality;
    this.tripOrigin = tripOrigin;
    this.destination = destination;
    this.flightTransfer = flightTransfer;
    this.age = age;
  }//Passenger
  
}//Passenger