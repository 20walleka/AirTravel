/*
 * LiveCargo
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 24, 2021
 * 
 * PURPOSE: This class will hold
 * information about LiveCargo on
 * the plane.
 */

public class LiveCargo extends Cargo
{
  //Instance Variables
  private String species;
  private String transportPurpose;
  
  /* Constructor - This constructor will be passed the parameters
   * species and transportPurpose. These parameters will be used
   * to set the values of instance variables.
   */
  public LiveCargo(String type, int weight, String species, String transportPurpose)
  {
    //Call the super constructor 
    super(type, weight);
    
    //Set Instance Variables
    this.species = species;
    this.transportPurpose = transportPurpose;
  }//LiveCargo
}//LiveCargo