package scenario_based.collection.Ocean_Feet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId) {
        for (Vessel v : vesselList) {
            if (v.getVesselId().equals(vesselId)) {
                return v;
            }
        }
        return null;
    }


    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> highPerformanceList = new ArrayList<>();

        if (vesselList.isEmpty()) {
            return highPerformanceList;
        }

        double maxSpeed = vesselList.get(0).getAverageSpeed();

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() > maxSpeed) {
                maxSpeed = v.getAverageSpeed();
            }
        }

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() == maxSpeed) {
                highPerformanceList.add(v);
            }
        }

        return highPerformanceList;
    }
}
