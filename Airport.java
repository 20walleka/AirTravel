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
  
  /* getWindSpeed - This method will
   * return the windSpeed.
   */
  public int getWindSpeed()
  {
    return windSpeed;
  }//getWindSpeed
  
  /* setWindSpeed - This method will
   * be used to get the windSpeed.
   */
  public void setWindSpeed(int newSpeed)
  {
    windSpeed = newSpeed;
  }//setWindSpeed
  
  /* getAirportCode - This method will
   * return the airportCode String.
   */
  public String getAirportCode()
  {
    return airportCode;
  }//getAirportCode
  
  /* addAirplane - This method will
   * add an Airplane object to the array
   * list of planes at the airport. It
   * will also update the number of passengers,
   * crew, and planes at the airport. 
   */
  public void addAirplane(Airplane planeAdd)
  {
    planeList.add(planeAdd);
    totalPassengers += planeAdd.getNumberPassengers();
    totalCrew += planeAdd.getNumberCrew();
    numberPlanes++;
  }//addAirplane
  
  /* printPlaneList - This method will return the
   * current planeList as a String.
   */
  public String printPlaneList()
  {
    String toReturn = "";
    
    //Loop to print the current planes at the airport.
    for(int i=0;i<planeList.size();i++)
    {
      toReturn += planeList.get(i).getAirline()+" From: "+planeList.get(i).getTripOrigin()+" To: "+planeList.get(i).getDestination()+"\n";
    }//for
    
    return toReturn;
  }//printPlaneList
  
  /* totalPlanes - This method will 
   * return the total number of planes
   * at the airport.
   */
  public int totalPlanes()
  {
    return numberPlanes;
  }//totalPlanes
  
  /* totalPassengers - This method will 
   * return the total number of passengers
   * at the airport. 
   */
  public int totalPassengers()
  {
    return totalPassengers;
  }//totalPassengers
  
  /* totalCrew - This method will 
   * return the total number of crew
   * at the airport.
   */
  public int totalCrew()
  {
    return totalCrew;
  }//totalCrew
  
  /* toString - This method will return a 
   * String of the airport information.
   */
  public String toString()
  {
    return "Airport Code: "+airportCode+" Current Wind Speed: "+windSpeed;
  }//toString
}//Airport
