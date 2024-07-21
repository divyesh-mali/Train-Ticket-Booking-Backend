package ticket.booking.entities;

import java.util.*;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private List<String> stations;
    private Map<String, String> stationTimes;

    public Train() {}

    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stations = stations;
        this.stationTimes = stationTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    public void getSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public String getTrainId() {
        return trainId;
    }

    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public void setStationTimes(Map<String, String> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getTrainInfo() {
        return String.format("Train ID: %s TrainNo: %s", trainId, trainNo);
    }

}
