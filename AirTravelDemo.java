/*
 * AirTravelDemo
 * 
 * Name:    Kate Walley
 * PROJECT: AirTravel
 * DATE:    August 26, 2021
 * 
 * PURPOSE: This class will demo 
 * the objects Airport, Airplane,
 * Cargo, Passenger and LiveCargo.
 */

public class AirTravelDemo
{
  public static void main(String[] agrs)
  {
    //Airport
    Airport airport = new Airport(15,"YYZ");
    //Planes
    Airplane airplane1 = new Airplane("Air Canada", 12, 3501, 347, "Toronto", "Los Angeles");
    Airplane airplane2 = new Airplane("Air Canada", 15, 6340, 609, "Toronto", "Frankfurt");
    Airplane airplane3 = new Airplane("American Airlines", 10, 1930, 539, "Toronto", "Dallas");
    Airplane airplane4 = new Airplane("Air Canada", 17, 12542, 1663, "Toronto", "Hong Kong");
    Airplane airplane5 = new Airplane("Air Canada", 13, 10855, 1290, "Toronto", "Doha");
    //Passengers
    Passenger passenger1 = new Passenger("Jane", "Green", "Canadian", "Toronto", "Los Angeles", 36);
    Passenger passenger2 = new Passenger("Maria", "Sousa", "Canadian", "Brazilian ", "Los Angeles", 51);
    Passenger passenger3 = new Passenger("Rajshree", "Devi", "Canadian", "Toronto", "Los Angeles", 24);
    Passenger passenger4 = new Passenger("Ivan", "Fedorov", "Russian", "Toronto", "Los Angeles", 44);
    Passenger passenger5 = new Passenger("Noah", "Smith", "Canadian", "Toronto", "Los Angeles", 27);
    Passenger passenger6 = new Passenger("Karl", "Vogel", "German", "Toronto", "Frankfurt", 56);
    Passenger passenger7 = new Passenger("Zofia", "Sienkiewicz ", "Polish", "Toronto", "Frankfurt", 25);
    Passenger passenger8 = new Passenger("Jack", "Penner", "Canadian", "Toronto", "Frankfurt", 67);
    Passenger passenger9 = new Passenger("Mila", "Schmidt", "German", "Toronto", "Frankfurt", 19);
    Passenger passenger10 = new Passenger("Oscar", "Morris", "American", "Toronto", "Frankfurt", 47);
    Passenger passenger11 = new Passenger("Lewis", "Jansen", "Dutch", "Toronto", "Frankfurt", 56);
    Passenger passenger12 = new Passenger("Emmanuel","Abubakar","Canadian","Toronto","Dallas",34);
    Passenger passenger13 = new Passenger("Eliza","Davies","American","Toronto","Dallas",78);
    Passenger passenger14 = new Passenger("Dean","Jones","Canadian","Toronto","Dallas",62);
    Passenger passenger15 = new Passenger("Zack","Martin","Canadian","Toronto","Dallas",21);
    Passenger passenger16 = new Passenger("Ayane","Hattori","Japanese","Toronto","Dallas",37);
    Passenger passenger17 = new Passenger("Genna","Tremblay","Canadian","Toronto","Dallas",50);
    Passenger passenger18 = new Passenger("Zoe","Jarvis","Canadian","Toronto","Hong Kong",20);
    Passenger passenger19 = new Passenger("Kyle","Lee","Canadian","Toronto","Hong Kong",25);
    Passenger passenger20 = new Passenger("Meijuan","Lin","Chinese","Toronto","Hong Kong",46);
    Passenger passenger21 = new Passenger("Emmy","Ryan","Irish","Toronto","Hong Kong",23);
    Passenger passenger22 = new Passenger("Gabriele","Favoni","Italian","Toronto","Hong Kong",46);
    Passenger passenger23 = new Passenger("Jian","Zhao","Chinese","Toronto","Hong Kong",54);
    Passenger passenger24 = new Passenger("Peizhi","Du","Chinese","Toronto","Hong Kong",87);
    Passenger passenger25 = new Passenger("Farah","Hosseini","Canadian","Toronto","Hong Kong",33);
    Passenger passenger26 = new Passenger("Olivia","Ruiz","Canadian","Toronto","Doha",4);
    Passenger passenger27 = new Passenger("Andrea","Ruiz","Canadian","Toronto","Doha",39);
    Passenger passenger28 = new Passenger("Fatima","Ali","Qataris","Toronto","Doha",23);
    Passenger passenger29 = new Passenger("Noora","Khan","Qataris","Toronto","Doha",55);
    Passenger passenger30 = new Passenger("Mike","Williams","Australian","Toronto","Doha",65);
    Passenger passenger31 = new Passenger("Luke","Miller","American","Toronto","Doha",33);
    Passenger passenger32 = new Passenger("Eve","Watson","Canadian","Toronto","Doha",41);
    //Cargo
    Cargo cargo1 = new Cargo("Baggage", 20000);
    Cargo cargo2 = new Cargo("Baggage", 25000);
    Cargo cargo3 = new Cargo("Baggage", 35000);
    Cargo cargo4 = new Cargo("Baggage", 45000);
    Cargo cargo5 = new Cargo("Mail", 5000);
    Cargo cargo6 = new Cargo("Mail", 10000);
    Cargo cargo7 = new Cargo("Mail",15000);
    Cargo cargo8 = new Cargo("Mail", 7000);
    //LiveCargo
    LiveCargo liveCargo1 = new LiveCargo("Live Cargo", 10, "Dog", "Pet");
    LiveCargo liveCargo2 = new LiveCargo("Live Cargo", 3, "Cat", "Pet");
    LiveCargo liveCargo3 = new LiveCargo("Live Cargo", 4, "Mice", "Medical Research");
    LiveCargo liveCargo4 = new LiveCargo("Live Cargo", 18, "Dog", "Pet");
    LiveCargo liveCargo5 = new LiveCargo("Live Cargo", 17, "Rabbits", "Medical Research");
    
    System.out.println(airport+"\n");
    try
    {
      airport.windSpeedCheck();
      System.out.println("Safe to take off");
    }catch(HighWindException e)
    {
      System.out.println(e.getMessage());
    }//try-catch
    airport.addAirplane(airplane1);
    System.out.println(airport.printPlaneList());
    airport.addAirplane(airplane2);
    System.out.println(airport.printPlaneList());
    airport.addAirplane(airplane3);
    System.out.println(airport.printPlaneList());
    airport.addAirplane(airplane4);
    System.out.println(airport.printPlaneList());
    airport.addAirplane(airplane5);
    System.out.println(airport.printPlaneList());
    
    airport.setWindSpeed(57);
    try
    {
      airport.windSpeedCheck();
      System.out.println("Safe to take off");
    }catch(HighWindException e)
    {
      System.out.println(e.getMessage());
    }//try-catch
    
    System.out.println("30 mins later - The wind has reduced.");
    airport.setWindSpeed(34);
    try
    {
      airport.windSpeedCheck();
      System.out.println("Safe to take off\n");
    }catch(HighWindException e)
    {
      System.out.println(e.getMessage());
    }//try-catch
    
    //Add Passengers to airplanes 
    airplane1.addPassenger(passenger1);
    airplane1.addPassenger(passenger2);
    airplane1.addPassenger(passenger3);
    airplane1.addPassenger(passenger4);
    airplane1.addPassenger(passenger5);
    airplane1.addPassenger("Jana", "Doe", "American", "Toronto", "Los Angeles", 23);
    System.out.print(airplane1);
    System.out.println("Passengers:\n"+airplane1.passengerManifest()+"\n");
    
    airplane2.addPassenger(passenger6);
    airplane2.addPassenger(passenger7);
    airplane2.addPassenger(passenger8);
    airplane2.addPassenger(passenger9);
    airplane2.addPassenger(passenger10);
    airplane2.addPassenger(passenger11);
    airplane2.addPassenger("Ellen", "Weber", "German", "Toronto", "Frankfurt", 18);
    System.out.print(airplane2);
    System.out.println("Passengers:\n"+airplane2.passengerManifest()+"\n");
    
    airplane3.addPassenger(passenger12);
    airplane3.addPassenger(passenger13);
    airplane3.addPassenger(passenger14);
    airplane3.addPassenger(passenger15);
    airplane3.addPassenger(passenger16);
    airplane3.addPassenger(passenger17);
    System.out.print(airplane3);
    System.out.println("Passengers:\n"+airplane3.passengerManifest()+"\n");
    
    airplane4.addPassenger(passenger18);
    airplane4.addPassenger(passenger19);
    airplane4.addPassenger(passenger20);
    airplane4.addPassenger(passenger21);
    airplane4.addPassenger(passenger22);
    airplane4.addPassenger(passenger23);
    airplane4.addPassenger(passenger24);
    airplane4.addPassenger(passenger25);
    System.out.print(airplane4);
    System.out.println("Passengers:\n"+airplane4.passengerManifest()+"\n");
    

  }//main
}//AirTravelDemo