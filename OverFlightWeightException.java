/* 
 * OverFlightWeightException
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 25, 2021
 * 
 * PURPOSE: This class will implment an
 * OverFlightWeightException. It will 
 * extend the class Exception.
 */

public class OverFlightWeightException extends Exception
{
  /* Constructor - This constructor will accept the String parameter
   * message which it will pass when it calls the super constructor.
   */
  public OverFlightWeightException(String message)
  {
    super(message);
  }//Constructor
}//OverFlightWeightException