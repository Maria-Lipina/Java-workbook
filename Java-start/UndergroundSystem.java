import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    Map<Integer, Client> passengerMap;
    Map<String, Route> routeMap;
    
    public UndergroundSystem() {
        this.passengerMap = new HashMap<>();
        this.routeMap = new HashMap<>();
    }
    
    class Client {
        private String stationIn;
        private int timeIn;

    Client(String stationIn, int timeIn) {
        this.stationIn = stationIn;
        this.timeIn = timeIn;
    }

    public String getStationIn() {
        return stationIn;
    }

    public int getTimeIn() {
    return timeIn;
    }
    }
    
    class Route {
    private int totalTime;
    private int count;

    public double getAvgTime() {
        return 1.0 * totalTime / count;
    }

    public void addTime(int t) {
        totalTime +=t;
        count +=1;
    }
    }
    
    public void checkIn(int id, String stationName, int t) {
         passengerMap.put(id, new Client(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Client client = passengerMap.get(id);
        String routeKey = getRoute(client.getStationIn(), stationName);
        routeMap.putIfAbsent(routeKey, new Route());
        routeMap.get(routeKey).addTime(t - client.getTimeIn());    
    }
    
    public double getAverageTime(String startStation, String endStation) {
        return routeMap.get(getRoute(startStation, endStation)).getAvgTime();
    }

    private String getRoute(String stationFrom, String stationTo) {
        return stationFrom + "-" + stationTo;
}

}

