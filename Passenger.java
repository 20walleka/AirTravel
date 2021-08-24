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
  private int age;
  
  /* Constructor - This constructor will be passed the parameters
   * firstName, lastName, nationality, tripOrigin, destination,
   * and age. 
   */
  public Passenger(String firstName, String lastName, String nationality, String tripOrigin, String destination, int age)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nationality = nationality;
    this.tripOrigin = tripOrigin;
    this.destination = destination;
    this.age = age;
  }//Passenger
  
  /* toString - This method will return a String of passenger information.
   * The String te return has firstName, lastName, nationality, tripOrigin,
   * destination, flightTransfer, and age. 
   */
  public String toString()
  {
    String toReturn = null;
    
    toReturn = "Name: "+lastName+", "+firstName+"\n";
    toReturn += "Age: "+age+"\n";
    toReturn += "Nationality of Passenger: "+nationality+"\n";
    toReturn += "Trip Origin: "+tripOrigin+"\n";
    toReturn += "Trip Destination: "+destination+"\n";
    
    return toReturn;
  }//toString
  
  /* getPassengerName - This method will return the full 
   * name of the passenger. The name will be returned as a
   * String.
   */
  public String getPassengerName()
  {
    return firstName+" "+lastName;
  }//getPassengerName
  
  /* getAge - This method will return the age of the passenger.
   * The age will be returned as an int.
   */
  public int getAge()
  {
    return age;
  }//getAge
  
  /* getNationality - This method will return the nationality
   * of the passenger as a String.
   */
  public String getNationality()
  {
    return nationality;
  }//getNationality
  
  /* getTripOrigin - This method will return the tripOrigin
   * of the passenger as a String
   */
  public String getTripOrigin()
  {
    return tripOrigin;
  }//getTripOrigin
  
  /* getDestination - This method will return the destination
   * of the passenger as a String.
   */
  public String getDestination()
  {
    return destination;
  }//getDestination
}//Passenger