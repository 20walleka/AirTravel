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
  private int ticketCost;
  private ArrayList<Passenger> peopleOnBoard;
  
}//Airplane