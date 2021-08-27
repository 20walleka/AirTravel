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
  private String tripOrigin;
  private String destination;
  private ArrayList<Passenger> peopleOnBoard;
  private ArrayList<Cargo> cargoOnBoard;
  
  /* This constructor will assign values to  
   * instance variables using
   * parameters of the same name. 
   */
  public Airplane(String airline, int numberCrew, int kmToDestination, double ticketCost, String tripOrigin, String destination)
  {
    //Set the instance variables
    this.airline = airline;
    this.numberPassengers = 0;
    this.numberCrew = numberCrew;
    this.cargoWeight = 0;
    this.kmToDestination = kmToDestination;
    this.ticketCost = ticketCost;
    this.tripOrigin = tripOrigin;
    this.destination = destination;
    peopleOnBoard = new ArrayList<Passenger>();
    cargoOnBoard = new ArrayList<Cargo>();
  }//Airplane
  
  /* getAirline - This method will return the
   * name of the airline as a String.
   */
  public String getAirline()
  {
    return airline;
  }//getAirline
  
  /* getNumberPassengers - This method will return the
   * number of passengers on the airplane as an int.
   */
  public int getNumberPassengers()
  {
    return numberPassengers;
  }//getNumberPassengers
  
  /* getNumberCrew - This method will return the
   * number of crew on the airplane as an int.
   */
  public int getNumberCrew()
  {
    return numberCrew;
  }//getNumberCrew
  
  /* getCargoWeight - This method will return
   * the cargo weight in the airplane as an int.
   */
  public int getCargoWeight()
  {
    return cargoWeight;
  }//getCargoWeight
  
  /* getKmToDestination - This method will 
   * return the kmToDestination as an int.
   */
  public int getKmToDestination()
  {
    return kmToDestination;
  }//getKmToDestination
  
  /* getTicketCost - This method will return 
   * the ticket cost for a seat on the airplane
   * as a double.
   */
  public double getTicketCost()
  {
    return ticketCost;
  }//getTicketcost
  
  /* getTripOrigin - This method will return the tripOrigin
   * of the airplane as a String
   */
  public String getTripOrigin()
  {
    return tripOrigin;
  }//getTripOrigin
  
  /* getDestination - This method will return the destination
   * of the airplane as a String.
   */
  public String getDestination()
  {
    return destination;
  }//getDestination
  
  /* toString - This method will return a 
   * String of the airplane information.
   */
  public String toString()
  {
    String stringReturn = null; 
    
    //Airplane info
    stringReturn = "Airline: "+airline+"\n";
    stringReturn += "Departing From: "+tripOrigin+" Arriving: "+destination+"\n";
    stringReturn += "Passengers: "+numberPassengers+" Crew: "+numberCrew+"\n";
    stringReturn += "Cargo Weight: "+cargoWeight+" Distance to Destination: "+kmToDestination+"km"+"\n";
    stringReturn += String.format("Cost of Ticket: $%4.2f",ticketCost)+"\n";
    
    return stringReturn;
  }//tostring
  
  /* addPassenger - This method will add a passenger to
   * the flight. This method will add a passenger object
   * that already exists to the peopleOnBoard list. 
   */
  public void addPassenger(Passenger toBeAdded)
  {
    //Add to list
    peopleOnBoard.add(toBeAdded);
    
    //Increase
    numberPassengers++;
  }//addPassenger
  
  /* addPassenger - This method will add a passenger to
   * the flight. This method will add a newly created
   * passenger object to the peopleOnBoard list. 
   */
  public void addPassenger(String firstName, String lastName, String nationality, String tripOrigin, String destination, int age)
  {
    //Add to list
    peopleOnBoard.add(new Passenger(firstName, lastName, nationality, tripOrigin, destination, age));
    
    //Increase
    numberPassengers++;
  }//addPassenger
  
  /* passengerManifest - This method will return the
   * passenger manifest holding all of the names of thoes
   * on the flight. The names will be returned as a String.
   */
  public String passengerManifest()
  {
    String toReturn = "";
    for(int i=0;i<peopleOnBoard.size()-1;i++)
    {
      toReturn+=peopleOnBoard.get(i).getPassengerName()+"\n";
    }//for
     toReturn+=peopleOnBoard.get(peopleOnBoard.size()-1).getPassengerName();
    return toReturn;
  }//passengerManifest
  
  /* addCargo - This method will allow
   * Cargo to be added to the Airplane
   * as long as it will not be over the 
   * MAX_WEIGHT.
   */
  public void addCargo(Cargo toAdd)
  {
    try
    {
      //Check to make sure there is space on the flight for the cargo
      cargoCheck(toAdd);
      
      //If there is space add the cargo to the flight
      cargoOnBoard.add(toAdd);
      cargoWeight += toAdd.getWeight();
    }catch(OverFlightWeightException e)
    {
      System.out.println(e.getMessage());
    }//try-catch
  }//addCargo
  
  /* cargoCheck - This method will check to make
   * sure that the weight of the current and new
   * cargo will not go over MAX_WEIGHT. If this
   * is the case an OverFlightWeightException will
   * be thrown.
   */
  private void cargoCheck(Cargo toAdd) throws OverFlightWeightException 
  {
    if((cargoWeight+toAdd.getWeight())>MAX_WEIGHT)
    {
      throw new OverFlightWeightException("WEIGHT: "+cargoWeight+toAdd.getWeight()+" MAX WEIGHT: "+MAX_WEIGHT);
    }
  }//cargoCheck
}//Airplane