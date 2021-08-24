/*
 * Airplane
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 24, 2021
 * 
 * PURPOSE: This class will hold
 * information about an airplane.
 */

//Import needed for  ArrayList use
import java.util.ArrayList;

public class Airplane
{
  //Constant
  private static final int MAX_WEIGHT = 500000;
  
  //Instance Variables
  private String airline;
  private int numberPassengers;
  private int numberCrew;
  private int cargoWeight;
  private int kmToDestination;
  private double ticketCost;
  private ArrayList<Passenger> peopleOnBoard;
  
  /* This constructor will assign values to the 
   * instance variables (except peopleOnBoard) using
   * parameters of the same name. 
   */
  public Airplane(String airline, int numberPassengers, int numberCrew, int cargoWeight, int kmToDestination, double ticketCost)
  {
    //Set the instance variables
    this.airline = airline;
    this.numberPassengers = 0;
    this.numberCrew = numberCrew;
    this.cargoWeight = cargoWeight;
    this.kmToDestination = kmToDestination;
    this.ticketCost = ticketCost;
    peopleOnBoard = new ArrayList<Passenger>();
  }//Airplane
  
  /* toString - This method will return a 
   * String of the airplane information.
   */
  public String toString()
  {
    String stringReturn = null; 
    
    //Airplane info
    stringReturn += "Airline: "+airline;
    stringReturn += "Passengers: "+numberPassengers+" Crew: "+numberCrew;
    stringReturn += "Cargo Weight: "+cargoWeight+" Distance to Destination: "+kmToDestination+"km";
    stringReturn += "Cost of Ticket: $%4.2f"+ticketCost;
    stringReturn += "Passenger Manifest: \n";
    
    //Print out the info of the passengers on the plane
    for(int i=0;i<peopleOnBoard.size();i++)
    {
      stringReturn += (peopleOnBoard.get(i)).toString()+"\n";
    }//for
    
    return stringReturn;
  }//tostring
  
  /*Here is where the get and set methods will go*/
  
  /* addPassenger
   * 
   */
}//Airplane