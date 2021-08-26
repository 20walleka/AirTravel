/* 
 * HighWindException
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 26, 2021
 * 
 * PURPOSE: This class will implment an
 * HighWindException. It will 
 * extend the class Exception.
 */

public class HighWindException extends Exception
{
  /* Constructor - This constructor will accept the String parameter
   * message which it will pass when it calls the super constructor.
   */
  public HighWindException(String message)
  {
    super(message);
  }//Constructor
}//HighWindExceptionn