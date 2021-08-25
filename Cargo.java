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
  
  /* toString - This method will return the cargo
   * information as a String.
   */
  public String toString()
  {
    return "Cargo Type: "+type+"\nWeights: "+weight+"kg";
  }//toString
  
  /* getWeight - This method will return the 
   * weight of the cargo as an int. 
   */
  public int getWeight()
  {
    return weight;
  }//getWeight
}//Cargo