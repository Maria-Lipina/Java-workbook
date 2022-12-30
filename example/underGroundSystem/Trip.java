package example.underGroundSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trip {
    int timeIn;
    int timeOut;
    List<String> route;
    private Random rt = new Random();

    public Trip(Client c) {
        route = new ArrayList<>();
        timeIn = c.CheckIn();
        route.add(Program.stations.get(rt.nextInt(Program.stations.size() - 2)));
        timeOut = c.CheckOut();
        route.add(Program.stations.get(rt.nextInt(Program.stations.size() - 2)));
    }

    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    public void getInfo() {
         System.out.printf("timeIn - %d;\nstationIn  - %s;\ntimeOut - %d;\nstationOut  - %s;", timeIn, route.get(0), timeOut, route.get(1));
    }

    public static int getAverageTime(String startStation, String endStation) {
        int count = 0;
        int wholeTime = 0;
        for (Trip trip : Program.records) {
            if (trip.getRoute().get(0) == startStation
            && trip.getRoute().get(1) == endStation) {
                count++;
                wholeTime = wholeTime + (trip.getTimeOut() - trip.getTimeIn());
            }
        }
        return wholeTime / count;
    }
}
