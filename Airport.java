/*
 * Airplane
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 25, 2021
 * 
 * PURPOSE: This class will hold
 * information about an Airport.
 */

//Import needed for  ArrayList use
import java.util.ArrayList;

public class Airport
{
  //Instance Variables
  private int windSpeed;
  private String airportCode;
  private int numberPlanes;
  private int totalPassengers;
  private int totalCrew;
  private ArrayList<Airplane> planeList;
  
  /* This constructor will assign values to the 
   * instance variables windSpeed and airportCode
   * using the parameters of the same name.
   * Other variables numberPlanes,totalPassengers,
   * totalCrew, and planeList will also be set. 
   */
  public Airport(int windSpeed, String airportCode)
  {
    this.windSpeed = windSpeed;
    this.airportCode = airportCode;
    numberPlanes = 0;
    totalPassengers = 0;
    totalCrew = 0;
    planeList = new ArrayList<Airplane>();
  }//Airport
  
  
}//Airport
