/*
 * Cargo
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 24, 2021
 * 
 * PURPOSE: This class will hold
 * information about the Cargo in
 * the airplane.
 */

public class Cargo
{
  //Instance Variables
  private String type;
  private int weight;
  
  /* Constructor - This constructor will be passed the parameters
   * type and weight. These parameters will be used
   * to set the values of instance variables.
   */
  public Cargo(String type, int weight)
  {
    this.type = type;
    this.weight = weight;
  }//Cargo
}//Cargo