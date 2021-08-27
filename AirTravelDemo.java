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
    private Airport airport = new Airport(15,"YYZ");
    //Planes
    private Airplane airplane1 = new Airplane("Air Canada", 12, 3501, 347, "Toronto", "Los Angeles");
    private Airplane airplane2 = new Airplane("Air Canada", 15, 6340, 609, "Toronto", "Frankfurt");
    private Airplane airplane3 = new Airplane("American Airlines", 10, 1930, 539, "Toronto", "Dallas");
    private Airplane airplane4 = new Airplane("Air Canada", 17, 12542, 1663, "Toronto", "Hong Kong");
    private Airplane airplane5 = new Airplane("Air Canada", 13, 10855, 1290, "Toronto", "Doha");
    //Passengers
    private Passenger passenger1 = new Passenger("Jane", "Green", "Canadian", "Toronto", "Los Angeles", 36);
    private Passenger passenger2 = new Passenger("Maria", "Sousa", "Canadian", "Brazilian ", "Los Angeles", 51);
    private Passenger passenger3 = new Passenger("Rajshree", "Devi", "Canadian", "Toronto", "Los Angeles", 24);
    private Passenger passenger4 = new Passenger("Ivan", "Fedorov", "Russian", "Toronto", "Los Angeles", 44);
    private Passenger passenger5 = new Passenger("Noah", "Smith", "Canadian", "Toronto", "Los Angeles", 27);
    private Passenger passenger6 = new Passenger("Karl", "Vogel", "German", "Toronto", "Frankfurt", 56);
    private Passenger passenger7 = new Passenger("Zofia", "Sienkiewicz ", "Polish", "Toronto", "Frankfurt", 25);
    private Passenger passenger8 = new Passenger("Jack", "Penner", "Canadian", "Toronto", "Frankfurt", 67);
    private Passenger passenger9 = new Passenger("Mila", "Schmidt", "German", "Toronto", "Frankfurt", 19);
    private Passenger passenger10 = new Passenger("Oscar", "Morris", "American", "Toronto", "Frankfurt", 47);
    private Passenger passenger11 = new Passenger("Lewis", "Jansen", "Dutch", "Toronto", "Frankfurt", 56);
    private Passenger passenger12 = new Passenger("Emmanuel","Abubakar","Canadian","Toronto","Dallas",34);
    private Passenger passenger13 = new Passenger("Eliza","Davies","American","Toronto","Dallas",78);
    private Passenger passenger14 = new Passenger("Dean","Jones","Canadian","Toronto","Dallas",62);
    private Passenger passenger15 = new Passenger("Zack","Martin","Canadian","Toronto","Dallas",21);
    private Passenger passenger16 = new Passenger("Ayane","Hattori","Japanese","Toronto","Dallas",37);
    private Passenger passenger17 = new Passenger("Genna","Tremblay","Canadian","Toronto","Dallas",50);
    private Passenger passenger18 = new Passenger("Zoe","Jarvis","Canadian","Toronto","Hong Kong",20);
    private Passenger passenger19 = new Passenger("Kyle","Lee","Canadian","Toronto","Hong Kong",25);
    private Passenger passenger20 = new Passenger("Meijuan","Lin","Chinese","Toronto","Hong Kong",46);
    private Passenger passenger21 = new Passenger("Emmy","Ryan","Irish","Toronto","Hong Kong",23);
    private Passenger passenger22 = new Passenger("Gabriele","Favoni","Italian","Toronto","Hong Kong",46);
    private Passenger passenger23 = new Passenger("Jian","Zhao","Chinese","Toronto","Hong Kong",54);
    private Passenger passenger24 = new Passenger("Peizhi","Du","Chinese","Toronto","Hong Kong",87);
    private Passenger passenger25 = new Passenger("Farah","Hosseini","Canadian","Toronto","Hong Kong",33);
    private Passenger passenger26 = new Passenger("Olivia","Ruiz","Canadian","Toronto","Doha",4);
    private Passenger passenger27 = new Passenger("Andrea","Ruiz","Canadian","Toronto","Doha",39);
    private Passenger passenger28 = new Passenger("Fatima","Ali","Qataris","Toronto","Doha",23);
    private Passenger passenger29 = new Passenger("Noora","Khan","Qataris","Toronto","Doha",55);
    private Passenger passenger30 = new Passenger("Mike","Williams","Australian","Toronto","Doha",65);
    private Passenger passenger31 = new Passenger("Luke","Miller","American","Toronto","Doha",33);
    private Passenger passenger32 = new Passenger("Eve","Watson","Canadian","Toronto","Doha",41);
    //Cargo
    private Cargo cargo1 = new Cargo("Baggage", 20000);
    private Cargo cargo2 = new Cargo("Baggage", 25000);
    private Cargo cargo3 = new Cargo("Baggage", 35000);
    private Cargo cargo4 = new Cargo("Baggage", 45000);
    private Cargo cargo5 = new Cargo("Mail", 5000);
    private Cargo cargo6 = new Cargo("Mail", 10000);
    private Cargo cargo7 = new Cargo("Mail",15000);
    private Cargo cargo8 = new Cargo("Mail", 7000);
    //LiveCargo
    private LiveCargo liveCargo1 = new LiveCargo("Live Cargo", 10, "Dog", "Pet");
    private LiveCargo liveCargo2 = new LiveCargo("Live Cargo", 3, "Cat", "Pet");
    private LiveCargo liveCargo3 = new LiveCargo("Live Cargo", 4, "Mice", "Medical Research");
    private LiveCargo liveCargo4 = new LiveCargo("Live Cargo", 18, "Dog", "Pet");
    private LiveCargo liveCargo5 = new LiveCargo("Live Cargo", 17, "Rabbits", "Medical Research");
  }//main
}//AirTravelDemo