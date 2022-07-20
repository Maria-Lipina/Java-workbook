package UndergroundSystemMine; //легкая разминка, которая не является решением задачи в readme

import java.util.ArrayList;
import java.util.List;

public class Program {

  Client client;
  static List<String> stations = List.of("Station1", "Station2", "Station3", "Station4"); //Вместо отдельных объектов Stations, которые могли бы инициировать запрос к серверу, а значит базе records на регистрацию клиента и времени его входа
  Trip trip;
  static ArrayList<Trip> records = new ArrayList<>(); //вместо базы данных, которая могла б быть использована для этой цели в реальной жизни

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
