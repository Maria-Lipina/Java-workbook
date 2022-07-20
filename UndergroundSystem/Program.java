package UndergroundSystem;

import java.util.ArrayList;
import java.util.List;

public class Program {

  Client client;
  static List<String> stations = List.of("Station1", "Station2", "Station3", "Station4");
  Trip trip;
  static ArrayList<Trip> records = new ArrayList<>();

  public static void main(String[] args) {

    for (int i = 0; i < 20; i++) {
      Client c = new Client(999);
      records.add(new Trip(c));
      records.get(records.size()-1).getInfo();
      System.out.println("\n----\n");
    }

    System.out.print("Average: " + Trip.getAverageTime("Station1", "Station2"));
  }

}
